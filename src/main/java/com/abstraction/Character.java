package com.abstraction;

public abstract class Character {
    protected String characterName;
    protected int numberOfWins;
    protected int numberOfLosses;

    public Character(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public int getNumberOfLosses() {
        return numberOfLosses;
    }

    public abstract void hasWon(boolean hasWon);
}
