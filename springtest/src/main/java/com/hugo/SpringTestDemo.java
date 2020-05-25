package com.hugo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.hugo.mapper")
public class SpringTestDemo {

    public static void main(String[] args) {

        SpringApplication.run(SpringTestDemo.class, args);

    }

}
