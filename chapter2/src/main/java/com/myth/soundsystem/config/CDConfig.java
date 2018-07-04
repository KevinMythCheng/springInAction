package com.myth.soundsystem.config;

import com.myth.soundsystem.CompactDisc;
import com.myth.soundsystem.impl.SgtPappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {
    //在JavaConfig中创建Bean的实例
    //同样的可以设置Bean 的名称
    @Bean(name = "sgtPappers")
    public CompactDisc compactDisc() {
        return new SgtPappers();
    }
}
