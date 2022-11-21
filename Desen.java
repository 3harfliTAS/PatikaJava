import java.util.Scanner;
public class Desen {
    static int desen(int d) {
        if(d <= 0){
            return d;
        }
        System.out.print(d+" ");
        return desen(d-5);
    }
    static int desen(int d, int i){
        if (d > i){
            return d;
        }
        System.out.print(d+" ");
        return desen(d+5,i);
    }
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        
        int d = a.nextInt();
        desen(desen(d),d);
    }
}
