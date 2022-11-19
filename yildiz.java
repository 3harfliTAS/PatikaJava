import java.util.Scanner;

public class yildizElmas {
    public static void main(String[] args) {


        Scanner a = new Scanner(System.in);
        System.out.println("Sayi girinz ");

        int n = 4;


        for (int i = 0; i <= n ; i++) {

            for (int j = 0; j < (n-i); j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= (2 * i); k++)
            {
                System.out.print("*");
            }

            System.out.println(" ");
        }
        for (int i=n-1; i>=1; i--){
            
            for (int k=n; k>i; k--)
            {
                System.out.print(" ");
            }
            
            for (int l=1; l<=(2*i-1); l++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

