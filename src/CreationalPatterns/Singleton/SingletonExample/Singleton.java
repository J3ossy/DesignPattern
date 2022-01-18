package CreationalPatterns.Singleton.SingletonExample;

// final um Manipulation durch Vererbung zu verhindern
public final class Singleton {

    // Eine (versteckte) Klassenvariabel vom Typ der eigenen Klasse
    private static Singleton instance;

    // Verhindere die Erzeugung des Objektes über andere Methoden (Konstruktor privat)
    private Singleton() {
    }

    // Eine Zugriffsmethode auf Klassenebene, welche dir EINMAL ein konkretes
    // Objekt erzeugt und dieses zurückliefert.
    public static Singleton getInstance() {
        if (Singleton.instance == null) {
            Singleton.instance = new Singleton();
        }
        return Singleton.instance;
    }
}
