import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy,kilo,indeks;

        Scanner aa = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz");
        kilo = aa.nextFloat();

        System.out.println("Boyunuzu giriniz");
        boy = aa.nextFloat();
        indeks = (kilo/(boy*boy));
        System.out.println("Vucut indeksiniz: "+ indeks);


    }
}
