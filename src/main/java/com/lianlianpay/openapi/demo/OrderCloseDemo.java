package com.lianlianpay.openapi.demo;

import com.alibaba.fastjson.JSON;
import com.lianlianpay.openapi.client.LLianPayClient;
import com.lianlianpay.openapi.config.LLianPayConstant;
import com.lianlianpay.openapi.mch.v1.OrderCloseParams;

/**
 * 支付订单关闭 Demo
 */
public class OrderCloseDemo {
    public static void main(String[] args) {
        OrderCloseParams params = new OrderCloseParams();
        params.setMch_id(LLianPayConstant.MCHID);
        params.setTxn_seqno("LLianPay-MP-20230130105401");

        String url = "https://openapi.lianlianpay.com/mch/v1/ipay/close";
        LLianPayClient lLianPayClient = new LLianPayClient();
        String resultJsonStr = lLianPayClient.sendRequest(url, JSON.toJSONString(params));
        System.out.println(resultJsonStr);
    }
}
