package com.lianlianpay.openapi.query.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 收款查询 响应参数
 */
@Data
@EqualsAndHashCode
public class OrderQueryResult {
    // 交易结果代码
    private String ret_code;
    // 交易结果描述
    private String ret_msg;
    // 商户编号
    private String mch_id;
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
    // 商户支付订单时间
    private String txn_time;
    // 商户支付订单号
    private String txn_seqno;
    // 平台支付订单号
    private String platform_txno;
    // 订单金额，该笔订单的资金总额
    private String order_amount;
    /*
    支付结果：
    成功：SUCCESS
    失败：FAILURE
    处理中：PROCESSING
     */
    private String txn_status;
    // 账务日期
    private String account_date;
    // 交易手续费
    private Double fee_amount;
    // 渠道订单号
    private String chnl_txno;
    // 上游渠道请求流水号
    private String chnl_req_serialId;
    // 拓展信息
    private String extend_info;
    // 分账信息
    private ShareInfo share_info;
    // 付款信息
    private PayInfo pay_info;

}
