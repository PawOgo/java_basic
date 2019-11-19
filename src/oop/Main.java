package oop;

import java.util.Scanner;

//klasa głowna - uruchomieniowa
public class Main {
    public static void main(String[] args) {

        //utworzenie i obiektu

        User userOne = new User("ania", "kowalska", 'K', false, 5000);

//        odwołanie do pola klasowego

//        userOne.name = "Michał";
//        userOne.lastName = "Kruczkowski";
//        userOne.activated = false;
//        userOne.salary_net = 10100;
//        userOne.gender = 'M';
//        wywołanie do metdoy
        userOne.printUser();

        User userTwo = new User("Adam", "kowalski", 'M', false, 4000);
        userTwo.printUser();
        User userThree = new User("Anna", "Nowa", 'K', true, 8000);
        userThree.printUser();
        userOne.salary_net = 9500;
        System.out.println("==========");
        userOne.printUser();
        userTwo.printUser();
        userThree.printUser();
        System.out.println("==========");

        double salaryGRoss = userOne.calculateSalaryGross()
                ;
        System.out.println("salaryGRoss = " + salaryGRoss);
        System.out.println("Calculated salary gross: " + userTwo.calculateSalaryGross());
        System.out.println("=============");
        System.out.println(userThree.modifyUserParameters(15000,false));

//        Scanner scanner = new Scanner(System.in);
//        User userFour = new User();



    }


}
