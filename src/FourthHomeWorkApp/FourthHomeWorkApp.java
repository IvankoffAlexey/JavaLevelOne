package FourthHomeWorkApp;

import java.util.Random;
import java.util.Scanner;

public class FourthHomeWorkApp {

    // Объявляем поля класса.
    // Особенность в том, что они хранят свое состояние
    // для всех функций(методов) этого класса,
    // в которых их можно использовать.

    public static char[][]  map;
    public static final int SIZE = 3;

    public static int DOTS_TO_WIN = 3;

    public static char DOT_X = 'X';
    public static char DOT_O = 'O';
    public static char DOT_EMPTY = '*';

    public static Scanner scan = new Scanner(System.in);
    public static Random rand = new Random();


    public static void main(String[] args) {
        // Инициализация игрового поля
        initMap();

        // Вывод игрового поля
        printMap();

        //Циклично осуществляются ходы
        while (true) {

            // Ход игрока
            humanTurn();
            printMap();

            // Проверка на победу выполняется после хода каждого игрока
            if (isWin(DOT_X)) {
                System.out.println(" * * * Победили крестики! * * * ");
                break;
            }
            // Проверка на ничью выполняется после каждого хода,
            // после проверки на победу. Осуществляется перебор массива
            // с целью поиска пустых ячеек, если их нет - то ничья.
            if (isFull()) {
                System.out.println(" * * * Победила дружба! * * * ");
                break;
            }

            // Ход ИИ
            iiTurn();
            printMap();

            // Проверка на победу
            if (isWin(DOT_O)) {
                System.out.println(" * * * Победили нолики! * * * ");
                break;
            }

            // Проверка на ничью
            if (isFull()) {
                System.out.println(" * * * Победила дружба! * * * ");
                break;
            }
        }

    }

    //Инициализация игрового поля и заполнение всех ячеек DOT_EMPTY
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    //Нумерация строк и столбцов и вывод игрового поля в консоль
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++){
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Введите свой ход в формате X и Y");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;
        }   while (!isValid(x, y));

        map[y][x] = DOT_X;
    }

    public static void iiTurn() {
        int x;
        int y;

        do {
            System.out.println("Введите свой ход в формате X и Y");
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        }   while (!isValid(x, y));

        map[y][x] = DOT_O;
    }

    // Проверка хода
    // Сначала проверяем соответствие хода границам массива
    // Далее проверяем свободна ли ячейка
    public static boolean isValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    // Проверка на победу реализована в два этапа
    // первый проверка по горизонтали и вертикали
    // второй проверка по диагонали
    public static boolean isWin(char symb) {
        return checkWinHorAndVert (symb) || checkWinDiagonals(symb);

        // Исходный вариант проверки на победу для поля 3х3,
        // который необходимо переписать с использованием циклов.
//            if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//            if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//            if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//            if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//            if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//            if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//            if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//            if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
//            return false;

    }

    // Проверка по горизонтали и вертикали осуществляется с помощью использования счетчика
    // логика проста - если в проверяемой строке или столбце символ соответствует,
    // то счетчик увеличивается, а если нет - обнуляется.
    public static boolean checkWinHorAndVert(char symb) {
        int counter_H;
        int counter_V;
        for (int i = 0; i < SIZE; i++) {
            counter_H = 0;
            counter_V = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    counter_H++;
                } else {
                    counter_H = 0;
                }
                if (map[j][i] == symb) {
                    counter_V++;
                } else {
                    counter_V = 0;
                }
            }
            if (counter_H == DOTS_TO_WIN || counter_V == DOTS_TO_WIN)  return true;
        }
        return false;
    }

    // Проверка по диагонали сверху вниз и снизу вверх.
    public static boolean checkWinDiagonals(char symb){

        int counter_UpDown = 0;
        int counter_DownUp = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symb) {
                counter_UpDown++;
            } else {
                counter_UpDown = 0;
            }

            if (map[SIZE - i - 1][i] == symb) {
                counter_DownUp++;
            } else {
                counter_DownUp = 0;
            }
        }

        if (counter_UpDown == DOTS_TO_WIN || counter_DownUp == DOTS_TO_WIN ) {
            return true;
        }
        return false;
    }
}
