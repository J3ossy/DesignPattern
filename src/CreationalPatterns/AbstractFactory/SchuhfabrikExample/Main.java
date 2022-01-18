package CreationalPatterns.AbstractFactory.SchuhfabrikExample;

public class Main {

    public static void main(String[] args) {

        SchuhFabrik meineSchuhFabrik = new AdidasSchuhFabrik();
        Schuh meinLieblingsSchuh = meineSchuhFabrik.erzeugeSchuh("Wanderschuh");

        System.out.println(meinLieblingsSchuh.getName());
    }
}
