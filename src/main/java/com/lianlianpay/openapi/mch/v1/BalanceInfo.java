package com.lianlianpay.openapi.mch.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class BalanceInfo {
    // 余额支付userid
    private String user_id;
    /*
    用户类型：
    商户：MCH
    用户：USER
     */
    private String user_type;
    // 支付密码，余额支付默认需要支付密码
    private String password;
    // 密码随机因子key
    private String random_key;
}
