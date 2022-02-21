package FifthLessonHomeWork;

import javafx.concurrent.Worker;

// Задание 1.
// Создать класс "Сотрудник"
// с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
    String name;
    String post;
    String email;
    long phoneNumber;
    int salary;
    int age;

    // Задание 2.
    // Конструктор класса должен заполнять эти поля при создании объекта.
    Employee(String name, String post, String email, long phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // Задание 3.
    // Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    void infoEmployee(){
        System.out.println("Имя : " + this.name + " | " + "Должность : " + this.post + " | " + "Почта : " + this.email + " | " + "Телефон : " + this.phoneNumber + " | " + "Зарплата : " + this.salary + " | " + "Возраст : " + this.age);

       }
}
