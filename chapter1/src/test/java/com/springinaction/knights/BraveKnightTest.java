package com.springinaction.knights;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author jiangqw
 * @date 2019/11/5 11:13
 */
public class BraveKnightTest {
    @Test
    public void test() {
        Quest quest = Mockito.mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(quest);
        braveKnight.embarkOnQuest();
        Mockito.verify(quest, Mockito.times(1)).embark();
    }
}
