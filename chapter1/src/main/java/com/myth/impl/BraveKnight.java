package com.myth.impl;

import com.myth.Knight;
import com.myth.Quest;

/**
 * BraveKnight 的能力比较强，可以救各种类型的请求
 */
public class BraveKnight implements Knight {
    //绑定一个Quest 对象
    private Quest quest;

    //依赖注入的方式之一-- 构造器注入
    //没有与特定的Quest发生耦合，并不知道的请求到底是什么样的危险。
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
        System.out.println("I am coming");
    }
}
