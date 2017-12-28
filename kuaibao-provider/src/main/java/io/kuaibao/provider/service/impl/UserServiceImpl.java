package io.kuaibao.provider.service.impl;

import io.kuaibao.provider.service.UserService;

/**
 * Created by tianwei on 2017/1/21.
 */
@com.alibaba.dubbo.config.annotation.Service
//@Service
public class UserServiceImpl implements UserService {
    public String getUserName(){
        System.out.println("invoke");
        return "UserName(用户名)-本机";
    }
}
