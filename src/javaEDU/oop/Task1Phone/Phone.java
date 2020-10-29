package javaEDU.oop.Task1Phone;

class Phone {
    private String number;
    private String model;
    private double weight;

    //Конструкторы
    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model); //Вызов из конструктора 3 параметрами, конструктор с 2
        this.weight = weight;
    }

    /**
     * @return переопределяет метод класса Object
     * Возвращает имя класса, номер, модель и вес
     */
    public String toString() {
        return getClass().getName()
                + "[number=" + number
                + ",model=" + model
                + ",weight" + weight
                + "]";
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
