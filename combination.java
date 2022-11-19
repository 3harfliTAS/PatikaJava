import java.util.Scanner;

public class FuckToriel {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int n = a.nextInt();
        System.out.println("Eleman sayisi");
        int r = a.nextInt();
        int nf =1, rf =1,c=1;
        int s = n-r;
        for (int i = 1 ; i <= n;i++){

        nf *= i;
        }
        for (int i = 1 ; i <= r;i++){

            rf *= i;
        }
        for (int i = 1;i<=s;i++){
            c *= i;
        }
        System.out.println(s);

        double comp = nf /(rf*c);
        System.out.println(comp);
    }
}
