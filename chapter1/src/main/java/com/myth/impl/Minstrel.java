package com.myth.impl;

import java.io.PrintStream;

/**
 * Minstrel for Brave Knight
 * when A quest coming , call singBeforeQuest
 * when a quest down , call sing afterQuest
 */
public class Minstrel {
    private PrintStream printStream;

    public Minstrel(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void singBeforeQuest(){
        printStream.println("Fa La la , the knight is so brave.");
    }

    public void singAfterQuest(){
        printStream.println("Tee he he , the brave knight did embark on a quest");
    }
}
