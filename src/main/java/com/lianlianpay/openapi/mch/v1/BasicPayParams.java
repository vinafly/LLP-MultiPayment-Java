package com.lianlianpay.openapi.mch.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 收款接口（网关、条码、快捷、网银） 请求参数基类
 */
@Data
@EqualsAndHashCode
public class BasicPayParams {
    // 商户编号
    private String mch_id;
    // 子商户编号
    private String sub_mchid;
    // 用户id，用户唯一编号
    private String user_id;
    /*
    业务类型：
    100001 虚拟商品购买
    100002 实物商品租购
    100099 其他商家消费
     */
    private String busi_type;
    // 商户支付订单号
    private String txn_seqno;
    // 商户支付订单时间
    private String txn_time;
    // 订单金额，该笔订单除去余额和优惠券的资金总额
    private Double order_amount;
    // 订单描述
    private String order_info;
    // 订单有效时间，单位为分钟
    private String pay_expire;
    // 支付结果异步通知接收地址
    private String notify_url;
    /*
    分账标识：
    IMMEDIATE 即时分账
    DELAY 延迟分账
    注：默认即时分账；当上送标识为延迟分账，分账列表和分账类型可为空，目前暂只支持即时分账
     */
    private String share_flag;
    // 扩展信息
    private String extend_info;
    // 收款方信息
    private PayeeInfo[] payee_infos;
    // 商品信息详情
    private GoodsInfo[] goods_info;
    // 设备信息详情
    private DeviceInfo device_info;
    // 门店信息详情
    private StoreInfo store_info;
    // 风控信息详情
    private RiskInfo risk_info;
}
