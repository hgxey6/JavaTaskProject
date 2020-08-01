package ObjectOrientedProgrammingTask.Task12Store;

public class Main {
    public static void main(String[] args) {
        Product soap = new Product("Soap", 500, 100);
        Category soapCategory = new Category("Only soap", soap, 5);
    }
}
