package EighthLessonHomeWork;

import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    static void guessWord() {
        String[] words = {
                "apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"
        };
        Scanner sc = new Scanner(System.in);       // объявляем сканер
        Random random = new Random();                   // объявляем рандом

        int wordLength = words.length;                  // узнаем длину массива(количество слов) и сохраняем в переменной

        int guess = random.nextInt(wordLength);         // запись в переменную выбранного рандом номера ячейки из массива слов
        String hiddenWord = words[guess];               // запись в переменную данных(слова) из выбранной(рандом) ячейки массива слов
        int hiddenWordLength = hiddenWord.length();     // запись в переменную длины(количество символов) значения данных(слова)

        System.out.printf("Загадано слово: %s\n", hiddenWord);  // вывод загаданного слова

        String input;                                   // объявляем переменную для ввода слова
        int inputLength;                                // объявляем переменную длины вводимого слова

        int count;                                      // счетчик

        boolean flag = true;                            // объявляем переменную и присваиваем значение "true" для завершения "Do-while"
        // только при условии - слово отгадано, если слово не отгадано, то значение
        // переменной меняется на "false" и цикл "while" вложенный в "Do-while" перезапускается.

        String placeholder = "#";                       // объявляем переменную для отображения символа маски скрытого слова
        String know;                                    // переменная для записи совпадающих символов и несовпадающих символов с маской
        int mask;                                       // переменная задающая длину маски слова


        do {                                            // Do-while цикл сначала исполняет тело цикла, а затем проверяет его условия.
            System.out.println(" * * * * * Введите слово: * * * * * ");
            count = 0;

            while (!sc.hasNext()) {                     // While будет выполняться пока !scanner.hasNext() будет возвращать true (== !false),
                // т.е. пока не будет введено слово
                sc.next();
            }

            input = sc.nextLine().toLowerCase();   // записываем в переменную введенное в консоли слово и переводим в нижний регистр
            inputLength = input.length();               // записываем длину введенного слова
            know = "";                                  // присваиваем пустое значение

            // Здесь идет посимвольное сравнение, если символ совпал то он добавляется в переменную,
            // а если нет, то ставится маска скрывающая не совпадающий символ
            for (int i = 0; i < inputLength && i < hiddenWordLength; i++) {
                if (input.charAt(i) == hiddenWord.charAt(i)) {
                    know += input.charAt(i);
                    count++;                            // Счетчик тикает при совпадении символа
                } else {
                    know += placeholder;
                }
            }
            // Здесь добавляется маска скрывающая длину слова
            mask = 15 - know.length();
            for (int i = 0; i < mask; i++) {
                know += placeholder;
            }
            // Здесь проверяется соответствие длины слова и количества угаданных символов,
            // при совпадении переменной "flag" присваивается значение "false". Значит слово отгадано и игра закончена.
            if (inputLength == hiddenWordLength && count == hiddenWordLength) {
                flag = false;
                System.out.println(" * * * * * Слово отгадано! * * * * * ");
            } else if (count > 0) {
                System.out.println(know);               // если слово не отгадано, то показываются отгаданные символы
            } else {
                System.out.println(" * * * * * Слово не отгадано! * * * * * \n");
            }

        } while (flag);                                 // Цикл "do-while" будет выполняться пока "flag" == "true".
    }
}
