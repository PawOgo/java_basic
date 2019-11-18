package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
//    petla nieskonczona dopóki nie zostanie rpzerwana

        boolean isFinished = false;
        while (isFinished != true) ;

//        CLI - command line interface
        System.out.println("Witaj w naszej aplikacji");
        System.out.println("(L) - logowanie");
        System.out.println("(R) - rejestracja");
        System.out.println("(Q) - wyjscie");

        char deacision = scanner.nextLine().toUpperCase().charAt(0);

        switch (deacision)

        {
            case 'L':
                System.out.println("logowanie");
                break;
            case 'R':
                System.out.println("rejestracja");
                break;
            case 'Q':
                System.out.println("wyjscie");
//            przerwanie petli

                isFinished = true;
                break;
            default:
                System.out.println("zły wybór");
                break;
        }
    }
}