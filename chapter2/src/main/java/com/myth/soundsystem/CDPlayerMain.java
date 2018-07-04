package com.myth.soundsystem;

import com.myth.soundsystem.impl.CDPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext("CDPlayer.xml");
        CDPlayer CDPlayer = (com.myth.soundsystem.impl.CDPlayer) ClassPathXmlApplicationContext.getBean("cdPlayer");
        CDPlayer.play();
    }
}
