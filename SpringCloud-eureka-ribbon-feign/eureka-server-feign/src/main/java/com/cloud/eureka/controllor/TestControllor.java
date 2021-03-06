package com.cloud.eureka.controllor;

import com.cloud.eureka.feign.FeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shaobo on 2018/3/5.
 */

@RestController
public class TestControllor {

    @Autowired
    private FeignApi feignApi;

    @RequestMapping("test")
    public String test() {
        return feignApi.serviceHi();
    }
}
