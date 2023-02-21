package com.lianlianpay.openapi.mch.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 条码支付-统一支付 请求参数
 */
@Data
@EqualsAndHashCode
public class DirectPayParams extends BasicPayParams{
    // 付款码，支付宝、微信用户付款码信息
    private String auth_code;
    /*
    支付方式：
    微信付款码：WECHAT_MICROPAY
    支付宝付款码：ALIPAY_MICROPAY
    银联付款码：UNIONPAY_MICROPAY
    数字人民币付款码：DC_MICROPAY
    数字人民币子钱包支付：DC_SUBWALLET
     */
    private String pay_type;
}
