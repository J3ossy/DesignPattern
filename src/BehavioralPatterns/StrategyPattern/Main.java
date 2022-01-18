package BehavioralPatterns.StrategyPattern;

public class Main {
    public static void main(String[] args) {

        Monster benny = new Cyclops();
        benny.walk();
        benny.attack();

        Monster sandro = new Dragon();
        sandro.swim();
        sandro.attack();

    }
}
