package io.kuaibao.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import io.kuaibao.provider.service.OrderService;
import io.kuaibao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tianwei on 2017/1/21.
 */
@Controller
public class OtherController {

    @Reference
    private OrderService orderService;
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/order", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String order(String id){
        System.out.println(orderService);
        String userName = orderService.find(id);
        return "test "+userName+testService.test();
    }

}
