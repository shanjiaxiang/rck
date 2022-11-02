package com.rcb.rck.config;

import com.rcb.rck.filter.AdminFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//管理员权限过滤配置

@Configuration
public class AdminFilterConfig {


    @Bean
    public AdminFilter adminFilter(){
        return new AdminFilter();
    }

    @Bean(name = "adminFilterConf")
    public FilterRegistrationBean adminFilterConfig(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(adminFilter());
        filterRegistrationBean.addUrlPatterns("/admin/rc/fd/*");
//        filterRegistrationBean.addUrlPatterns("/admin/category/*");
//        filterRegistrationBean.addUrlPatterns("/admin/product/*");
//        filterRegistrationBean.addUrlPatterns("/admin/order/*");
        filterRegistrationBean.setName("adminFilterConf");
        return filterRegistrationBean;
    }
}
