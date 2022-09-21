public class Main {
    public static void main(String[] args) {
        //For
        for(int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü bitti.");

        //While
        int i = 1;
        while(i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println(i);
        System.out.println("While Döngüsü bitti.");

        //Do-While
        int j = 1;
        do{
            System.out.println(j);
            j += 2;
        } while(j < 10);
        System.out.println("Do-While Döngüsü bitti.");

        int h = 100;
        do{
            System.out.println("Logged"); //Do-While; döngü çalişmasa bile yapmak istedigimiz tek bir operasyon varsa kullanilabilir.
            System.out.println(h);
            h += 2;
        } while(h < 10);
        System.out.println("-------------");
    }
}