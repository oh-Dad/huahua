package com.huahua.qa.eureka;

import huahua.common.Result;
import huahua.common.StatusCode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/29
 * \* Time: 10:34
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
//调用的是哪一个微服务
@FeignClient(value = "huahua-base",fallback = LabelClientImpl.class)
public interface LableEureka {

    //value要学全路径
    @RequestMapping(method = RequestMethod.GET,value = "/label/{labelId}")
    public Result queryById(@PathVariable("labelId") String labelId);
}
