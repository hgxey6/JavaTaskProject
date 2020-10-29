package javaEDU.oop.Task12Store;

public class Main {
    public static void main(String[] args) {
        //Первый массив товаров
        Product[] products1 = new Product[3];
        products1[0] = new Product("Soap", 500, 100);
        products1[1] = new Product("shampoo", 700, 55);
        products1[2] = new Product("towel", 300, 77);

        //Категория хозтовары
        Category householdGoods = new Category("household goods", products1, products1.length);

        //Второй массив товаров
        Product[] products2 = new Product[3];
        products2[0] = new Product("Computer", 50000, 80);
        products2[1] = new Product("IPhone", 120000, 10);
        products2[2] = new Product("TV", 300000, 40);

        //Категория электроника
        Category electronics = new Category("electronics", products2, products2.length);

        //Массив купленных товаров
        Product[] buyProducts = new Product[2];
        buyProducts[0] = products1[0];
        buyProducts[1] = products2[0];

        //Корзина
        Basket basket = new Basket(buyProducts);

        //User
        User user = new User("DD45", "rfvef353fd132@ds", basket);
    }
}
