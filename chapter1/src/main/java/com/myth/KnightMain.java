package com.myth;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用XML 自动装配方法，获取到什么样的quest 交给了什么样的Knight
 * 而不会在程序中显示出来
 */
public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
