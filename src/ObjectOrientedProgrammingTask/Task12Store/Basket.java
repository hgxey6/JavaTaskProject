package ObjectOrientedProgrammingTask.Task12Store;

//Создать класс Basket, содержащий массив купленных товаров.
public class Basket {
    private Product[] buyProduct; //Купленные товары

    public Basket(Product[] buyProduct) {
        this.buyProduct = buyProduct;
    }

    public Product[] getBuyProduct() {
        return buyProduct;
    }

    public void setBuyProduct(Product[] buyProduct) {
        this.buyProduct = buyProduct;
    }
}
