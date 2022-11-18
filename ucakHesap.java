import java.util.Scanner;

public class ucakBilet {
    public static void main(String[] args) {


        double yenitutar = 0;
        double yasindirimi;
        Scanner a = new Scanner(System.in);

        System.out.println("Mesafe");
        int km = a.nextInt();
        double ntutar = km * 0.10;
        if(km > 0){
        }
        else
        {
            km = a.nextInt();
            System.out.println("Gecerli deger giriniz");
        }
        System.out.println("Yasiniz");
        int yas = a.nextInt();

        if(yas > 0){

        }
        else
        {

            System.out.println("Gecerli deger giriniz");
            yas = a.nextInt();
        }
        System.out.println("Tek yon ise 1 , Gidis dönüsse 2' yi secin");
        int tip = a.nextInt();
        
        if(tip == 1) {
            if (yas < 12) {
                yasindirimi = ntutar / 2;
                yenitutar = ntutar - yasindirimi;
            }
            else if (yas > 12 && yas < 24) {
                yasindirimi = ntutar * 0.10;
                yenitutar = ntutar - yasindirimi;

            }
            else if (yas > 65) {
                yasindirimi =ntutar * 0.30;
                yenitutar = ntutar - yasindirimi;

            }
            System.out.println("yeni tutar: "+ yenitutar);
        }
         if(tip == 2){
            yenitutar = ntutar * 0.20;

            if (yas < 12) {
                yasindirimi = yenitutar / 2;
                yenitutar = ntutar - yasindirimi;

            }
            else if (yas > 12 && yas < 24) {

                yasindirimi = ntutar * 0.10;
                yenitutar = ntutar - yasindirimi;
            } 
            else if (yas > 65) {
                yasindirimi =  ntutar * 0.30;
                yenitutar = ntutar - yasindirimi;

            }
            double gidisdonus = yenitutar *0.20;
            yenitutar = yenitutar - gidisdonus;
            yenitutar = yenitutar * 2;
            System.out.println(yenitutar);
        }
    }
}
