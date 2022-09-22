public class Main {
    public static void main(String[] args) {
        //reference type
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        //Stack'te 101 nolu customerManager artik 102 nolu CM2 ile ayni noktayi tutacak ve
        //Heap kısmında da 101'yi artik tutan biri olmadigi icin GC onu temizleyecek.

        customerManager.Add();
        customerManager.Remove();
    }
}