package com.huahua.sms;

import com.huahua.sms.send.SmsSendCode;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/24
 * \* Time: 20:03
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Component
@RabbitListener(queues = "sms")
public class SmsSend {

    /**
     * 拿去配置文件的配置信息
     */
    @Value("${api.send.AppCode}")
    public String appCode;

    @Value("${api.send.tplid}")
    public String tplid;

    /**
     * 发送短信
     */
    @RabbitHandler
    public void sendSms(Map<String,String> map){
        System.out.println("手机号:"+map.get("mobile"));
        System.out.println("验证码:"+map.get("code"));
       // System.out.println("模拟--验证码发送成功");
        SmsSendCode.sendCode(appCode,map.get("mobile"),tplid,map.get("code"));
       // SmsSendCode.sendCode(map.get("code"));

    }
}
