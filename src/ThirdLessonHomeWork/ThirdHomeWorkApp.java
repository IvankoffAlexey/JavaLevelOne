package ThirdLessonHomeWork;

import java.util.Arrays;

public class ThirdHomeWorkApp {
    public static void main(String[] args) {
        //Task 1.
        // Задать целочисленный одномерный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;

//        int[] myArray = new int[10]; // Объявление одномерного массива myArray
//        myArray[0] = 1;
//        myArray[1] = 1;
//        myArray[2] = 0;
//        myArray[3] = 0;
//        myArray[4] = 1;    // Присваивание значений
//        myArray[5] = 0;
//        myArray[6] = 1;
//        myArray[7] = 1;
//        myArray[8] = 0;
//        myArray[9] = 0;
        int[] myArray = {1,1,0,0,1,0,1,1,0,0}; // Объявление массива с присваиванием значений
        changeNumber(myArray);

        //Task 2.
        // Задать пустой целочисленный массив длиной 100.
        // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

        int[] myHundredArray = new int[100];
        hundredNumber(myHundredArray);

        //Task 3.
        // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] myRandomArray = {1,5,3,2,11,4,5,2,4,8,9,1};
        randomNumber(myRandomArray);



        // Task.4
        // Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
        // заполнить его диагональные элементы единицами
        // (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему
        // принципу: индексы таких элементов равны,
        // то есть [0][0], [1][1], [2][2], …, [n][n];

        int[][] myQuadArray = new int[10][10];
        myQuad(myQuadArray);

        //Task 5.
        // Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len,
        // каждая ячейка которого равна initialValue;

        System.out.print(Arrays.toString(twoArgs(5, 7)));


        //Task 6. * Задать одномерный массив и найти в нем
        // минимальный и максимальный элементы
        int[] minAndMaxArray = {2,4,5,6,7,8,9,7};
        findMinAndMax(minAndMaxArray);

        //Task 7. ** Написать метод, в который передается не пустой одномерный
        // целочисленный массив. Метод должен вернуть true, если в массиве
        // есть место, в котором сумма левой и правой части массива равны.

        int[] balanceArray = {8,4,3,5,6,4};
        System.out.println(findBalance(balanceArray));

        //Task8. *** Написать метод, которому на вход подается одномерный массив
        // и число n (может быть положительным, или отрицательным), при этом метод
        // должен сместить все элементы массива на n позиций. Элементы смещаются
        // циклично. Для усложнения задачи нельзя пользоваться вспомогательными
        // массивами.

        shiftArray(3, 5);

    }

    public static void changeNumber(int[] myArray) {
        System.out.println("Task.1");
        System.out.println(Arrays.toString(myArray));
            for (int i = 0; i < myArray.length; i++) {
//                а. С использованием условных операторов
//
//                if (myArray[i] == 0) {
//                    myArray[i] = 1;
//                } else {
//                    myArray[i] = 0;
//                }
//                б. Математический способ (без использования операторов)
//                myArray[i] = 1 - myArray[i];

//                в. При помощи тернарного оператора
                  myArray[i] = (myArray[i] == 1) ? 0 : 1;
            }
        System.out.println(Arrays.toString(myArray));
        System.out.println();
    }

    public static void hundredNumber(int[] myHundredArray) {
        System.out.println("Task.2");
        System.out.println(Arrays.toString(myHundredArray));

            for (int i = 0; i < myHundredArray.length; i++){
            myHundredArray[i] = i + 1;
            }

        System.out.println(Arrays.toString(myHundredArray));
        System.out.println();
    }

    public static void randomNumber(int[] myRandomArray) {
        System.out.println("Task.3");
        System.out.println(Arrays.toString(myRandomArray));
        for (int i = 0; i < myRandomArray.length; i++) {
            if (myRandomArray[i] < 6) {
                myRandomArray[i] = myRandomArray[i] * 2;
            } else {
                myRandomArray[i] = myRandomArray[i];
            }
        }
        System.out.println(Arrays.toString(myRandomArray));
        System.out.println();
    }

