package com.scorpios.gulimall.gateway.controller;


import com.scorpios.gulimall.common.utils.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/gateway")
@RestController
@RefreshScope
public class IndexController {

    @Value("${custom.hello:world}")
    private String hello;

    @RequestMapping("/test")
    public R test(){
        return R.ok().put("hello",hello);
    }

}
