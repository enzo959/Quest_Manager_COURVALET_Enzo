package com.taskquest.model;

public abstract class Quest {

    private String title;
    private String description;
    private int xpReward;
    private QuestStatus status;

    public Quest(String title, String description, int xpReward) {
        this.title = title;
        this.description = description;
        this.xpReward = xpReward;
        this.status = QuestStatus.TODO;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getXpReward() {
        return xpReward;
    }

    public QuestStatus getStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setXpReward(int xpReward) {
        this.xpReward = xpReward;
    }

    public void setStatus(QuestStatus status) {
        this.status = status;
    }
}