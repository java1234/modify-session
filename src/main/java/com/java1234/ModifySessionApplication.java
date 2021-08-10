package com.java1234;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @ServletComponentScan，自动扫描带有(@WebServlet, @WebFilter, and @WebListener)注解的类，完成注册
        */
@SpringBootApplication
@ServletComponentScan
public class ModifySessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModifySessionApplication.class, args);
    }

}
