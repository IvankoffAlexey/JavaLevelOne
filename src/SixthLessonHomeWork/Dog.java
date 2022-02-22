package SixthLessonHomeWork;
// Задание 1.
// Создать классы Собака и Кот с наследованием от класса Животное.
public class Dog extends Animal {


    // Задание 4. * Добавить подсчет созданных котов, собак и животных.
    static int count;

    Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        count++;
    }
}
