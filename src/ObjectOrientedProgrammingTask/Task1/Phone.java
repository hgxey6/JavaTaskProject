package ObjectOrientedProgrammingTask.Task1;

/*
 * Буквами обозначены подзадачи. Решил написать код по алфавиту.
 * Класс был разделен на Phone и PhoneTest, так как не удалось создать два класса в одном,
 * как показано в книге.
 * Некоторые подзадачи в классе PhoneTest.
 * НЕ ВЫПОЛНЕН: (з)Вызвать из конструктора с тремя параметрами конструктор с двумя.
 * ПРИЧИНА: Не знаю как это реализовать.
 */
class Phone {
    //Данные смартфона (а)
    private String number;
    private String model;
    private double weight;

    //Выводит на экран имя звонящего (г)
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    //Геттеры (г)
    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    //Конструктор с 3 параметрами (д)
    public Phone(String num, String mod, double w) {
        number = num;
        model = mod;
        weight = w;
    }

    //С 2 параметрами (е)
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    //Без параметров (ж)
    public Phone() {

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

    // (и)
    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " , номер телефона: " + number);
    }

    public void sendMessage() {
        //System.out.println(.getNumber());
    }
}
