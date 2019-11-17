package variables;

import static java.lang.Math.incrementExact;
import static java.lang.Math.pow;

public class Mathematic {
    public static void main(String[] args) {
//        stałe z kalsy matematycznej
        final double PI = Math.PI;

//        x*y
        int x = 5;
        int y = 2;
        int result  = (int)pow(x,y);
        System.out.println(result);

        System.out.println(pow(8, (1.0/3)));

        int a = 5;
        int b = 8;

//        wynik działania jest typu ladników dzialania
//        wynik diałania jest typu składnika o najwyższej precyzji w działąniu
        System.out.println(a * b);
//        w tym przypadku konwersja rozszezająca - konwersja do typu wyższej konwersji
//

        System.out.println((double) a / b);
//        konwersja zawezajaca - konwersja do typu nizszcej precyzji
        double measure = 1.443;

        System.out.println( (int)measure );

        char sign = 'a';
        sign++;
        System.out.println(sign);


        }
    }

