package FifthLessonHomeWork;

public class FifthHomeWorkApp {
    public static void main(String[] args) {
        // Задание 4.
        // Создать массив из 5 сотрудников.

        Employee[] workArray = new Employee[5];
            workArray[0] = new Employee("Ivan Ivanov", "Engeneer", "II@mai.ru", 89291928383L, 10000, 35);
            workArray[1] = new Employee("Petr Petrov", "Master engeneer", "master@m.ru", 89998765432L, 30000, 50);
            workArray[2] = new Employee("Denis Denisov", "Manager", "manage@m.ru", 89008887766L, 25000, 27);
            workArray[3] = new Employee("Dmitrii Dmitriev", "Driver", "drive@m.ru", 88007777777L, 20000,25);
            workArray[4] = new Employee("Alexey Alexeev", "Tester", "test@m.ru", 88001234567L, 15000, 20);


        // Задание 5.
        // С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (int i = 0; i < workArray.length; i++){
            int j = 40;
            if (j < workArray[i].age) {
                workArray[i].infoEmployee();
            }
        }
    }
}
