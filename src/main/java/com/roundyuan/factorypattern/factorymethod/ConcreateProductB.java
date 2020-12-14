package com.roundyuan.factorypattern.factorymethod;

/**
 * @program: designpattern
 * @description:
 * @author: Mr.Zhangmy
 * @create: 2020-12-15 00:21
 **/
public class ConcreateProductB implements Product {

    @Override
    public void show() {
        System.out.println("PRODUCT-B");
    }
}
