package com.myth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMinsterMain {

    public static void main(String[] args) {
        //使用FilePath绝对路径得到上下文
//        ApplicationContext context = new FileSystemXmlApplicationContext("D:/IdeaProjects/springInAction/chapter1/src/main/resources/Minstrel.xml");
        //使用类路径找到应用上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("Minstrel.xml");
        Knight braveKnight = context.getBean(Knight.class);
        braveKnight.embarkOnQuest();
    }
}
