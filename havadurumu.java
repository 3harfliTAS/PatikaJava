import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        double s;
        System.out.println("Gunun sicakligi");
        s = a.nextDouble();
        if(s < 5){
            System.out.println("Kayak yapabilirsin");
        }
        else if( s >=5 && s <15 ){
            System.out.println("Sinema iyi olur");
        }
        else if( s >=15 && s <25 ){
            System.out.println("Piknik fena olmaz");
        }
        else if( s >=25  ){
            System.out.println("Yuzmek icin mikemmel hava ");
        }

    }

}
