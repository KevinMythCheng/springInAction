package com.myth.impl;

import com.myth.Knight;
import com.myth.Quest;

/**
 * 在XML中配置 将Quest 和Minstrel 引入其中即可
 * 但是 真的应该在BraveKnighe中引入Minstrel吗？
 * BraveKnight 必须要Minstrel唱歌才能去做Quest吗？
 * 所以我们应该将Minstrel作为一个切面来置入其中
 */
public class BraveKnightMinstrel implements Knight {

    private Quest quest;

    //引入Minstrel 在Brave中给发消息
    private Minstrel minstrel;

    //给BraveKnight 注入 Minstrel
    public BraveKnightMinstrel(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    @Override
    public void embarkOnQuest() {
        minstrel.singBeforeQuest();;
        quest.embark();
        minstrel.singAfterQuest();
    }
}
