import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.print("Kac sayi girilecek: ");
        int sayi = a.nextInt();
        int max =0,min =0;
        for (int i =1 ; i <= sayi;i++){

            System.out.print(i+ ".ci sayiyi giriniz:");
            int c =a.nextInt();
            if(i == 1){
                max=c;
                min=c;
            }
            else{
                if (c > max){
                    max = c;
                }
                else if (c < min){
                    min = c;
                }
            }
        }
        System.out.println("En buyuk sayi : "+ max);
        System.out.println("En kucuk sayi: "+ min);
    }
}
