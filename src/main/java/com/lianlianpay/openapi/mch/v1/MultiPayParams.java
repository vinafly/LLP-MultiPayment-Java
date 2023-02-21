package com.lianlianpay.openapi.mch.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 网关支付-统一创单
 * 快捷支付申请
 * 网银支付 请求参数
 */
@Data
@EqualsAndHashCode
public class MultiPayParams extends BasicPayParams {
    // 担保交易标记，默认为false
    private String secured_flag;
    // 卡交易信息
    private CardInfo card_info;
    // 支付方式信息详情
    private PayMethodInfo[] pay_method_infos;
    // 余额支付信息详情
    private BalanceInfo balance_info;
}
