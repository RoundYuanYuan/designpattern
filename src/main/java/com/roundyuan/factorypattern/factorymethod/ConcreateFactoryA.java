package com.roundyuan.factorypattern.factorymethod;

/**
 * @program: designpattern
 * @description:
 * @author: Mr.Zhangmy
 * @create: 2020-12-15 00:24
 **/
public class ConcreateFactoryA implements AbstractFactory{
    @Override
    public Product newProduct() {
        System.out.println("具体工厂 A");
        return new ConcreateProductA();
    }
}
