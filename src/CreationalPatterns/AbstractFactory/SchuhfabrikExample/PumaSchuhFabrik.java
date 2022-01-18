package CreationalPatterns.AbstractFactory.SchuhfabrikExample;

public class PumaSchuhFabrik implements SchuhFabrik {

    @Override
    public Schuh erzeugeSchuh(String schuhArt) {
       if (schuhArt.equals("Wanderschuh")){
           return new PumaWanderSchuh();
       } else if (schuhArt.equals("Turnschuh")){
           return new PumaTurnSchuh();
       } else
        return null;
    }
}
