package TemelKavramlarVeDegiskenler;


public class TOrnek {
    public static void main(String[] args) {

        //1.Soru: Tip dönüşümü uygulayarak "pars" ve "valueof" gerçekleştiriniz.
        String stringSayi = "100";
        int gercekSayi = Integer.parseInt(stringSayi  );
        int gercekSayi2= Integer.valueOf(stringSayi);
        stringSayi = String.valueOf(gercekSayi2);


        System.out.println("Sayi olan değer: " + gercekSayi2);
        System.out.println("String olan değer: "+ stringSayi);
        System.out.println("*** \n");

        /*
        2.Soru: Asağıda verilne işlemi yorumlayınız.
        -int sayi1 = 5/3;
        -floayt sayi2 = 5f/3f;
        double sayi3 = 5d/3d;                                     */
        int sayi1 = 5/3;
        float sayi2 = 5f/3f;
        double sayi3 = 5d/3d;
        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(sayi3);
        System.out.println("*** \n");

        /*
        3.Soru: Aşağıda verilen işlem sonucunu yorumlayınız.
        -> (1.0-0.1-0.1-0.1-0.1-0.1)
        -> (1.0-0.9)
         */
        System.out.println("Varsayılan Double Değerdir:-> "+ (1.0-0.1-0.1-0.1-0.1-0.1));
        System.out.println((double)(1.0-0.9));
        System.out.println((float)(1.0-0.9));
        System.out.println("*** \n");

        //Sonuçu yorumlayınız?
        int x=7, y=9;
        int ortalama1;
        double ortalama;
        ortalama = (x+y) / 3.01;

        ortalama1 = (int) ((x+y) / 3.0);

        System.out.println(ortalama);
        System.out.println(ortalama1);

        //Sonuç ne olur?
        int x1 = 1, y1 = 2, r=3;
        r *= x1 + y1;

        System.out.println(r);





    }
}
