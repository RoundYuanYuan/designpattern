package com.roundyuan.factorypattern.factorymethod;

/**
 * @program: designpattern
 * @description: 抽象工厂测试
 * @author: Mr.Zhangmy
 * @create: 2020-12-15 00:20
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        try {
            Product a;
            AbstractFactory af;
            af = (AbstractFactory) ReadXML1.getObject();
            a = af.newProduct();
            a.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
