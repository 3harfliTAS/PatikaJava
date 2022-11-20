import java.util.Scanner;

public class hesapMakinesi2 {
    static void topla(){
        Scanner a = new Scanner(System.in);

        int number,result=0,i=1;

        while(true){
            System.out.println(i++ +".sayi ");
            number = a.nextInt();
            if (number == 0) {
                break;
            }
            result +=number;
        }
        System.out.println("Sonuc: "+ result);
    }
    static void cikar(){
        Scanner a = new Scanner(System.in);
        int number,result=0,i=1;
        while(true){
            System.out.println(i++ +".sayi ");
            number = a.nextInt();
            if (number == 0) {
                break;
            }
            result -=number;
        }
        System.out.println("Sonuc: "+ result);


    }
    static void carp(){
        Scanner a = new Scanner(System.in);
        int number,result=1,i=1;

        while(true){
            System.out.println(i++ +".sayi ");
            number = a.nextInt();
            if (number == 0) {
                result =0;
                break;
            }
            if (number == 1){
                break;
            }
            result *=number;
        }
        System.out.println("Sonuc: "+ result);

    }
    static void bolme(){
        Scanner a = new Scanner(System.in);
        System.out.println("Kac sayi gireceksiniz:");
        int sayac =a.nextInt();
        double number,result=0.0;

        for (int i =1;i <= sayac;i++){
            System.out.println(i++ +".sayi ");
            number = a.nextInt();

            if (i != 1 && number == 0) {
                System.out.println("Bolen 0 olamaz");
                continue;
            }
            if( i == 1){
                result = number;
            }
            result /=number;
        }
        System.out.println("Sonuc: "+ result);


    }
    static void mod(){

        Scanner a = new Scanner(System.in);
        System.out.println("Mod alinacak sayiyi giriniz:");
        int s1 =a.nextInt();
        System.out.println("Mod Seciniz:");
        int s2 = a.nextInt();
        int number,result=0;

        number = s1 % s2;
        System.out.println(s1+ " mod" + s2 +" : "+number);

    }
    static void alan(){

        Scanner a = new Scanner(System.in);
        System.out.println("Dikdörtgen birinci kose:");
        int s1 =a.nextInt();
        System.out.println("Dikdörtgen ikinci kose:");
        int s2 = a.nextInt();
        int alan,cevre=0;

      alan = s1 * s2;
      cevre = (s1+s2)*2;
        System.out.println("Alan: "+ alan);
        System.out.println("Cevre: "+cevre);

    }



    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int select;
        String menu = "1-Toplama islemi\n"+
                "2-Cikarma islemi\n"+
                "3-Carpma islemi\n"+
                "4-Bolme islemi\n"+
                "5-Mod islemi\n"+
                "6-Alan islemi\n"+
                "0-Cikis yap";

        do {
            System.out.println(menu);
            System.out.println("Lutfen bir islem seciniz");
            select = a.nextInt();
            switch (select){
                case 1:
                    topla();
                    break;
                case 2:
                    cikar();
                    break;
                case 3:
                    carp();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    mod();
                    break;
                case 6:
                    alan();
                    break;


                case 0:
                    break;
                default:
                    System.out.println("Yanlis bir deger girdiniz dekrar deneyin");
            }
        }while(select !=0);




    }
}