    public static void myQuad(int[][] myQuadArray) {
        System.out.println("Task.4");
        int x = 1;
        System.out.println("\n ********** Нули ********** \n");
        for ( int i = 0; i < myQuadArray.length; i ++) {
            for (int j = 0; j < myQuadArray.length; j++) {
                myQuadArray[i][j] = 0; // Присваиваем значение ячейкам массива
                System.out.print(myQuadArray[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("\n **** Первая диагональ **** \n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    myQuadArray[i][j] = x;
                } else {
                    myQuadArray[i][j] = x - 1;
                }
                System.out.print(myQuadArray[i][j] + "  ");
            }
            System.out.println(); // Для переноса на следующую строку
        }
        System.out.println();

        System.out.println("\n **** Обе диагонали **** \n");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j || (i + j) == (myQuadArray.length) -1) {
                    myQuadArray[i][j] = x;
                } else {
                    myQuadArray[i][j] = x - 1;
                }
                System.out.print(myQuadArray[i][j] + "  ");
            }
            System.out.println(); // Для переноса на следующую строку
        }
        System.out.println();
    }

    public static int[] twoArgs(int len, int initialValue){
        System.out.println("Task.5");
        int[] myArray = new int[len];
        for (len = 0; len < myArray.length; len++) {
            myArray[len] = initialValue;
        }
        return myArray;
    }

    public static void findMinAndMax(int[] minAndMaxArray){
        System.out.println("\n");
        System.out.println("Task.6");
        System.out.println("Найти min и max для массива : \n");
        int min = minAndMaxArray[0];
        int max = minAndMaxArray[0];

        // простой перебор массива.
        for (int i = 1; i < minAndMaxArray.length; i++)
        {
            if (min > minAndMaxArray[i])
            {
                min = minAndMaxArray[i];
            }

            if (max < minAndMaxArray[i])
            {
                max = minAndMaxArray[i];
            }
        }
        System.out.println(Arrays.toString(minAndMaxArray));
        System.out.println();
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
        System.out.println();

    }

    public static boolean findBalance(int[] balanceArray) {
        System.out.println("Task.7");
        System.out.println("Сбалансирован ли массив ? \n");
        int leftsum = 0;


        for (int i = 0; i < balanceArray.length; i++) {
            leftsum += balanceArray[i];
            int rightsum = 0;
            for (int j = (i + 1); j < balanceArray.length; j++) {
                rightsum += balanceArray[j];

            }
            if (rightsum == leftsum) {
                System.out.println("Да! В массиве есть точка равновесия.");
                System.out.println(leftsum + " " + Arrays.toString(balanceArray) + " " + rightsum);
                System.out.println(leftsum + " ||| " + rightsum);
                return true;
            }
        }
        System.out.println("Нет! В массиве нет точки равновесия.");
        return false;
    }
    public static void shiftArray(int n, int m) {
        System.out.println("\nTask.8");
        System.out.println("Двигаем массив.\n");
        int a;
        int i;
        int[] arr = {4,5,8,10,12,11};

        System.out.println(Arrays.toString(arr) + " Задан массив \n");
        for (i = 1; i <= n; i++) { // n - Число повторений
            a = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) { // Логика сдвига
                arr[j] = arr[j - 1];
            }
            arr[0] = a;
        }

        System.out.println(Arrays.toString(arr) + " Сдвиг вправо  на : " + n + " \n");
        for (i = 1; i <= m; i++) { // m - Число повторений
                a = arr[0];
             for (int j = 0; j < arr.length - 1; j++) { // Логика сдвига
              arr[j] = arr[j + 1];
             }
            arr[arr.length - 1] = a;
        }

        System.out.println(Arrays.toString(arr) + " Сдвиг влево   на : " + m + " \n");
    }

}
