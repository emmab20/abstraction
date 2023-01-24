package com.abstraction;

class Warrior extends Character implements FightingMoves {

    public Warrior(String characterName) {
        super(characterName);
    }

    @Override
    public void highAttack() {
        System.out.println(this.getCharacterName() + " strikes opponent with an upward swing");
    }

    @Override
    public void lowAttack() {
        System.out.println(this.getCharacterName() + " strikes opponent with a low strike");
    }

    @Override
    public void distanceAttack() {
        System.out.println(this.getCharacterName() + " throws a spear at opponent");
    }

    @Override
    public void shortRangeAttack() {
        System.out.println(this.getCharacterName() + " trhows a dagger at opponent");
    }

    @Override
    public void hasWon(boolean hasWon) {
        if (hasWon) {
            numberOfWins++;
        } else {
            numberOfLosses++;
        }
    }
}
