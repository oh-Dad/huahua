package com.huahua.base.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/5/5
 * \* Time: 20:06
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RefreshScope
@RestController
public class TestController {
    @Value("${sms.ip}")
    private String ip;

    @RequestMapping(value = "/ip",method = RequestMethod.GET)
    public String ip(){
        return ip;
    }
}
