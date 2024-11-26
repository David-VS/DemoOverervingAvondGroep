package be.ehb.personen;

import be.ehb.personen.oefeningen.Hond;
import be.ehb.personen.oefeningen.Huisdier;
import be.ehb.personen.vormen.Cirkel;
import be.ehb.personen.vormen.Vierhoek;
import be.ehb.personen.vormen.Vorm;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String tekst = "dit is tekst";

        Persoon p1 = new Persoon("John", "Doe", LocalDate.parse("1970-12-12"));
        Persoon p2 = new Persoon();

        Student s1 = new Student("Amin", "De Smedt", LocalDate.parse("1987-03-03"), "grad prog");

        Persoon p3 = new Student("Sarah", "De Munck", LocalDate.parse("1999-02-01"), "grad snb");
        //p3 = p1;

        System.out.println(p1);
        System.out.println(s1);
        System.out.println(p3);


        Vorm v1 = new Cirkel(5);
        Vorm v2 = new Vierhoek(5,6);

        Vorm[] lijstVormen = {v1, v2};

        for (int i = 0; i < lijstVormen.length; i++) {
            Vorm v = lijstVormen[i];
            System.out.println(v.berekenOppervlakte());
        }


        /*
        * Maak een Huisdier, huisdieren hebben een gewicht, leeftijd en naam.
        * Zorg voor een constructor, getters, setters en een toString functie.

        Maak vervolgens een klasse hond die hier van gaat overerven.
        * Honden nemen alles over van een Huisdier en voegen nog een stamboeknummer toe.
        * Voorzie ook hiervoor een constructor, getters, setters en een toString functie.

        Maak om alles te testen enkele huisdieren en honden aan en kijk wat er gebeurt als je hun gegevens afdrukt.
        * */

        Huisdier kitty = new Huisdier(10, 5, "Kitty");
        Huisdier samson = new Hond(15, 7, "Samson", 123456789);
        Hond fido = new Hond(30, 4, "Fido", 789456123);

        System.out.println(kitty);
        System.out.println(samson);
        System.out.println(fido);

    }
}