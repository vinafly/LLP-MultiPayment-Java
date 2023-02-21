package com.lianlianpay.openapi.mch.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class PayeeInfo {
    // 收款方用户id
    private String payee_uid;
    /*
    收款方账户类型：
    用户账户：USEROWN
    平台商户自有资金账户：MCHOWN
    平台商户优惠券账户：MCHCOUPON
    平台商户手续费账户：MCHFEE
    平台商户担保账户：MCHASSURE
     */
    private String payee_accttype;
    /*
    收款方类型：
    商户：MCH
    用户：USER
     */
    private String payee_type;
    // 收款方金额
    private String payee_amount;
    // 收款方备注
    private String payee_memo;
}
