package com.lianlianpay.openapi.demo;

import com.alibaba.fastjson.JSON;
import com.lianlianpay.openapi.client.LLianPayClient;
import com.lianlianpay.openapi.config.LLianPayConstant;
import com.lianlianpay.openapi.mch.v1.GoodsInfo;
import com.lianlianpay.openapi.mch.v1.MultiPayParams;
import com.lianlianpay.openapi.mch.v1.MultiPayResult;
import com.lianlianpay.openapi.mch.v1.PayMethodInfo;
import com.lianlianpay.openapi.utils.LLianPayDateUtils;

/**
 * 网关支付-统一创单 Demo
 */
public class CreatePayDemo {
    public static void main(String[] args) {
        MultiPayParams params = new MultiPayParams();
        String timestamp = LLianPayDateUtils.getTimestamp();
        params.setMch_id(LLianPayConstant.MCHID);
        params.setUser_id("LLianPay-MP-Test-12345");
        params.setBusi_type("100001");
        params.setTxn_seqno("LLianPay-MP-" + timestamp);
        params.setTxn_time(timestamp);
        params.setOrder_amount(0.01);
        params.setNotify_url("https://test.lianlianpay/notify");
        params.setExtend_info("");

        PayMethodInfo payMethodInfo = new PayMethodInfo();
        // POS_NATIVE 可以用
        // STATIC_CODE 渠道不支持该支付方式
        // B2C_EBANK B2B_EBANK QUICK_PAY 商户支付权限不足
        // WECHAT_MICROPAY ALIPAY_MICROPAY UNIONPAY_MICROPAY 系统错误
        payMethodInfo.setPay_type("STATIC_CODE");
        payMethodInfo.setAmount("0.01");
        params.setPay_method_infos(new PayMethodInfo[]{payMethodInfo});

        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setGoods_id("1234");
        params.setGoods_info(new GoodsInfo[]{goodsInfo});

        String url = "https://openapi.lianlianpay.com/mch/v1/ipay/createpay";
        LLianPayClient lLianPayClient = new LLianPayClient();
        String resultJsonStr = lLianPayClient.sendRequest(url, JSON.toJSONString(params));
        MultiPayResult createPayResult = JSON.parseObject(resultJsonStr, MultiPayResult.class);
        System.out.println(createPayResult);
    }
}
