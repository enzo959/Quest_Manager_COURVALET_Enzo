package com.taskquest.model;

public class Player {

    private String name;
    private int level;
    private int currentXP;
    private int totalXP;
    private String title;

    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.currentXP = 0;
        this.totalXP = 0;
        this.title = "Apprenti";
    }

    public void addXP(int amount) {
        this.currentXP += amount;
        this.totalXP += amount;

        while (this.currentXP >= xpToNextLevel()) {
            this.currentXP -= xpToNextLevel();
            this.level++;
            this.title = updateTitle();
        }
    }

    private int xpToNextLevel() {
        return this.level * 100;
    }

    private String updateTitle() {
        return switch (level) {
            case 1 -> "Apprenti";
            case 2 -> "Aventurier";
            case 3 -> "Guerrier";
            case 4 -> "Champion";
            default -> "Légende";
        };
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getCurrentXP() {
        return currentXP;
    }

    public int getTotalXP() {
        return totalXP;
    }

    public String getTitle() {
        return title;
    }

    public void setName(String name) {
        this.name = name;
    }
}