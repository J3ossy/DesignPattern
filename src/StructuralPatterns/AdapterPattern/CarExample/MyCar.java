package StructuralPatterns.AdapterPattern.CarExample;

public class MyCar {
    private long currentSpeed;

    public MyCar(long l) {
        this.currentSpeed = l;
    }

    public long getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(long currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
