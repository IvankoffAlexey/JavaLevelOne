package SixthLessonHomeWork;

public class SixthHomeWorkApp {
    public static void main(String[] args) {

    // Задание 3.
    // У каждого животного есть ограничения на действия
    // (бег: кот 200 м., собака 500 м.;
    // плавание: кот не умеет плавать, собака 10 м.).
        Cat firstCat = new Cat("Дуська", 200, 0);
        Cat secondCat = new Cat("Мурзик", 200, 0);
        Dog firstDog = new Dog("Тузик", 500, 10);
        Dog secondDog = new Dog("Жучка", 500, 10);

        System.out.println("            Бег              \n");

        firstDog.run(500);
        secondDog.run(501);
        firstCat.run(200);
        secondCat.run(201);

        System.out.println("\n          Плавание           \n");

        firstDog.swim(7);
        secondDog.swim(11);
        firstCat.swim(10);
        secondCat.swim(2);

        System.out.println("\n         Всего участников          \n");
        System.out.println("Учавствовало кошек          :  " + Cat.count);
        System.out.println("Учавствовало собак          :  " + Dog.count);
        System.out.println("Всего животных учавствовало :  " + Animal.count);
    }
}
