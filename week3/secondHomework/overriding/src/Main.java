public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] baseKrediManager = new BaseKrediManager[] {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};

        //for(int i : intArray) gibi dusunulebilir
        for(BaseKrediManager krediManager : baseKrediManager) {
            System.out.println(krediManager.hesapla(1000));
        }

    }
}