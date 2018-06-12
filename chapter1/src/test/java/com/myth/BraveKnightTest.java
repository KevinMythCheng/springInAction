package com.myth;

import com.myth.impl.BraveKnight;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Test for BraveKnight
 * Mock a quest
 */
public class BraveKnightTest {
    public static void main(String[] args) {
        //mock a quest
        Quest quest = mock(Quest.class);
        //像BraveKight中注入一个quest
        BraveKnight braveKnight = new BraveKnight(quest);
        braveKnight.embarkOnQuest();
        verify(quest,times(1)).embark();
    }
}
