import java.util.Scanner;

public class bolumBulma {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi = a.nextInt();
        int toplam=0;
        int deger =0;
        for(int i = 0;i<=sayi;i++){

            if(i % 4 == 0 || i % 3 ==0){
                toplam += i;
               deger++;
            }
        }

        double ort = toplam / deger;
        System.out.println("Sonuc: "+ ort);

    }
}
