public class OgrenciKrediManager extends BaseKrediManager {
    public double hesapla(double tutar) { //overriding
        return tutar * 1.10;
    }
}
