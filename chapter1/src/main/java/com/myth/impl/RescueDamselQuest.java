package com.myth.impl;

import com.myth.Quest;

public class RescueDamselQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("I am RescueDamselQuest, Please help me");
    }
}
