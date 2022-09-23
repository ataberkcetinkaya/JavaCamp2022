public class Product {
    //attribute or field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String code; // will be read-only

    //getter
    public int getId() { //that will give us the id so this part with return statement
        return id;
    }
    //setter
    public void setId(int id) { //that part will be just for setting, so its void...
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getCode() {
        return this.name.substring(0,1) + id; //can do other stuff here
    }

}
