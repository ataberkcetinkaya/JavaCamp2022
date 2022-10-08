public class CustomerManager {

    private ICustomerDal iCustomerDal; //constructor parametresinde gonderirken add() veya diger metotlardan ulasabilmek icin buradaki degiskene atiyorum.

    public CustomerManager(ICustomerDal iCustomerDal) { //CustomerManager constructor'inda iCustomerDal istedigimi belirtiyorum.(oracle veya mysql olabilir, interface'i kim implemente ediyorsa)
        this.iCustomerDal = iCustomerDal;               //
    }

    public void add() {
        //business codes, e.g: check before adding to db.
        iCustomerDal.add();
    }
}
