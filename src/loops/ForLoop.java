package loops;

public class ForLoop {
    public static void main(String[] args) {
        String sentence = "Ala ma kota";
// ala ma kota
//        wypisz w petli wszystkie znaki napisu pojedynczo
//        012345678910
        for (int i = 0; i <= sentence.length() - 1; i++) {
            if (sentence.charAt(i) != ' ') {
                System.out.printf("indeks: %d znak: %c\n", i, sentence.charAt(i));


            }

        }

//        PETLA FOR EACH - do odczytu danych , petla for do modyfikacji

//tablica  - zmienna przechowujaca zestaw wartosci uporzakowanych po indeksach
//        index 0 - 2
//        index 1 - 4
//        index 2 - 6
//        index 3 - 8
        int numbers[] = {2, 4, 6, 8};
//        for ( typ pojedynczej warosci nazwa podczena : kolekcja warosci)
        int index = 0;
        for (int number : numbers) {
            System.out.printf("indeks : %d wartosc : %d \n", index, number);
            index++;
        }
//        petla while - gdy nie wiemy ilosci iteracji, tak długo dopóki jest prawdziwy
//        petla do =- przynajmniej jedna instrukcja musi sie wykonac a potem sprawdza czy warunek jest spęłniony

    }
}

