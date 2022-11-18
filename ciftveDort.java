import java.util.Scanner;

public class bolumBulma {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
       int sayi = a.nextInt();
        int toplam = 0;

        while (sayi % 2 == 0){
            sayi = a.nextInt();
            if(sayi % 2 == 0 && sayi %4 == 0){ 
                toplam += sayi;
            }
       }
        System.out.println(toplam);
    }
}
