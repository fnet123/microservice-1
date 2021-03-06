package com.hong.configserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by caihongwei on 16/3/28 上午10:07.
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigserverApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigserverApplication.class).web(true).run(args);
    }
}
