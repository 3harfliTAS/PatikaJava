import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Yil giriniz:");
        int yil = a.nextInt();
        if(yil % 4 == 0){
            System.out.println(yil + " artik yildir!");
        }
        else {
            System.out.println(yil + " artik yil degildir!");

        }



    }
}
