package com.myth.soundsystem.impl;

import com.myth.soundsystem.CompactDisc;
import com.myth.soundsystem.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//CDPlayer 需要cd 才会完整的播放出音乐来， 那我们这里就需要CD对象的协助
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    //Autowired可以用在类中的任何方法上，只要需要注入其他的依赖
    //假设只有一个Bean 匹配依赖需求的话，就会被装配进来
    //若没有Bean 的 话 会抛出异常   此时可以设置required 属性为false
    //如果设置为false， 就不一定要求对象必须存在，不过可能会产生空指针  默认为true
    //如果发现多个Bean，Spring 将会抛出异常，表明没有明确指定的药选择哪个Bean 进行装配
    //也可以使用Inject来代替Autowired
//    @Autowired(required = false)
    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.compactDisc = cd;
    }
/*    @Autowired
    public void setCompactDisc(CompactDisc cd) {
        this.compactDisc = cd;
    }*/

    @Override
    public void play() {
        compactDisc.play();
    }
}
