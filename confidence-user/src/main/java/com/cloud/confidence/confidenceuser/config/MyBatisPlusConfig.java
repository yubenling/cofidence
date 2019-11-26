package com.cloud.confidence.confidenceuser.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*
 *@create yubenling
 *@date  2019/11/26
 *@desc  */
@EnableTransactionManagement
@Configuration
@MapperScan("com.cloud.confidence.confidenceuser.dao")
public class MyBatisPlusConfig {

    // mybatis-plus分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
