package com.roundyuan.factorypattern.factorymethod;

/**
 * @program: designpattern
 * @description:
 * @author: Mr.Zhangmy
 * @create: 2020-12-15 00:25
 **/
public class ConcreateFactoryB implements AbstractFactory {
    @Override
    public Product newProduct() {
        return new ConcreateProductB();
    }
}
