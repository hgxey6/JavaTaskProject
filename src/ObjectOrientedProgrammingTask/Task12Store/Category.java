package ObjectOrientedProgrammingTask.Task12Store;

/*Создать класс Категория, имеющий переменные имя и массив товаров.
Создать несколько объектов класса Категория*/
public class Category {
    private final String name;
    private final Product[] products;

    public Category(String name, Product products, int productSum) {
        //productSum - количество товаров
        this.name = name;
        this.products = new Product[productSum];
    }
}
