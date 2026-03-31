public class Main {
    public static void main(String[] args) {

        ProduktMenu p1 = new ProduktMenu("123", "Latte", 12, "kawa");
        ProduktMenu p2 = new ProduktMenu("321", "Espresso", 9, "kawa");
        ProduktMenu p3 = new ProduktMenu("213", "Serniczek", 18, "deser");

        KlientKawiarni klient = new KlientKawiarni(111, "Paweł", "Kuc", "PKuc@mail.pl");

        Zamowienie zamowienie = new Zamowienie(klient);
        zamowienie.dodajProdukt(p1);
        zamowienie.dodajProdukt(p2);
        zamowienie.dodajProdukt(p3);

        System.out.println(klient);
        System.out.println(zamowienie);
        System.out.println("Łączna wartość: " + zamowienie.policzWartosc() + " zł");
        System.out.println("Liczba pozycji: " + zamowienie.policzLiczbeProduktow());
        System.out.println("Produktów w systemie: " + ProduktMenu.getLiczbaProduktow());

        ProduktMenu kopiaLatte = new ProduktMenu("123", "Latte duplikat", 12, "kawa");
        System.out.println("Czy produkty są równe? " + p1.equals(kopiaLatte)); // true

        KlientKawiarni klient2 = new KlientKawiarni(999, "Jan", "Nowak", "JNowak@mail.pl");
        System.out.println("Czy to ten sam klient? " + klient.equals(klient2));

        zamowienie.oznaczJakoOplacone();
        System.out.println(zamowienie);
    }
}