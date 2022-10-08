public abstract class GameCalculator {
//    public void hesapla() {
//        System.out.println("Puan: 100");
//    }
    public abstract void hesapla(); //bu sinifi kim aliyorsa hesaplayi override etmek zorunda, classlar kendi hesaplamasini yazmali

    public final void gameOver() { //cannot override
        System.out.println("Oyun bitti");
    }
}
