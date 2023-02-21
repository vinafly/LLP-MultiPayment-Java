package com.lianlianpay.openapi.mch.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 支付订单关闭 请求参数
 */
@Data
@EqualsAndHashCode
public class OrderCloseParams {
    private String mch_id;
    private String txn_seqno;
    private String platform_txno;
    private String txn_date;
}
