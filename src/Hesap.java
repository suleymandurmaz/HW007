public class Hesap {
    private Halı halı;
    private Zemin zemin;

    public Hesap(Halı halı, Zemin zemin) {
        this.halı = halı;
        this.zemin = zemin;
    }

    public Hesap() {
    }




    public double getToplamMaliyet(){

        return zemin.alanHesapla()*halı.getFiyat();


    }

    @Override
    public String toString() {
        return String.format("%5.2F",getToplamMaliyet());
    }
}
