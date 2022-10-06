public class CustomerManager {

    private Customer customer;
    private ICreditManager iCreditManager;

    public CustomerManager(Customer customer, ICreditManager iCreditManager) {
        this.customer = customer; //bu sekilde yapmamizin sebebi diger metotlardan ulasabilmemiz icindir,
                                //bu sayede customer nesnesini add, update, delete vb. her turlu operasyonda kolaylikla kullanabilirim
        this.iCreditManager = iCreditManager;
    }
    public void Save() { //constructor ile buraya parametre ile customer gondermem gerekmez.
        System.out.println("Müşteri kaydedildi. " );
    }
    public void Delete() { //constructor ile buraya parametre ile customer gondermem gerekmez.
        System.out.println("Müşteri Silindi. "  );
    }

    public void GiveCredit() {
        iCreditManager.Save(); //interface'ler referans tiptir.
        System.out.println("Kredi verildi.");
    }
}
