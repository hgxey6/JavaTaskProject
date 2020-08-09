package ObjectOrientedProgrammingTask.Task8Animals;

class Animal {

    private final String food;
    private final String location;
    private String name = "Животное";

    //Конструктор
    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    //Клон
    public Animal(Animal object) {
        food = object.food;
        location = object.location;
        name = object.name;
    }

    //Методы
    public void makeNoise() {
        System.out.println(name + " шумит");
    }

    public void sleep() {
        System.out.println(name + "Животное спит");
    }

    public void eat() {
        System.out.println(name + " ест");
    }

    // Так как name с каждым классом меняется, был добавлен геттер и сеттер
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Геттеры
    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
