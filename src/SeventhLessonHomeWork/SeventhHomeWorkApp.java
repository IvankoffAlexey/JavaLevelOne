package SeventhLessonHomeWork;

public class SeventhHomeWorkApp {
    public static void main(String[] args) {

        // Задание 1.
        // Расширить задачу про котов и тарелки с едой.

        // Задание 5.
        // Создать массив котов и тарелку с едой, попросить всех котов
        // покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
        Cat[] catsArray = new Cat[3];
            catsArray[0] = new Cat("Васька", 30);
            catsArray[1] = new Cat("Барсик", 20);
            catsArray[2] = new Cat("Рыжик", 5);

            // Вариант с присваиванием Cat[] catsArray = {
            //                               new Cat("Васька", 30),
            //                               new Cat("Барсик", 20),
            //                               new Cat("Рыжик", 5)
            //                          };



        Plate kitecat = new Plate(25);
        System.out.println("Тарелку пополнили на : " + kitecat.plateInfo() + " ед. корма");

        for (int i = 0; i < catsArray.length; i++){
            catsArray[i].eat(kitecat);
            System.out.println("В тарелке осталось   : " + kitecat.plateInfo() + " ед. корма");
        }

        kitecat.increaseFood(50);
        System.out.println(" * * * Хозяин добавил в тарелку корм * * * ");
        System.out.println("Тарелку пополнили на : " + kitecat.plateInfo() + " ед. корма");


        // Перебор массива с помощью for-each Idea сама исправила первый цикл, но первый я оставил как есть.
        // For-each — это разновидность цикла for, которая используется, когда нужно обработать все элементы массива
        // или коллекции. “For each” с английского так и переводится — “для каждого”.
        // Собственно, само словосочетание foreach в этом цикле не используется.
        // Синтаксис - for (тип_данных имя_переменной : массив/коллекция)
        for (Cat cat : catsArray){
            cat.eat(kitecat);
            System.out.println("В тарелке осталось   : " + kitecat.plateInfo() + " ед. корма");
        }

    }
}
