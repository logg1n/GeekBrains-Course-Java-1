public class lesson2 {
    public static void main(String[] args) {
        /*
         * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         * С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        int[] arr1 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0)
                arr1[i] = 1;
            else arr1[i] = 0;
        }

        /*
         *2. Задать пустой целочисленный массив размером 8.
         * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
         */

        int[] arr2 = new int[8];
        for (int i = 0, a = 3; i< arr2.length; i++)
            arr2[i] = i * a;

        /*
         *3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
         *  пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */

        int[] arr3 =  {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr3.length; i++){
            if (arr3[i] < 6)
                arr3[i] <<= 1;
        }

        /*
         * 4. Создать квадратный двумерный целочисленный массив (
         * количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         */

        int[][] arr4 = new int[7][7];
        for (int i = 0; i < arr4.length; i++){
            for (int j = 0; j < arr4[i].length; j++){
                if(i == j || j + i == arr4.length - 1)
                    arr4[i][j] = 1;
                System.out.printf("%d ", arr4[i][j]);
            }
            System.out.println();
        }

        System.out.println("---№4-------------");

        /*
         * 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы
         */

        int[] arr5 = new int[10];
        int minN, maxN;

        for (int i  = 0; i < arr5.length; i++){                 //Инициализация массива случайными числами
            arr5[i] = 1 + (int)(Math.random() * 100);
        //    System.out.printf("%d ", arr5[i]);
        }

        minN = maxN = arr5[0];                                  //Нахождение максимального и минимального числа
        for (int i = 0; i < arr5.length; i++){
            if(minN > arr5[i])
                minN = arr5[i];
            if (maxN < arr5[i])
                maxN = arr5[i];
        }
        System.out.printf("\nMIN Num = %d\nMAX Num = %d\n", minN, maxN);
        System.out.println("---№5-------------");

        /*
         * 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
         * метод должен вернуть true если в массиве есть место,
         * в котором сумма левой и правой части массива равны.
         * Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
         * checkBalance ([2, 1, 1, 2, 1]) → false,
         * checkBalance ([10, || 10]) → true,
         * граница показана символами ||,
         * эти символы в массив не входят.
         */

        int[] arr6 = new int[10];
        for (int i  = 0; i < arr6.length; i++){                 //Инициализация массива случайными числами [ 1 : 2 ]
            arr6[i] = 1 + (int)(Math.random() * 2);
            //    System.out.printf("%d ", arr6[i]);
        }
        System.out.println(HomeWork6(arr6));
        System.out.println("---№6-------------\n");

        /*
         * 7. **** Написать метод, которому на вход подается одномерный массив и число n
         * (может быть положительным, или отрицательным),
         * при этом метод должен сместить все элементымассива на n позиций.
         * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
         */

        int[] arr7 = new int[25];
        int val = -11;
        for (int i  = 0; i < arr7.length; i++)             //Инициализация массива случайными числами
            arr7[i] = (int)(Math.random() * 99);
            //arr7[i] = i;
        HomeWork7(arr7, val);

        for (int i : arr7)
            System.out.print(i+ " ");

        System.out.println("\n\"---№7-------------");
    }
/* ******************************************************************************************************** *
 * ******************************************************************************************************** */

    /*
     * Метод к заданию №6
     */

    static boolean HomeWork6(int[] arr6){
        int midH = arr6.length / 2;
        int midL = arr6.length - midH;
        int sumh, suml;
        sumh = suml = 0;


        for (int i = 0; i < midL; i++)
            suml += arr6[i];
        for (int i = midL; i < arr6.length; i++)
            sumh += arr6[i];

        System.out.printf("\n%d - suml\n%d - sumh\n", suml, sumh);
        return suml == sumh ?  true:  false;
    }

    /*
     * Метод к заданию №7
     */

    static void HomeWork7(int[] arr7, int val){
        for (int i : arr7)
            System.out.printf("%d ", i);

        System.out.println();

        for (int i = 0 ; i < Math.abs(val); i++){
             if (val > 0) {
                for (int j = arr7.length - 1; j > 0; j--) {
                    arr7[j] ^= arr7[j - 1];
                    arr7[j - 1] ^= arr7[j];
                    arr7[j] ^= arr7[j - 1];
                }
            }
            else if (val < 0){
                for (int j = 0; j < arr7.length - 1; j++) {
                    arr7[j + 1] ^= arr7[j];
                    arr7[j] ^= arr7[j + 1];
                    arr7[j + 1] ^= arr7[j];
                }
            }
            else break;
        }
    }
}
