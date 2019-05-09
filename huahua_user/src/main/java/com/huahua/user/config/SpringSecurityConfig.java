package com.huahua.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/25
 * \* Time: 18:34
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
//配置类的注解
    //WebSecurityConfigurerAdapter   拦截所有请求 按照类中的方法进行处理
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * authorizeRequest 所有Security全注解配置实现的开始  表示开始说明需要的权限
     *
     * antMatchers 拦截路径   permitAll任何权限都可以访问,直接放行
     *
     * anyRequest 所有请求  authenticated认证后才能访问
     *
     *  .and().csrf().disable();固定写法  表示使csrf拦截失效
     *
     *  csrf  网站攻击
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/**").permitAll()
                .anyRequest().authenticated()
                .and().csrf().disable();
    }
}
