package javaEDU.oop.Task1Phone;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phone = new Phone[3];
        phone[0] = new Phone();
        phone[1] = new Phone("87717754499", "Iphone");
        phone[2] = new Phone("84564567899", "LG", 800);

        for (Phone p : phone) System.out.println(p.toString());
    }
}
