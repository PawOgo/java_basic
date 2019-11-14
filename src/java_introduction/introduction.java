package java_introduction;

import java.util.logging.SocketHandler;

// ctrl + /    automatyczny komentarz jednowierszowy
// ctrl + shift + /    komentarz blokowy
// psvm -> skrót do public static void main
// sout - system out print
// ctrl + D  - duplikowanie lini
public class introduction {

//    metoda uruchomieniowa
// -> automatycznie wywoływana jako pierwsza pw trakcie uruchomiania projektu

public static void main(String[] args) {

//     polecenie wypisujace wartosc podane w agumencie na standardowym wyjsciu

    System.out.println("hello world");

//    pobranie numeru wersji JRE

    System.out.println(System.getProperty("java.runtime.version"));
    System.out.println(System.getProperty("java.version"));

//  typy danych

int myFirstNumber =  50;
    System.out.println("myFirstNumber = " + myFirstNumber);
    System.out.println("Dodawanie liczb: " + (100 + myFirstNumber));
    double salaryNet = 9150.99;
    int vatTax = 23;
    System.out.println("Kwota netto: " + salaryNet + "zł");
    System.out.println("Kwota brutto: " + (salaryNet * (1+ (vatTax/100.0))) + "zł");
//    formatowanie wyjscia
    System.out.printf("Kwota brutto: %.2f zł\n", (salaryNet * (1+ (vatTax/100.0))));


    char smallLetter = 'a';
    char bigLetter = 'A';
    char dotChar = '.';

    System.out.println(smallLetter);
    System.out.println((char) (bigLetter + 10));
    System.out.printf("Znak: %c ma %d numer ASCII\n", dotChar, (int)dotChar);
    boolean isActivated = true;
    System.out.println(isActivated);
    System.out.println(!isActivated);




}
}
