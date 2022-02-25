package SeventhLessonHomeWork;

public class Cat {
    private final String name;
    private final int appetite;

    // Задание 3.
    // Каждому коту нужно добавить поле сытость(голод) (когда мы создаем котов, они голодны (hungry = true)).
    // Если коту удалось покушать (хватило еды), сытость = true(hungry = false).
    private boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        hungry = true;
    }

    // 4. Считаем, что
    // если коту мало еды в тарелке,
    // то он её просто не трогает,
    // то есть не может быть наполовину сыт
    // (это сделано для упрощения логики программы).
    public void eat(Plate kitecat){
        if (kitecat.hasEnoughFoodFor(appetite) && hungry){
            System.out.println(name + " съел " + appetite + " наелся до отвала и пошел спать.");
            kitecat.decreaseFood(appetite);
            hungry = false;
        } else if (!kitecat.hasEnoughFoodFor(appetite)) {
            System.out.println(name + " сильно проголодался и ему этого мало!");
        } else if (!hungry) {
            System.out.println(name + " уже сыт, и сладко спит!");
        }
    }
}
