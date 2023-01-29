package com.lianlianpay.openapi.query.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 收款查询 请求参数
 */
@Data
@EqualsAndHashCode
public class OrderQueryParams {
    private String mch_id;
    private String txn_seqno;
    private String platform_txno;
    private String chnl_txno;
    private String chnl_req_serialId;
    private String txn_date;
}
