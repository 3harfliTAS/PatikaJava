import java.util.Scanner;

public class katDongu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Sayi giriniz: ");
        n = input.nextInt();

        System.out.println("4'un katlari");
        for (int i = 1; i <= n; i *= 4) {
            System.out.print(i + ", ");
        }

        System.out.println(" 5'in katlari");
        for (int i = 1; i <= n; i *= 5) {
            System.out.print(i + ", ");
        }
    }
}
