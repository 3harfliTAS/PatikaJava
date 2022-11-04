import java.util.Scanner;

public class KDV {

    public static void main(String[] args) {

        double tutar , kdvOran=0.18, kdvTutar,kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("TUTAR GİR");
        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar= tutar + kdvTutar;

        if(tutar>1000){
        kdvOran = 0.08;
            kdvTutar = tutar * kdvOran;
            kdvliTutar= tutar + kdvTutar;

            System.out.println("Kdvsiz:" + tutar);
            System.out.println("KDV ORANI:" + kdvOran);
            System.out.println("Kdv tutar : "+ kdvTutar);
            System.out.println("Kdvli fiyat: "+ kdvliTutar);

        }
        else{

            System.out.println("Kdvsiz:" + tutar);
            System.out.println("KDV ORANI:" + kdvOran);
            System.out.println("Kdv tutar : "+ kdvTutar);
            System.out.println("Kdvli fiyat: "+ kdvliTutar);

        }

    }
}
