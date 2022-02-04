package SecondLessonHomeWork;

public class SecondHomeWorkApp {
    public static void main(String[] args) {
        int l = 2022;
        int x = 22;
        int y = -7;
        int z = 0;
        String message = "Привет!";

        boolean flag = checkSum(x, y);
        System.out.println("Задание 1. Проверка суммы на соответствие диапазону(10...20) . \n");
        System.out.println("Сумма введенных чисел : " + (x+y));
        System.out.println("Результат проверки    : " + flag + "\n");

        System.out.println("Задание 2. Проверка заданного числа и вывод результата. \n");
        checkNumber(y);

        boolean flag1 = trueOfFalse(x);
        System.out.println("Задание 3. Проверка числа и вывод результата,  \n" +
                "           если число положительное - false, \n " +
                "          а если отрицательное     - true");
        System.out.println("Введенное число    : " + x);
        System.out.println("Результат проверки : " + flag1 + "\n");

        System.out.println("Задание 4. Вывести строку заданное количество раз. \n");
        printMessage(z, message);

        boolean flag2 = leapYear(l);
        System.out.println("Задание 5*. Написать метод определяющий високосный год или нет. \n");
        System.out.println("Определяем является ли " + l + " год - високосным");
        System.out.println("Результат : " + flag2);


    }

    // 1. Написать метод, принимающий на вход два целых числа
    // и проверяющий, что их сумма лежит в пределах от 10
    // до 20 (включительно), если да – вернуть true,
    // в противном случае – false.
    public static boolean checkSum(int a, int b){
        return a+b > 10 && a+b <=20;
    }

    // 2. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или
    // отрицательное. Замечание: ноль считаем положительным числом.
    public static void checkNumber(int a){
        if (a >= 0){
            System.out.println("Передано положительное число" + " : " + a + "\n");
        } else {
            System.out.println("Передано отрицательное число" + " : " + a + "\n");
        }
    }

    // 3. Написать метод, которому в качестве параметра передается
    // целое число. Метод должен вернуть true, если число отрицательное,
    // и вернуть false если положительное.
    public static boolean trueOfFalse(int a){
        return a < 0;
    }

    // 4. Написать метод, которому в качестве аргументов передается строка
    // и число, метод должен отпечатать в консоль указанную строку,
    // указанное количество раз;
    public static void printMessage(int a, String message){
        while (a < 10) {
            System.out.println(message + " " + a);
            a++;
        }
//       / for(int i = 10; i > a; i--) {
//            System.out.println(message + " " + i);
//        }
        System.out.println();
    }

    // 5. * Написать метод, который определяет, является ли год високосным,
    // и возвращает boolean (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом
    // каждый 400-й – високосный.
    public static boolean leapYear(int a) {
//       / if (a % 4 == 0 && a % 100 != 0) {
//            return true;
//        } else if (a % 400 == 0){
//            return true;
//        } else {
//            return false;
//        }
        return (a % 4 == 0 && a % 100 != 0) || a % 400 == 0;
    }
}
