public class Main {

    public static void main(String[] args) {

        System.out.println("Witaj świecie!");

        //ćw.1 napisać po kilka przykładów wypisywania tekstu w konsoli,
        //Użyć każdej z opcji

        System.out.println("Wypisanie proste ze znakiem nowej linii na końcu");
        System.out.println("Stringi" + " " + "można" + " " + "łączyć");

        System.out.printf("Do stringa %s dodawać %s argumenty różnego typu jak np. liczby: %d%s", "można", "liczne", 777, "\n");

        System.out.print("Z kolei ");
        System.out.print("ten format zostawia ");
        System.out.print("kursor na swoim miejscu.");

        int zmiennaInt = 7;
        System.out.println("\nzmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        byte zmiennaByte = 127;
        short zmiennaShort = 32767;
        long zmiennaLong = 9223372036854775807L;
        float zmiennaFloat = 0.00004F;
        double zmiennaDouble = 0.000000000004D;
        boolean zmiennaBoolean = true;
        char zmiennaChar = 'c';
        String zmiennaString = "string";

        System.out.println("zmienna byte = " + zmiennaByte);
        System.out.println("zmienna short = " + zmiennaShort);
        System.out.println("zmienna long = " + zmiennaLong);
        System.out.println("zmienna float = " + zmiennaFloat);
        System.out.println("zmienna double = " + zmiennaDouble);
        System.out.println("zmienna boolean = " + zmiennaBoolean);
        System.out.println("zmienna char = " + zmiennaChar);
        System.out.println("zmienna String = " + zmiennaString);

        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */


    }
}
