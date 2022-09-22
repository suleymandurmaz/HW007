public class main {
    public static void main(String[] args) {
        Halı halı=new Halı(3.5);
        Zemin zemin=new Zemin("Mutfak",2.75,4);
        Hesap hesap=new Hesap(halı,zemin);
        System.out.println("Toplam Maliyet : "+ hesap.getToplamMaliyet());
        halı=new Halı(1.5);
        zemin=new Zemin("ACIKLAMA",5.4,4.5);
        hesap = new Hesap(halı,zemin);
        System.out.println("Toplam maliyet: " + hesap.getToplamMaliyet());


    }
}
