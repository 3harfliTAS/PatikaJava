import java.sql.SQLOutput;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi1,sayi2 ;
        System.out.println("1 sayı gir");
        sayi1 = giris.nextInt();
        System.out.println("2. sayı gir");
        sayi2= giris.nextInt();
        System.out.println("Yapılacak işlem");
        int deger = giris.nextInt();
        switch (deger){
            case 1:{
                System.out.println(sayi1 + sayi2);

            break;

        }
            case 2:{
                System.out.println(sayi1 - sayi2);


            break;
        }
        case 3:{

            System.out.println(sayi1 * sayi2);
        break;
        }
        case 4 : {
            System.out.println(sayi1 / sayi2);


        }
        break;

       }

    }
}
