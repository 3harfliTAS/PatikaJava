import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km=2.20,yol;
        int min = 20, baslangic=10;

        Scanner aa = new Scanner(System.in);

        System.out.println("Alinan yol");
        yol = aa.nextInt();

        if((km*yol)+10 < min){
            System.out.println("Odenecek ucret:"+ min);
        }
        else {
            System.out.println("Borcunuz: "+(km*yol+10));
        }
    }
}
