public class Main {
    public static void main(String[] args) {
        //value type
        int number1 = 10;
        int number2 = 20;
        number1 = number2;
        number2 = 100;

        System.out.println(number1);

        //reference type
        int[] numbers1 = {1,2,3};
        int[] numbers2 = {10,20,30};
        numbers1 = numbers2;
        numbers2[0] = 1000;

        System.out.println(numbers1[0]);

        ////////////////////////////////////

        /*CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer = new Customer(); //instance olusturmak
        customer.setId(1);
        customer.setCity("Istanbul");

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Company company = new Company();
        company.setTaxNumber("1221312");
        company.setCompanyName("Samsung Electronics");
        company.setId(2);
        CustomerManager customerManager2 = new CustomerManager(new Company()); //extends ettiklerimide customer olarak verebilirim.

        Person person = new Person();
        person.setNationalIdentity("12344");
        person.setId(3);
        person.setFirstName("Ataberk");
        person.setLastName("Çetinkaya");*/

        ////////////////////////////////////

        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager()); //or MilitaryCreditManager
        customerManager.GiveCredit();

    }
}