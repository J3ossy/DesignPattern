package BehavioralPatterns.StrategyPattern;

public class AttackTypeFire implements AttackType {

    @Override
    public void attack() {
        System.out.println("I spit fire!");
    }
}
