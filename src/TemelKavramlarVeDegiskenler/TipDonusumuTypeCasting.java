package TemelKavramlarVeDegiskenler;

public class TipDonusumuTypeCasting {
    public static void main(String[] args) {
        
        int sayi=10,toplam;
        double sayi2 = 5.25;
        float  sayi3=9.945f;

        // Tip dönüşümü uygulandı. Toplama olabilecek en mak. integer değerine çevirir.
        toplam= ( int) (sayi+sayi2+sayi3);
        System.out.println(toplam);
        System.out.println("*** \n");

        // Tip dönüşümü uygulandı. Toplama olabilecek en mak. double değerine çevirir.
        double toplam1;
        toplam1 =(double) (sayi+sayi2+sayi3);
        System.out.println(toplam1);
        System.out.println("*** \n");

        float toplam2;
        toplam2 = (float) (sayi + sayi2 + sayi3);
        System.out.println(toplam2);





        
    }
}
