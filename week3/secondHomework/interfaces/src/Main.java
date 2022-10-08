public class Main {
    public static void main(String[] args) {
        //ICustomerDal iCustomerDal =  new ICustomerDal(); >> Interface'Lerde abstract siniflar gibi newlenemezler.

        // iCustomerDal = new OracleCustomerDal(); //interface onu implemente eden classin referansini tutabilir.

        //////////////////////////////////////////////////////////////////

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();

    }
}