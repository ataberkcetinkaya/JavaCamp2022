public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name = "Lenovo";
        product.price = 12;
        productManager.add(product);

    }
}