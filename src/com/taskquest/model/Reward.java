package com.taskquest.model;

public class Reward {

    private final String label;
    private final int requiredLevel;

    public Reward(String label, int requiredLevel) {
        this.label = label;
        this.requiredLevel = requiredLevel;
    }

    public String getLabel() {
        return label;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }
}
