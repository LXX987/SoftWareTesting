package com.huaqi.zhanxin.controller;

import com.huaqi.zhanxin.entity.Asset;
import com.huaqi.zhanxin.entity.RestControllerHelper;
import com.huaqi.zhanxin.entity.UserInfo;
import com.huaqi.zhanxin.service.AssetService;
import com.huaqi.zhanxin.service.CreditService;
import com.huaqi.zhanxin.service.UserService;
import com.huaqi.zhanxin.tools.GetInformationFromRequest;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("asset")
public class AssetController {
    @Autowired
    private AssetService assetService;
    @Autowired
    private CreditService creditService;
    RestControllerHelper helper = new RestControllerHelper();
    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取资产列表")
    @GetMapping("assetList")
    public List<Asset> userList(HttpServletRequest request) {
        GetInformationFromRequest getInfo = new GetInformationFromRequest(request);
        int userID = getInfo.getUserId();
        List<Asset> assetList = assetService.assetList(userID);

        return assetService.assetList(userID);
    }

    @ApiOperation(value = "插入银行账户")
    @PostMapping("insertAsset")
    public Map<String, Object> insertAsset(HttpServletRequest request, String bank,@RequestParam(value = "money", defaultValue = "-1")  int money) {
        GetInformationFromRequest getInfo = new GetInformationFromRequest(request);
        int userID = getInfo.getUserId();
        Map<String, Object> map = new HashMap<>();
        if (StringUtils.isEmpty(bank)) {
            map.put("msg", "关键数据缺失");
            return map;
        }
        //修改
        if (money<=0) {
            map.put("msg", "钱数错误");
            return map;
        }
        //修改结束
        Timestamp d = new Timestamp(System.currentTimeMillis());
        System.out.println(d);
        System.out.println(bank);
        System.out.println(money);
        System.out.println(userID);
        assetService.insertAsset(userID, bank, money, d);
        map.put("msg", "添加成功");
        helper.setMsg("Success");
        helper.setData(map);
        return helper.toJsonMap();
    }

    @ApiOperation(value = "获取资产钱数")
    @GetMapping("getMoney")
    public Map<String, Object> getMoney(HttpServletRequest request) {
        GetInformationFromRequest getInfo = new GetInformationFromRequest(request);
        int userID = getInfo.getUserId();
        Map<String, Object> map = new HashMap<>();
        //修改
        if (assetService.getMoney(userID)==-1) {
            map.put("msg", "暂无数据");
            return map;
        }
        // 修改结束
        int money = assetService.getMoney(userID);
        System.out.println(money);


        // 获取年收入
        UserInfo userInfo = userService.getInfo(userID);
        // 计算资产得分
        int assetScore = countAsset(money, userInfo.getAnnualIncome());
        // 更新数据库
        creditService.updateAssetScore(assetScore, userID);
        //System.out.println(userInfo.getAnnualIncome());
        System.out.println(assetScore);
        map.put("money", money);
        helper.setMsg("Success");
        helper.setData(map);
        return helper.toJsonMap();
    }

    @ApiOperation(value = "删除银行账户")
    @PostMapping("deleteAsset")
    public Map<String, Object> deleteAsset(HttpServletRequest request, @RequestParam(value = "addTime", defaultValue = "0000-00-00 00:00:00") Timestamp addTime) {
        GetInformationFromRequest getInfo = new GetInformationFromRequest(request);
        int userID = getInfo.getUserId();
        Map<String, Object> map = new HashMap<>();
        //修改
        String strn = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(addTime);
        if (strn.equals("0000-00-00 00:00:00")) {
            map.put("msg", "关键数据缺失");
            return map;
        }
        //修改结束
        int n = assetService.deleteAsset(userID, addTime);
        if (n==0) {
            map.put("msg", "数据错误");
        } else {
            map.put("msg", "删除成功");
        }
        helper.setMsg("Success");
        helper.setData(map);
        return helper.toJsonMap();
    }

    @ApiOperation(value = "管理银行账户")
    @PostMapping("updateAsset")
    public Map<String, Object> updateAsset(HttpServletRequest request, String bank, @RequestParam(value = "money", defaultValue = "-1") int money, @RequestParam(value = "addTime", defaultValue = "0000-00-00 00:00:00") Timestamp addTime) {
        GetInformationFromRequest getInfo = new GetInformationFromRequest(request);
        int userID = getInfo.getUserId();
        Map<String, Object> map = new HashMap<>();
        //修改
        String strn = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(addTime);
        if (StringUtils.isEmpty(bank) || strn.equals("0000-00-00 00:00:00")) {
            map.put("msg", "关键数据缺失");
            return map;
        }
        if (money<=0) {
            map.put("msg", "钱数错误");
            return map;
        }
        //修改结束
        int n = assetService.updateAsset(userID, bank, money, addTime);
        if (n==0) {
            map.put("msg", "数据错误");
        } else {
            map.put("msg", "编辑成功");
        }
        helper.setMsg("Success");
        helper.setData(map);
        return helper.toJsonMap();
    }

    /**
     * 计算资产得分
     */
    public int countAsset(int money, float annual_income) {
        double k2 = 0.01;
        double k1 = 0.001;
        double moneyScore, incomeScore;
        int accountScore;
        if (annual_income >= 100000) {
            incomeScore = 100;
        } else {
            incomeScore = annual_income * k2;
        }
        if (money >= 0000) {
            moneyScore = 100;
        } else {
            moneyScore = money*k1;
        }
        System.out.println(moneyScore);
        System.out.println(incomeScore);
        accountScore = (int) (moneyScore * 0.73 + incomeScore * 0.27);
        return accountScore;
    }
}
