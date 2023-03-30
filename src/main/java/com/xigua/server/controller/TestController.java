package com.xigua.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoliu
 */
@RequestMapping("/test")
@RestController
@Slf4j
public class TestController {

    @RequestMapping("")
    public Object test() {
        return "ok";
    }

    @RequestMapping("/hello")
    public Object hello(String name) {
        if (StringUtils.isBlank(name)) {
            log.error("test hello error: {}", System.currentTimeMillis());
            throw new IllegalArgumentException("name not null");
        }
        log.info("name is : {},{}", name, System.currentTimeMillis());
        return "hello," + name;
    }

}
