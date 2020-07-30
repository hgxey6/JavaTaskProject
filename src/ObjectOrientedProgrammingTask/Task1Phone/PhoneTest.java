package ObjectOrientedProgrammingTask.Task1Phone;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phone = new Phone[3];
        phone[0] = new Phone("+7-771-453-23-99", "ZTE", 500);
        phone[1] = new Phone("+3-675-555-78-14", "Huawei");

        phone[2] = new Phone();
        phone[2].setWeight(600);

        for (Phone p : phone)
            System.out.println("Number: " + p.getNumber() + ", " +
                    "Model: " + p.getModel() + ", " + "Weight: " + p.getWeight() + ";");

        phone[0].receiveCall("Дмитрий","8-777-999-77-99");
    }
}
