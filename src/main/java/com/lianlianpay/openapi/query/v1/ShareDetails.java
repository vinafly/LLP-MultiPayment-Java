package com.lianlianpay.openapi.query.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class ShareDetails {
    // 分账方用户id
    private String share_uid;
    // 分账金额
    private Double share_amount;
    // 分账比例
    private String share_percent;
    // 分账说明
    private String share_memo;
}
