package com.sys;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Create by yang_zzu on 2020/4/14 on 15:16
 */
@SpringBootApplication(scanBasePackages = "com.sys")
@EnableScheduling
@EnableEncryptableProperties
public class greeYangZZUApplication extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(greeYangZZUApplication.class, args);
    }
}
