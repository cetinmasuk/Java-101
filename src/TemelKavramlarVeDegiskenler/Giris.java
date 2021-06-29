package TemelKavramlarVeDegiskenler;

public class Giris {
    int a= 9;

    //Ana metotu yazmak için kısa  yollar: psvm || main kullanılır.
    public static void main(String[] args) {

        //Ekrana yazdırmanın kısayolu: sout

        System.out.println("Merhaba ");
        System.out.println("Merhaba ");

        //Noktalı virgülün bittiği alan statmen denir.
        // statmen blokları: { }

        /*
        Veri tipleri:
        Tam Sayı => bit>byte>short>int>long>double>float
        Tek Karakter => char
        Bir den fazla karakter => String
         */

        int a= 10, b=8, c =10, toplam;
        int sonic = a+b+c;
        System.out.println("Toplam Değer: " + sonic );
        System.out.println("\n");

        String  isim = "Masuk";
        String soyisim = "Cetin";
        System.out.println("Adınız: " + isim  +  "\n " + " Soyadınız: " + soyisim);
        System.out.println("\n");

        String _ad = "Mehmet";
        String $soyAd ="Çetin";
        String Memleket = "Diyar" ;
        System.out.println(_ad + "-"+ $soyAd + "-" + Memleket);
        System.out.println("\n");

        //boolen kullanımına örnek.
        int x=13, y=14;
        boolean sonuc= !(x==y) || (x==y);
        System.out.println(sonuc);


    }
}
