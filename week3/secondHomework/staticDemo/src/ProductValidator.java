public class ProductValidator {

    static {
        System.out.println("Static constructor"); //this one can run even if u have not 'new' this class
    }

    public static boolean isValid(Product product) {
        if(product.price > 10 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void bisey() { //to call this inside another class, we have to 'new' this class. bc this one not includes the static keyword

    }
}
