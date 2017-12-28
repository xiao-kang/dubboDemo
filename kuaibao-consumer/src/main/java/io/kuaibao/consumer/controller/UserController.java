package io.kuaibao.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import io.kuaibao.provider.service.ServerTimeService;
import io.kuaibao.provider.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tianwei on 2017/1/21.
 */
@Controller
public class UserController {
//    @Reference
    @Reference
    private UserService userService;
    @Reference
    private ServerTimeService serverTimeService;

    @RequestMapping(value = "/user", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String user(){
        System.out.println(userService);
        String userName = userService.getUserName();
        return "test "+userName;
    }
    @RequestMapping(value = "/time", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String time(){
        System.out.println(serverTimeService);
        String userName = serverTimeService.getTime();
        return "时间是： "+userName;
    }
}
