package com.lianlianpay.openapi.mch.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class CardInfo {
    // 绑卡协议号
    private String agree_no;
    // 银行卡号，需加密传输，该字段与agree_no只需传一个
    private String card_no;
    /*
    证件类型：
    身份证：ID_CARD
     */
    private String id_type;
    // 证件号，需加密传输，该字段与agree_no只需传一个
    private String id_no;
    // 用户名称，需加密传输，该字段与agree_no只需传一个
    private String acct_name;
    // 银行预留手机号，需加密传输，该字段与agree_no只需传一个
    private String bind_phone;
}
