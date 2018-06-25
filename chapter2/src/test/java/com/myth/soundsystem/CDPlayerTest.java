package com.myth.soundsystem;

import com.myth.soundsystem.MediaPlayer;
import com.myth.soundsystem.config.CDPlayerConfig;
import com.myth.soundsystem.impl.CDPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

//加入SpringJUnit4ClassRunner.class 以便在测试的时候自动创建Spring的应用上下文
@RunWith(SpringJUnit4ClassRunner.class)
//ContextConfiguration 表明在刚开始的时候加载配置
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    //StandardOutputStreamLog 已经被废弃了 改用SystemOutRule
//    public final StandardOutputStreamLog log = new StandardOutputStreamLog();
//    @Rule
//    public final SystemOutRule log = new SystemOutRule().enableLog();

//    @Autowired
//    private MediaPlayer mediaPlayer;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }
}
