package variables;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;
//        post inkrementacja
        System.out.println(i++);
//        po ywpisywaniu zmienna jest inkrementowana
        System.out.println(i);

//        preidekrementacja
        System.out.println(--j);
        System.out.println(j);

        System.out.println((j++) * (--i + j--) + (++i));
//        3*5+

//        sprawdz czy uzytkownik ma 18 lat
//        w jaki sposób ma sprawdzić
//        jezeli jego wiek jest >= 18 lat to ywpisz jest ełnoletnie
//        w przewciwnym razie wypisz nie jesteś pełnoeltni

        int age = 44;
//        utworzenie obiektu SCanner pozwalajcacego na wprowadzenie warosci do konsoli -> System.in
        Scanner scanner = new Scanner(System.in);

//        uzytkownik wprowdza do zmiennej age typu int metoda nextInt()

        System.out.println("Wprowadź swój wiek: ");
        age = scanner.nextInt();

//        uzytkownik wprowadza wartosc zdo mziennej age

//        String isMature = age >= 18 ? "użytkownik jest pełnoletni " : "nie jesteś pełnoletni";

//        System.out.println("Twój wiek to: " + age + " - " + isMature); POWTÓRZYC!!!!!

//        System.out.printf("Twój wiek to: %d - %s\n", age, isMature);
//        czy wiek zawiera się od 0 - 120 jesli tak to jestes człowiekiem jesli nie to orbotem

//        String isHuman = age >= 0 && age <= 120 ? "jesteś człowiekiem" : "jesteś robotem";
//        System.out.println(isHuman);

        boolean isHuman = age >= 0 && age <= 120 ? true : false;


        String isMature = age >= 18 ? "jesteś dorosły" : "nie jesteś dorosły";
        System.out.println(isHuman ? isMature : "ROBOT");

    }
}
