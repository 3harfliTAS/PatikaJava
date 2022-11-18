import java.util.Scanner;

public class cinBurc {
    public static void main(String[] args) {


        Scanner a = new Scanner(System.in);
        System.out.println("Dogum yilinizi giriniz:");
        int yil = a.nextInt();

        int b = yil % 12;
        if (b == 0) {
            System.out.println("Maymun ");
        }
        if (b == 1) {
            System.out.println("Horoz ");
        }

        if (b == 2) {
            System.out.println(" Kopek");
        }

        if (b == 3) {
            System.out.println("Domuz ");
        }
        if (b == 4) {
            System.out.println("Fare ");
        }
        if (b == 5) {
            System.out.println("Okuz ");
        }
        if (b == 6) {
            System.out.println(" Kaplan");
        }
        if (b == 7) {
            System.out.println(" Tavsan");
        }
        if (b == 8) {
            System.out.println("Ejderha ");
        }
        if (b == 9) {
            System.out.println("Yilan ");
        }
        if (b == 10) {
            System.out.println("Ay ");
        }
        if (b == 11) {
            System.out.println("Koyun ");

    }
    }
}
