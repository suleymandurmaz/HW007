public class Zemin {
    private String acıklama;
    private double genislik;
    private double uzunluk;


    public Zemin() {
    }

    public Zemin(String acıklama, double genislik, double uzunluk) {
        this.acıklama = acıklama;
        this.genislik = genislik;
        this.uzunluk = uzunluk;


    }

    public String getAcıklama() {
        return acıklama;
    }

    public void setAcıklama(String acıklama) {
        this.acıklama = acıklama;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }
    public double alanHesapla(){
        return genislik*uzunluk;
    }

    @Override
    public String toString() {
        return String.format("%s-5.2f-5.2f",acıklama,genislik,uzunluk);
    }
}

