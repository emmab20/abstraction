package com.abstraction;

class Mage extends Character implements FightingMoves {

    public Mage(String characterName) {
        super(characterName);
    }

    @Override
    public void highAttack() {
        System.out.println(this.getCharacterName() + " casts a thunderbolt at opponent");
    }

    @Override
    public void lowAttack() {
        System.out.println(this.getCharacterName() + " casts an earthquake at opponent's feet");
    }

    @Override
    public void distanceAttack() {
        System.out.println(this.getCharacterName() + " cast a fireball at opponent");
    }

    @Override
    public void shortRangeAttack() {
        System.out.println(this.getCharacterName() + " cast an electric shock at opponent");
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
