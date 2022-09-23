public class ProductManager {
    public void Add(Product product) {
        //JDBC can be here
        System.out.println("Product added. " + product.getName());
    }
}
