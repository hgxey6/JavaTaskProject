package ObjectOrientedProgrammingTask.Task1;

public class PhoneTest {
    public static void main(String[] args) {
        //Создаем 3 объекта, храним значение в виде массива (б)
        Phone[] phone = new Phone[3];
        phone[0] = new Phone("+7-771-453-23-99", "ZTE", 500);
        phone[1] = new Phone("+3-675-555-78-14", "Huawei");
        phone[2] = new Phone();

        phone[2].setWeight(600);
        //Выводим данные (в)
        for (Phone p : phone)
            System.out.println("Number: " + p.getNumber() + ", " +
                    "Model: " + p.getModel() + ", " + "Weight: " + p.getWeight() + ";");

        for (Phone p : phone) {
            p.sendMessage();
        }
    }
}
