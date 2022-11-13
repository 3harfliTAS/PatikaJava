import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);

        double toplam,armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        double armutk,elmak,domatesk,muzk,patlicank;
        System.out.println("Armut kilo: ");
        armutk = aa.nextFloat();
        System.out.println("Elma kilo: ");
        elmak = aa.nextFloat();
        System.out.println("Domates kilo: ");
        domatesk = aa.nextFloat();
        System.out.println("Muz kilo: ");
        muzk = aa.nextFloat();
        System.out.println("Patlican kilo: ");
        patlicank= aa.nextFloat();
        toplam = (armut * armutk)+(elma*elmak)+(domates * domatesk)+(muz * muzk)+(patlican * patlicank);
        System.out.println("Toplam Tutar: " + toplam);
    }
}
