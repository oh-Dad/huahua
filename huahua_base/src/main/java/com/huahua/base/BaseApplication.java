package com.huahua.base;

import huahua.common.utils.IdWorker;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/11
 * \* Time: 14:11
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@SpringBootApplication
@MapperScan("com.huahua.base.mapper")
@EnableEurekaClient
public class BaseApplication {




    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class,args);
    }


    @Bean
    public IdWorker idWorker(){

        return  new IdWorker(1,1);
    }



}
