package StructuralPatterns.AdapterPattern.CarExample;

public interface FrameworkCar {

    public long increaseSpeedBy(long amount);
    public long decreaseSpeedBy(long amount);

    public long getSpeed();
}
