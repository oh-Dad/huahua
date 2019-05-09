package com.huahua.search;

import huahua.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/19
 * \* Time: 16:46
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@SpringBootApplication
public class SearchApplicaption {

    public static void main(String[] args) {
        SpringApplication.run(SearchApplicaption.class,args);

    }
    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }
}
