package com.huaqi.zhanxin.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "user信誉证明")
public class HonestyProof {
    private Integer userID;
    private Integer bloodDonation;
    private Double volunteer;
    private Double contribution;
    private Boolean criminal;
    private Integer phoneCost;
}
