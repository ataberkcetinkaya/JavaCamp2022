public class Main {
    public static void main(String[] args) {
        //constructor with parameters
        //Product product = new Product(1, "PS5", "smthng2", 7000, 5);
        //both can be used w overloading in Product class
        Product product = new Product();
        product.setName("PS4");
        product.setId(1);
        product.setDescription("smthng");
        product.setPrice(6000);
        product.setStockAmount(4);
        System.out.println(product.getCode());

        ProductManager productManager = new ProductManager(); //Will do the stuff and manage the Product class
        productManager.Add(product);

    }
}