package com.myth.impl;

import com.myth.Knight;
import com.myth.Quest;

/**
 * DamselResuingKnight 只有救RescueDamselQuest 的能力， 如果碰到了其他的Quest  是没有办法相救的，比如恶龙。
 */
public class DamselResuingKnight implements Knight {

    //因为只能救RescueDamselQuest , 所以包含RescueDamselQuest对象
    private RescueDamselQuest quest;

    //DamselResuingKnight根据请求  知道是哪个RescueDamselQuest
    //与RescueDamselQuest有耦合
    public DamselResuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
        System.out.println("I am coming");
    }
}
