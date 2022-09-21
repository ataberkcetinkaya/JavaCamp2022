public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Ataberk";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Engin";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("---------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Ataberk";
        ogrenciler[1] = "Engin";
        ogrenciler[2] = "Derin";
        ogrenciler[3] = "Ahmet";

        for(int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("-----------------------");

        for(String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}