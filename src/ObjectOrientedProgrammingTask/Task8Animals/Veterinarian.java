package ObjectOrientedProgrammingTask.Task8Animals;

class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println("Name - " + animal.getName());
        System.out.println("Food - " + animal.getFood());
        System.out.println("Location - " + animal.getLocation());
        System.out.println();
    }
}
