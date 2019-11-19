package oop;

public class User {
    //    pola -> zmienne i obiekty
    String name;
    String lastName;
    char gender;
    boolean activated;
    double salary_net;

    //    kosntruktor -> metoda która jest wywoływana podczas tworzenia obiektu
    public User(String name, String lastName, char gender, boolean activated, double salary_net) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.activated = activated;
        this.salary_net = salary_net;
    }

    //metoda bezargumentowa nie zwracajaca zadnej wartosci -> 'typu void
    void printUser() {

        // przypomnij sobie specyfikatory printf

        System.out.printf(
                "|%10s|%10s|%3c|%6b|%8.2fzł|\n",
                this.name, this.lastName, this.gender, this.activated, this.salary_net);
        // this - wskazuje na obiekt globalny w klasie

    }

    //metoda zwracjace
    double calculateSalaryGross() {
        double salaryGross = salary_net * 1.23;
        return salaryGross;
    }

    String modifyUserParameters(double salary_net, boolean activated) {
        this.salary_net = salary_net;
        this.activated = activated;
        return String.format("|%10s|%10s|%3c|%6b|%8.2fzł|\n",
                this.name, this.lastName, this.gender, this.activated, this.salary_net);

    }

}
