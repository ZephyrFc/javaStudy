package com.example.demo.demo.dao;

import org.springframework.beans.factory.InitializingBean;

/**
 * @authorzephyr
 * @date2020/8/2416:53
 */
public class IndexDaoImpl implements IndexDao, InitializingBean {
    public IndexDaoImpl() {

    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("");
    }
}
