package com.myth.soundsystem.config;

import com.myth.soundsystem.CompactDisc;
import com.myth.soundsystem.impl.CDPlayer;
import com.myth.soundsystem.impl.SgtPappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//默认会扫面与配置类相同的包   可以设置包的属性  这样就可以加载其他包的类了
//使用JAVAConfig 的方式 进行配置  去除掉@ComponentScan
//@ComponentScan(basePackages = "com.myth.soundsystem")
public class CDPlayerConfig {

    //在JavaConfig中创建Bean的实例
    //同样的可以设置Bean 的名称
    @Bean(name = "sgtPappers")
    public CompactDisc sgtPappers() {
        return new SgtPappers();
    }

    //在CDPlayer中注入一张cd sgtPappers
/*    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPappers());
    }*/

    //因为Spring 是单例的 ， 所以这两个sgtPappers  其实是一个
    //可以使用带参数的方式进行注入，这样子不用每次在Java Config中声明Bean  可以使用注解的方式或者XML 的方式
    @Bean
    public CDPlayer anotherCDPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
