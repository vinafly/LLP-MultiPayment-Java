package com.lianlianpay.openapi.mch.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class PayMethodInfo {
    /*
    支付方式：
    微信APP：WECHAT_APP
    微信公众号：WECHAT_JSAPI
    微信扫码：WECHAT_NATIVE
    微信小程序：WECHAT_APPLET
    支付宝扫码：ALIPAY_NATIVE
    支付宝APP：ALIPAY_APP
    支付宝应用（小程序、生活号）：ALIPAY_APPLET
    数字人民币扫码：DC_NATIVE
    数字人民币APP：DC_APP
    POS收款：POS_NATIVE
    聚合码扫码：AGGREGATE_CODE
    静态码：STATIC_CODE
    个人网银：B2C_EBANK
    企业网银：B2B_EBANK
    云闪付APP：CLOUDPAY_APP
    快捷支付：QUICK_PAY
    微信付款码：WECHAT_MICROPAY
    支付宝付款码：ALIPAY_MICROPAY
    银联付款码：UNIONPAY_MICROPAY
    数字人民币付款码：DC_MICROPAY
    数字人民币子钱包支付：DC_SUBWALLET
     */
    private String pay_type;
    // 支付金额
    private String amount;
}
