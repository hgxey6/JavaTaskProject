package ObjectOrientedProgrammingTask.Task8Animals;

class Horse extends Animal {

    public Horse(String food, String location, String name) {
        super(food, location);
        setName(name);
    }

    public void jump() {
        System.out.println(getName() + " прыгает");
    }
}
