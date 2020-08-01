package ObjectOrientedProgrammingTask.Task8Animals;

class Animal {
    private String food;
    private String location;
    private String name;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }


    public void makeNoise() {
        System.out.println(getName() + "шумит");
    }

    public void eat() {
        System.out.println(getName() + "кушает");
    }

    public void sleep() {
        System.out.println(getName() + "спит");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
