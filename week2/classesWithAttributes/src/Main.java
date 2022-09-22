public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "PS4";
        product.id = 1;
        product.description = "smthng";
        product.price = 6000;
        product.stockAmount = 4;

        ProductManager productManager = new ProductManager(); //Will do the stuff and manage the Product class
        productManager.Add(product);

    }
}