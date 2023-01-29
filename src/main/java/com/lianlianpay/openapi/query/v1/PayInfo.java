package com.lianlianpay.openapi.query.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class PayInfo {
    // 付款银行
    private String bank_code;
    /*
    付款方式：
    银行卡刷卡：BANK_PAY
    微信支付：WECHAT_PAY
    支付宝支付：ALI_PAY
    云闪付：UNION_PAY
    其他：OTHER
     */
    private String pay_mode;
    /*
    付款卡类型：
    借记卡：CREDIT_CARD
    信用卡：DEBIT_CARD
    其他：OTHER
     */
    private String card_type;
}
