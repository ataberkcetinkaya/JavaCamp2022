public class ProductManager {
    public void add(Product product) { //it will send the product data to the db from the manager class

        if(ProductValidator.isValid(product)) { //I can use the ProductValidator without 'new' it above, by givin the static keyword in ProductValidator Class
            System.out.println("Added.");
        } else {
            System.out.println("Failed");
        }

    }
}
