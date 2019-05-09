package com.huahua.friend.eureka;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/5/5
 * \* Time: 14:56
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@FeignClient("huahua-user")
public interface UserEureka {

    /**
     * 增加粉丝数
     */
    @PostMapping(value = "/user/incfans/{userid}/{num}")
    public void incfansCount(@PathVariable("userid") String userid,@PathVariable("num") Integer num);

    /**
     *增加关注数(huahua-friend)
     */
    @PostMapping(value = "/user/incfollow/{userid}/{num}")
    public void incfollowCount(@PathVariable("userid") String userid,@PathVariable("num") Integer num);
}
