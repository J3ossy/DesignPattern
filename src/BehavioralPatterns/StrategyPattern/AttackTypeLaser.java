package BehavioralPatterns.StrategyPattern;

public class AttackTypeLaser implements AttackType {

    @Override
    public void attack() {
        System.out.println("I shoot a laser!");
    }
}
