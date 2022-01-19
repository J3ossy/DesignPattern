package StructuralPatterns.AdapterPattern.CarExample;

public class AdapterTest {


    public static void main(String[] args) {

        MyCar myCar = new MyCar(50);

        MyCarAdapter myCarAdapter = new MyCarAdapter(myCar);
        long newSpeed1 = myCarAdapter.increaseSpeedBy(20);

        long newSpeed2 = myCarAdapter.decreaseSpeedBy(30);


    }


}
