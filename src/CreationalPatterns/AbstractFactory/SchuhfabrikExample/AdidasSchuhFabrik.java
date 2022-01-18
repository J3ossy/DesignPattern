package CreationalPatterns.AbstractFactory.SchuhfabrikExample;

public class AdidasSchuhFabrik implements SchuhFabrik {

    @Override
    public Schuh erzeugeSchuh(String schuhArt) {
        if (schuhArt.equals("Wanderschuh")) {
            return new AdidasWanderSchuh();
        } else if (schuhArt.equals("Turnschuh")) {
            return new AdidasTurnSchuh();
        } else
            return null;
    }
}
