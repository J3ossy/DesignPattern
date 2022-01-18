package BehavioralPatterns.StrategyPattern;

public class Dragon extends Monster {

    public Dragon() {
        attack = new AttackTypeFire();
    }
}
