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

        //value type (primitives; such as byte, long, int etc. (as variables))
        int num1 = 10;
        int num2 = 20;
        num2 = num1; //num 2 becomes 10 here bc of getting the num 1 value
        num1 = 30; //num 1 becomes 30 here but not affects the num2
        System.out.println(num2); //so its equals to 10

        //////////////////////
        //ARRAYS are reference type like classes!!
        int[] numbers1 = {1,2,3};
        int[] numbers2 = {4,5,6};
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]);
    }
}