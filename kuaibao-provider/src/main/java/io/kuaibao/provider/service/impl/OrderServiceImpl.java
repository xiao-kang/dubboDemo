package io.kuaibao.provider.service.impl;


import io.kuaibao.provider.service.OrderService;

/**
 * Created by chenxk on 2017/12/19.
 */
@com.alibaba.dubbo.config.annotation.Service
public class OrderServiceImpl implements OrderService {


    @Override
    public String find(String id) {
        System.out.println(id);
        switch (id){
            case "1":
                return "iphone6";

            case  "2":
                return "iphone7";
            case  "3":
                return "华为";
            case  "4":
                return "三星";
        }
        return "unknown";
    }
}
