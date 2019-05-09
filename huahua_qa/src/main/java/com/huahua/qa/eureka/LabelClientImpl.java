package com.huahua.qa.eureka;

import huahua.common.Result;
import huahua.common.StatusCode;
import org.springframework.stereotype.Component;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/5/5
 * \* Time: 14:09
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Component
public class LabelClientImpl implements LableEureka {
    @Override
    public Result queryById(String labelId) {
        return new Result(false, StatusCode.ERROR,"熔断器启动了呢");
    }
}
