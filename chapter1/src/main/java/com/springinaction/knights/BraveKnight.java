package com.springinaction.knights;

/**
 * @author jiangqw
 * @date 2019/11/4 14:00
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
