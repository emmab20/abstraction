package com.abstraction;

class Elf extends Character implements FightingMoves {

    public Elf(String characterName) {
        super(characterName);
    }

    @Override
    public void highAttack() {
        System.out.println(this.getCharacterName() + " slashes dagger at opponent's face");
    }

    @Override
    public void lowAttack() {
        System.out.println(this.getCharacterName() + " sweeps leg at opponent's feet");
    }

    @Override
    public void distanceAttack() {
        System.out.println(this.getCharacterName() + " shoots an arrow at opponent");
    }

    @Override
    public void shortRangeAttack() {
        System.out.println(this.getCharacterName() + " throws a dagger at opponent");
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
