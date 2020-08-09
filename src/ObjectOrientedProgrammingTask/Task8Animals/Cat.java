package ObjectOrientedProgrammingTask.Task8Animals;

class Cat extends Animal {

    public Cat(String food, String location, String name) {
        super(food, location);
        setName(name);
    }

    public void play() {
        System.out.println(getName() + " играет");
    }
}
