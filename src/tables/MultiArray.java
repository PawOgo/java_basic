package tables;

public class MultiArray {
    public static void main(String[] args) {
        char[][] t = {{'_', '_', '_'},
                {'_', '_', '_'},
                {'_', '_', '_'}
        };
//        petla iterujaca po wierszach
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("%3c", t[i][j]);
            }
            System.out.println();//przeniesienie wierdsza do nowej linii


        }
//        tablice wielowymiarowe - nieregularne
        int[][] numbers = {
                {1, 1, 1},
                {2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3, 3},
                {4, 4, 4, 4, 4, 4, 4, 4, 4},
                {10, 10, 10, 10, 10, 10, 10},
        };
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%3d", numbers[i][j]);


            }
            System.out.println();
        }
        // 1. i = 0 | 0 < 3 -> true | i++
        //    j = 0 | 0 < 3 -> true | j++ 1
        //    j = 1 | 1 < 3 -> true | j++  1 1
        //    j = 2 | 2 < 3 -> true | j++  1 1 1
        //    j = 3 | 3 < 3 -> false | j++ 1 1 1 \n

        // 2. i = 1 | 1 < 3 -> truse | i++
        //    j = 0 | 0 < 5 -> truse | i++ 1
        //    j = 1 | 1 < 5 -> truse | i++ 1 1
        //    j = 2 | 2 < 5 -> truse | i++ 1 1 1
        //    j = 3 | 3 < 5 -> truse | i++ 1 1 1 1
        //    j = 4 | 4 < 5 -> truse | i++ 1 1 1 1 1
        //    j = 5 | 5 < 5 -> false | i++ 1 1 1 1 1 \n



    }

}