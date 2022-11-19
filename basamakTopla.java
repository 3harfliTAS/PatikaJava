import java.util.Scanner;

public class basamakToplam {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Sayi girinz ");
        int sayi = a.nextInt();

        int toplam = 0;

        while (sayi > 0) {
            int basamak = sayi % 10;
            int temp = sayi - basamak;
            sayi = temp / 10;
            toplam += basamak;
        }
        System.out.println(toplam);
    }
}
