package SixthLessonHomeWork;

public class Animal {
    protected String name;
    protected int maxRun;
    protected int maxSwim;

    // Задание 4. * Добавить подсчет созданных котов, собак и животных.
    static int count;
    Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        count++;
    }

    // Задание 2.
    // Все животные могут бежать и плыть.
    // В качестве параметра каждому методу передается длина препятствия.
    // Результатом выполнения действия будет печать в консоль.
    // (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');

    // Задание 5. ** Очень желательно отсутствие дублирования кода у наследников
    // Вся логика вынесена в класс "Животные" кроме исключений @Override.
    void run(int run) {
        if (run <= maxRun) {
            System.out.println(this.getClass().getSimpleName() + " " + name + " пробежал " + run + " метров");
        } else {
            System.out.println(this.getClass().getSimpleName() + " " + name + " может пробежать только " + maxRun + " метров");
        }
    }

    void swim(int swim) {
        if (swim <= maxSwim) {
            System.out.println(this.getClass().getSimpleName() + " " + name + " проплыл " + swim + " метров");
        } else {
            System.out.println(this.getClass().getSimpleName() + " " + name + " может проплыть только " + maxSwim + " метров");
        }
    }

}
