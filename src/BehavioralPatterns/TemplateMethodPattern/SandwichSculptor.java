package BehavioralPatterns.TemplateMethodPattern;

public class SandwichSculptor {

    public static void main(String[] args) {

        Hoagie customer1Hoagie = new ItalianHoagie();
        customer1Hoagie.makeSandwich();
        System.out.println();

        Hoagie customer2Hoagie = new VeggieHoagie();
        customer2Hoagie.makeSandwich();

    }
}
