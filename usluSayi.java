import java.util.Scanner;

public class usluSayi {
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int n = a.nextInt();
        System.out.println("üs olacak sayi:");
        int u = a.nextInt();
        int sayi = 1;
        for (int i = 1;i <=u;i++){

        sayi *=n;

        }
        System.out.println(sayi);

    }
}
