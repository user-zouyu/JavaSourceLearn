package com.zouyu.base.spi.impl;

import com.zouyu.base.spi.Hello;

/**
 * @author ZouYu 2022/10/6 16:16
 * @version 1.0.0
 */
public class HelloZouyuImpl implements Hello {


    @Override
    public void hello() {
        System.out.println("Hello Zou Yu");
    }
}
