package com.huahua.sms.send;

import com.huahua.sms.utils.HttpUtils;
import org.apache.http.HttpResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/24
 * \* Time: 20:46
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class SmsSendCode {
    /**
     * 发送短信验证码
     */
    public static void sendCode(String appcode,String mobile,String tplId,String code) {
        String host = "http://dingxinyx.market.alicloudapi.com";
        String path = "/dx/marketSendSms";
        String method = "POST";
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("mobile", mobile);
        querys.put("param", "name:"+code);
        querys.put("tpl_id", tplId);
        Map<String, String> bodys = new HashMap<String, String>();


        try {

            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}