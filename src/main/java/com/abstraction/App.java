package com.abstraction;

/**
 * Interfaces and Abstract Classes
 *
 */
public class App {
    public static void main(String[] args) {
        Mage mage = new Mage("Gandalf");
        System.out.println(mage.getCharacterName());
        mage.distanceAttack();
        mage.lowAttack();

        Warrior warrior = new Warrior("Garen");
        System.out.println(warrior.getCharacterName());
        warrior.highAttack();
        warrior.distanceAttack();
        warrior.shortRangeAttack();
    }
}
