package com.lianlianpay.openapi.mch.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class RiskInfo {
    // 交易IP地址
    private String ip_addr;
    // 经度信息
    private String longitude;
    // 纬度信息
    private String latitude;
    // 基站地址
    private String cell_id;
}
