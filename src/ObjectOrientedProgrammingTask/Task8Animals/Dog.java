package ObjectOrientedProgrammingTask.Task8Animals;

class Dog extends Animal {

    public Dog(String food, String location, String name) {
        super(food, location);
        setName(name);
    }

    public void protect() {
        System.out.println(getName() + " защищает дом");
    }
}