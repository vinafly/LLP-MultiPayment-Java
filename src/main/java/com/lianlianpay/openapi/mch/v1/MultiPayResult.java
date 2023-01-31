package com.lianlianpay.openapi.mch.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 网关支付-统一创单
 * 快捷支付申请
 * 网银支付 响应参数
 */
@Data
@EqualsAndHashCode
public class MultiPayResult {
    // 交易结果代码
    private String ret_code;
    // 交易结果描述
    private String ret_msg;
    // 商户编号
    private String mch_id;
    // 商户支付订单号
    private String txn_seqno;
    // 平台支付订单号
    private String platform_txno;
    // 订单金额，该笔订单的资金总额
    private String order_amount;
    // 支付信息
    private String payload;
    // 二次验证token
    private String token;
    // 账务日期
    private String account_date;
}
