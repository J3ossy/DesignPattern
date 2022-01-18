package BehavioralPatterns.StrategyPattern;

public abstract class Monster {

    AttackType attack;

    public void walk() {
        System.out.println("I can walk!");
    }

    public void swim() {
        System.out.println("I can swim!");
    }

    public void attack() {
        attack.attack();
    }
}
