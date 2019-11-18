package switch_case_instructions;

import conditionals_instructions.Grade;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Scanner;

public class SwitchCaseInstructions {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
////        CLI - command line interface
//        System.out.println("Witaj w naszej aplikacji");
//        System.out.println("(L) - logowanie");
//        System.out.println("(R) - rejestracja");
//        System.out.println("(Q) - wyjscie");
//
//        char deacision = scanner.nextLine().toUpperCase().charAt(0);
//
//        switch (deacision) {
//            case 'L':
//                System.out.println("logowanie");
//                break;
//            case 'R':
//                System.out.println("rejestracja");
//                break;
//            case 'Q':
//                System.out.println("wyjscie");
//                break;
//            default:
//                System.out.println("zły wybór");
//                break;
//
//        }
        Grade grade = Grade.celujacy;
        switch (grade){
            case celujacy:
                System.out.println("Swietnie dostałeś 6");
                break;
            case bardzo_dobry:
                System.out.println("Swietnie dostałeś 5");
                break;
            case dobry:
                System.out.println("Swietnie dostałes 4");
                break;
            case dostateczny:
                System.out.println("Swietnie dostałeś 3");
                break;
            case dopuszczajacy:
                System.out.println("Swietnie dostałeś 2");
                break;
            case niedostateczny:
                System.out.println("Swietnie dostałeś 1");
        }



    }


}
