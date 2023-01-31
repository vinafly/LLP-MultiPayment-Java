package com.lianlianpay.openapi.demo;

import com.alibaba.fastjson.JSON;
import com.lianlianpay.openapi.client.LLianPayClient;
import com.lianlianpay.openapi.config.LLianPayConstant;
import com.lianlianpay.openapi.query.v1.OrderQueryParams;
import com.lianlianpay.openapi.query.v1.OrderQueryResult;

/**
 * 收款查询 Demo
 */
public class OrderQueryDemo {
    public static void main(String[] args) {
        OrderQueryParams params = new OrderQueryParams();
        params.setMch_id(LLianPayConstant.MCHID);
        params.setTxn_seqno("230113119550798456");

        String url = "https://openapi.lianlianpay.com/query/v1/ipay/orderquery";
        LLianPayClient lLianPayClient = new LLianPayClient();
        String resultJsonStr = lLianPayClient.sendRequest(url, JSON.toJSONString(params));
        OrderQueryResult orderQueryResult = JSON.parseObject(resultJsonStr, OrderQueryResult.class);
        System.out.println(orderQueryResult);
    }
}
