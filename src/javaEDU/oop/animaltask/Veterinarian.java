package javaEDU.oop.animaltask;


import javaEDU.oop.animaltask.pets.Pet;

class Veterinarian {

    public void treatAnimal(Pet pet) {
        System.out.println("Name - " + pet.getName());
        System.out.println("Food - " + pet.getFood());
        System.out.println("Location - " + pet.getLocation());
        System.out.println();
    }
}
