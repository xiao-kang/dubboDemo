package io.kuaibao.provider.service.impl;


import io.kuaibao.provider.service.ServerTimeService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chenxk on 2017/12/19.
 */
@com.alibaba.dubbo.config.annotation.Service
//@Service
public class TimeServiceImpl implements ServerTimeService {
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    @Override
    public String getTime() {
        System.out.println("invoke");
        return simpleDateFormat.format(new Date());
    }
}
