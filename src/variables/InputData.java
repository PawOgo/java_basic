package variables;

import java.util.Locale;
import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
//        utworzenie obiektu Scanner
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);

//        wppowadzamy liczbe
        System.out.println("Wprowadx liczbe zmeinnoprzecinkowa: ");
        double number = scanner.nextInt(); // ENTER - \n
        String enter = scanner.nextLine();
//        aby skonsuwmowac ENTER wykonuemy metode nextLine()

//        wprowadzam napis
        System.out.println("Wprowadź napis: ");
        String text = scanner.nextLine();
//        wprowadzam napis
        System.out.printf("wprowadz: %f i %s\n", number, text);
        System.out.printf("Skonsumowano: ", enter);
        //        zamknceicie połczenia . Gdy połaczenienie jest zamkniete do pliku moe być dopisany bład . dlatego zamykamy
        scanner.close();
    }
}
