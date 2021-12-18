import java.util.Scanner;

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

        int liczbaA = 20;
        int liczbaB = 6;
        double liczbaX = 20.0D;
        double liczbaY = 6.0D;

        System.out.println("Dodawanie liczb całkowitych: " + (liczbaA + liczbaB));
        System.out.println("Odejmowanie liczb całkowitych: " + (liczbaA - liczbaB));
        System.out.println("Mnożenie liczb całkowitych: " + (liczbaA * liczbaB));
        System.out.println("Dzielenie liczb całkowitych: " + (liczbaA / liczbaB));
        System.out.println("Dzielenie modulo liczb całkowitych: " + (liczbaA % liczbaB));

        System.out.println("Dodawanie liczb zmiennoprzecinkowych: " + (liczbaX + liczbaY));
        System.out.println("Odejmowanie liczb zmiennoprzecinkowych: " + (liczbaX - liczbaY));
        System.out.println("Mnożenie liczb zmiennoprzecinkowych: " + (liczbaX * liczbaY));
        System.out.println("Dzielenie liczb zmiennoprzecinkowych: " + (liczbaX / liczbaY));
        System.out.println("Dzielenie modulo liczb zmiennoprzecinkowych: " + (liczbaX % liczbaY));

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli
         *   b) wyświetlić dane za pomocą println i printf
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String imie = scan.next();
        System.out.print("Podaj nazwisko: ");
        String nazwisko = scan.next();
        System.out.print("Podaj wiek: ");
        int wiek = scan.nextInt();
        System.out.print("Podaj nr indeksu: ");
        int nrIndeksu = scan.nextInt();

        System.out.println("Podane imię to: " + imie + ", podane nazwisko to: " + nazwisko);
        System.out.printf("Podany wiek to: %d, podany nr indeksu to: %d\n", wiek, nrIndeksu);

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */

        System.out.print("Podaj pierwszą liczbę: ");
        int pierwszaLiczba = scan.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int drugaLiczba = scan.nextInt();

        System.out.println("Dodawanie liczb: " + (liczbaA + liczbaB));
        System.out.println("Odejmowanie liczb: " + (liczbaA - liczbaB));
        System.out.println("Mnożenie liczb: " + (liczbaA * liczbaB));
        System.out.println("Dzielenie liczb: " + (liczbaA / liczbaB));
        System.out.println("Dzielenie modulo liczb: " + (liczbaA % liczbaB));

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        /* Operatory logiczne */
        boolean a = true;
        boolean b = false;
        boolean c = true;
        System.out.println("Operatory arytmetyczne:" +
                "\na = true\tb = false\tc = true");

        /* Iloczyn logiczny - AND */
        System.out.println("(a && b) : " + (a && b)); // false
        System.out.println("(a && c) : " + (a && c)); // true

        /* Różnica logiczna - OR */
        System.out.println("(a || b) : " + (a || b)); // true
        System.out.println("(a || c) : " + (a || c)); // true
        System.out.println("(false || b) : " + (false || b)); // false


        /* zaprzeczenie  - NOT */
        System.out.println("!a : " + !a); // false
        System.out.println("!b : " + !b); // true

        /* łączenie operatorów */
        System.out.println("!(a && b) : " + !(a && b)); // true
        System.out.println("!((a && c) || (!a || b) : " + !((a && c) || (!a || b))); // false

        System.out.println();

        /* Operatory porównania */
        int x = 5;
        int y = 7;
        int z = 5;

        /* \t - dodaje tabulator, \n - przeżuca kursor na początek nowej linii */
        System.out.printf("Operatory porównania:" +
                "\nx = %d\ty = %d\tz = %d\n", x, y, z);

        /* porównanie */
        System.out.println("(x == y) : " + (x == y)); // false
        System.out.println("(x == z) : " + (x == z)); // true

        /* nierówne */
        System.out.println("(x != y) : " + (x != y)); // true
        System.out.println("(x != z) : " + (x != z)); // false

        /* pozostałe operatory */
        System.out.println("(x > y) : " + (x > y)); // false
        System.out.println("(x < y) : " + (x < y)); // true
        System.out.println("(y >= x) : " + (y >= x)); // true

        System.out.println("((x > y) || (a && b)) : " + ((x > y) || (a && c))); // true

        /* Przykłady złożonych operacji */
        System.out.println("(a && b && c) : " + (a && b && c)); // false
        System.out.println("(x == y || x == z) : " + (x == y || x == z)); // true
        System.out.println("(a || b) && (x < y) : " + ((a || b) && (x < y))); // true
        System.out.println("(a && b && (x < y)) : " + (a && b && (x < y))); // false
        System.out.println("(y >= x && c) : " + (y >= x && c)); // true
        System.out.println("(a == b || b == c) && (x > y || y > z) : " + ((a == b || b == c) && (x > y || y > z))); // false

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */

        if (30%3 == 0)
            System.out.println("Podzielny przez 3");
        else
            System.out.println("Niepodzielny przez 3");

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

    }
}
