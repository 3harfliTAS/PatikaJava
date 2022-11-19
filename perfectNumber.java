import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.print("Kac sayi girilecek: ");
        int sayi = a.nextInt();
        int toplam =0;
        for(int i = 1;i < sayi;i++){
            if(sayi % i == 0){
                toplam += i;
            }
        }
        if (toplam == sayi){
            System.out.println(sayi+" Mukemmel sayidir.");
        }
        else
        {
            System.out.println(sayi+" Mukemmel sayi degildir.");
        }

    }
}
