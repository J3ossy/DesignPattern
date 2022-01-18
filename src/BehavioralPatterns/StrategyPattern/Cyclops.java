package BehavioralPatterns.StrategyPattern;

public class Cyclops extends Monster {

    public Cyclops() {
        attack = new AttackTypeLaser();
    }
}
