package ObjectOrientedProgrammingTask.Task1Phone;

/*
 * НЕ ВЫПОЛНЕН: (з)Вызвать из конструктора с тремя параметрами конструктор с двумя.
 * ПРИЧИНА: Не знаю как это реализовать.
 */
class Phone {
    private String number;
    private String model;
    private double weight;

    //Конструкторы
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    //Выводит имя звонящего
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    //Перегруженный метод
    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " , номер телефона: " + number);
    }

    //Геттеры
    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }


    //Сеттеры
    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
