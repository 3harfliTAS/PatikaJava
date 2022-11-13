import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi=3.14,alan,cevre,aci;
        int r,alfa;
        Scanner hesap = new Scanner(System.in);

        System.out.println("Yari cap: ");
        r = hesap.nextInt();
        alfa = hesap.nextInt();
        alan = pi * r * r;
        cevre = 2 * pi * r;
        aci = (pi * (r*r)*alfa)/360;
        
        System.out.println("Alan:"+ alan);
        System.out.println("Cevre:"+ cevre);
        System.out.println("Alan alfa:"+ aci);

    }
}
