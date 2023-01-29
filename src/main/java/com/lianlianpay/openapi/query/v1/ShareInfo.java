package com.lianlianpay.openapi.query.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode
public class ShareInfo {
    /*
    分账标识：
    IMMEDIATE 即时分账
    DELAY 延迟分账
     */
    private String share_flag;
    // 分账类型
    private String share_type;
    // 分账详情share_list（返回list）
    private List<ShareDetails> share_list;
}
