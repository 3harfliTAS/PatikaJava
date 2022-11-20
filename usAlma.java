import java.util.Scanner;

public class usAlma {
    static void us(){
        Scanner a = new Scanner(System.in);
        System.out.println("Taban");
        int s1 =a.nextInt();
        System.out.println("Us");
        int s2 =a.nextInt();
        int sonuc=1;

        for(int i = 1; i <= s2;i++){
            sonuc *= s1;
        }
        System.out.println("Sonuc: "+sonuc);
    }
    
    public static void main(String[] args) {

        us();
    }
}
