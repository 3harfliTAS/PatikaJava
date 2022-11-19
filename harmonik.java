import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        System.out.println("Sayi girinz ");
        
        int sayi = a.nextInt();
        double harmonik = 0;
        for (double i = 1; i <=sayi;i++){
            harmonik += (1/i);
        }
        System.out.println(harmonik);
    }
}

