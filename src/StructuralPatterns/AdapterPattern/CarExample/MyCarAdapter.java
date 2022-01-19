package StructuralPatterns.AdapterPattern.CarExample;

public class MyCarAdapter implements FrameworkCar {

    private MyCar myCar;

    public MyCarAdapter(MyCar myCar) {
        this.myCar = myCar;
    }

    @Override
    public long increaseSpeedBy(long amount) {
        long newCurrentSpeed = myCar.getCurrentSpeed() + amount;
        myCar.setCurrentSpeed(newCurrentSpeed);
        return newCurrentSpeed;
    }

    @Override
    public long decreaseSpeedBy(long amount) {
        long newCurrentSpeed = myCar.getCurrentSpeed() - amount;
        myCar.setCurrentSpeed(newCurrentSpeed);
        return newCurrentSpeed;
    }

    @Override
    public long getSpeed() {
        return this.myCar.getCurrentSpeed();
    }
}
