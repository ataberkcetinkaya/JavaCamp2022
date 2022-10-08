public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        //GameCalculator gameCalculator = new GameCalculator(); >> Abstract siniflar newlenemez, o sinifi kullanabilmemiz icin override etmeliyiz

        GameCalculator gameCalculator = new WomanGameCalculator();
    }
}