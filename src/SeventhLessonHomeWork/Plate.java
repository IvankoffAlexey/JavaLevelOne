package SeventhLessonHomeWork;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }


    // 2. Сделать так,
    // чтобы в тарелке с едой не могло получиться
    // отрицательного количества еды
    // (например, в миске 10 еды,
    // а кот пытается покушать 15-20).
    public boolean hasEnoughFoodFor(int appetite){
        return appetite <= food;
    }

    public void decreaseFood(int appetite){
        if (hasEnoughFoodFor(appetite)) {
            food = food - appetite;
        }
    }

    public int plateInfo(){
        return food;
    }

    // 6. Добавить в тарелку метод,
    // с помощью которого можно было бы
    // добавлять еду в тарелку.
    public void increaseFood(int countOfFood){
        food += countOfFood;
    }

}
