package com.myth.soundsystem.impl;

import com.myth.soundsystem.CompactDisc;
import org.springframework.stereotype.Component;

//组件扫描默认是不启用的，显示配置Config 让他去找带有Component的类
//默认的ID 是 sgtPappers , 同样也可以使用Named 或者Component 来定义
@Component("sgtPappers")
public class SgtPappers implements CompactDisc {

    private String title = "Sgt. Peppers Lonely Heart's Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
