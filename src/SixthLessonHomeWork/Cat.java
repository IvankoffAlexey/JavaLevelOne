package SixthLessonHomeWork;
// Задание 1.
// Создать классы Собака и Кот с наследованием от класса Животное.
public class Cat extends Animal {

    // Задание 4. * Добавить подсчет созданных котов, собак и животных.
    static int count;

    Cat(String name, int run, int swim) {
        super(name, run, swim);
        count++;
    }

    // Задание 3.
    // У каждого животного есть ограничения на действия
    // кот не умеет плавать.
    @Override
    void swim(int swim) {
        {
            System.out.println(this.getClass().getSimpleName() + " " + name + " не умеет плавать ");
        }
    }
}

