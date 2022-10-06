public abstract class BaseCreditManager implements ICreditManager {
    public abstract void Calculate(); //ortak operasyon degildir, her sinif kendine aykiri yazabilir

    public void Save() {
        System.out.println("Kaydedildi - Abstract Class."); //ortak operasyondur, implements edildikten sonra yazilmasina gerek yoktur.
    }
}
