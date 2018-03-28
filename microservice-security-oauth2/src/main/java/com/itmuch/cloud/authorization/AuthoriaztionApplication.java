package com.itmuch.cloud.authorization;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhuwj
 * @version V1.0
 * @Description:  授权服务启动入口
 * @date 2018/1/21.
 */

@SpringBootApplication
//@EnableEurekaClient
@MapperScan("com.itmuch.cloud.authorization.dao")
public class AuthoriaztionApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthoriaztionApplication.class, args);
    }
}
