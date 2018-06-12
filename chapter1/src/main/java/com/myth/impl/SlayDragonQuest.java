package com.myth.impl;

import com.myth.Quest;

import java.io.PrintStream;

/**
 * 使用XML的方式进行装配
 */
public class SlayDragonQuest implements Quest {
    private PrintStream printStream;

    //像这个Quest中注入 PrintStream 对象
    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void embark() {
        printStream.println("Embarking on Quest to slay the Dragon");
    }
}
