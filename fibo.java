import java.util.Scanner;

public class asalSayi {
    public static void main(String[] args) {

        Scanner a=new Scanner(System.in);

        System.out.print("Kac elemanli : ");
        int c=a.nextInt();
        int i=0,toplam=0;
        while(i <c){

            toplam +=i;
            i++;
        }
        System.out.println(toplam);


    }
}
