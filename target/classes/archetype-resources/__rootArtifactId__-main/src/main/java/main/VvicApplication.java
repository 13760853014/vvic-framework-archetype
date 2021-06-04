/*
 * Copyright(c) VVIC Science & Technology Ltd.
 */
package ${package}.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <pre>
 * 系统启动类
 * </pre>
 *
 * @author zhouyi@vvic.com
 * @version 1.0.0
 * @date 2021/03/03 10:00
 */
@SpringBootApplication(scanBasePackages = {"${package}"})
@EnableEurekaClient
public class VvicApplication {
    public static void main(String[] args) {
        SpringApplication.run(VvicApplication.class, args);
    }
}