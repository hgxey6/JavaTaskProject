package ObjectOrientedProgrammingTask.Task8Animals;

public class Main {

    public static void main(String[] args) {
        Animal[] animal = new Animal[3];// Создаем массив животных
        //Почему то нельзя использовать уникальные методы
        animal[0] = new Cat("Рыба", "Дом", "Персидская кошка");//animal[0].play() Error
        animal[1] = new Dog("Мясо", "Квартира", "Овчарка");
        animal[2] = new Horse("Сено", "Конюшня", "Лошадь");

        Veterinarian vet = new Veterinarian();

        for (Animal i : animal) {
            vet.treatAnimal(i);
        }
    }

}
