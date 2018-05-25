package com.huxiaohui.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huxiaohui
 * @date 2018/5/24 上午9:11
 */
@SpringBootApplication
@RestController
public class ElasticSearchApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ElasticSearchApplication.class);
        application.run(args);
    }

    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "helloWorld";
    }
}
