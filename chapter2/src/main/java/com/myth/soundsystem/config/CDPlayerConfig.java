package com.myth.soundsystem.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//默认会扫面与配置类相同的包   可以设置包的属性  这样就可以加载其他包的类了
@ComponentScan(basePackages = "com.myth.soundsystem")
public class CDPlayerConfig {

}
