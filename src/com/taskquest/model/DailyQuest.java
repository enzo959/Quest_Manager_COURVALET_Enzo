package com.taskquest.model;

public class DailyQuest extends Quest {

    private boolean isCompletedToday;

    public DailyQuest(String title, String description, int xpReward) {
        super(title, description, xpReward);
        this.isCompletedToday = false;
    }

    public boolean isCompletedToday() {
        return isCompletedToday;
    }

    public void setCompletedToday(boolean completedToday) {
        isCompletedToday = completedToday;
    }

    public void reset() {
        this.isCompletedToday = false;
        this.setStatus(QuestStatus.TODO);
    }
}