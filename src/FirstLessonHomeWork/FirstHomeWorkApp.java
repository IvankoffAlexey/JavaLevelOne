package FirstLessonHomeWork;

//1. Создать пустой проект в IntelliJ IDEA,
// создать класс HomeWorkApp, и прописать в нем метод main().

public class FirstHomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Задание 2.Создан метод printThreeWords() отображающий в столбец три слова: Orange, Banana, Apple. \n");
        printThreeWords();
        System.out.println("Задание 3. Создан метод checkSumSign(), выведено сообщение с результатом выполнения. \n");
        checkSumSign();
        System.out.println("Задание 4. Создан метод printColor(), выведено сообщение с результатом выполнения. \n");
        printColor();
        System.out.println("Задание 5. Создан метод compareNumbers(), выведено сообщение с результатом выполнения. \n");
        compareNumbers();
        System.out.println("Задание 6. Вызвать методы из пунктов 2-5 из метода main() и проверить корректность их выполнения. \n");
    }


    //2. Создайте метод printThreeWords(),
    // который при вызове должен отпечатать
    // в столбец три слова: Orange, Banana, Apple.
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple \n");
    }

    //3. Создайте метод checkSumSign(),
    // в теле которого объявите две int переменные a и b,
    // и инициализируйте их любыми значениями, которыми захотите.
    // Далее метод должен просуммировать эти переменные,
    // и если их сумма больше или равна 0,
    // то вывести в консоль сообщение “Сумма положительная”,
    // в противном случае - “Сумма отрицательная”;
    public static void checkSumSign(){
        int a = 10;
        int b = -20;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная. \n");
            } else {
            System.out.println("Сумма отрицательная. \n");
        }
    }

    //4. Создайте метод printColor() в теле которого задайте
    // int переменную value и инициализируйте ее любым значением.
    // Если value меньше 0 (0 включительно), то в консоль
    // метод должен вывести сообщение “Красный”, если лежит в пределах
    // от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
    // если больше 100 (100 исключительно) - “Зеленый”;
    public static void printColor() {
        int value = 1;
        if (value <= 0) {
            System.out.println("Красный \n");
        } else if (value >0 && value <= 100) {
            System.out.println("Желтый \n");
        } else {
            System.out.println("Зеленый \n");
        } // Вариант с другим исполнением
          // else if (value > 100) {
          // System.out.println("Зеленый");
          // }
    }

    //5. Создайте метод compareNumbers(),
    // в теле которого объявите две int переменные a и b,
    // и инициализируйте их любыми значениями, которыми захотите.
    // Если a больше или равно b, то необходимо вывести в
    // консоль сообщение “a >= b”, в противном случае “a < b”;

    public static void compareNumbers() {
        int a = 5;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b \n");
        } else {
            System.out.println("a < b \n");
        }
    }
}
