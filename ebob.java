import java.util.Scanner;

public class ebob {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Sayi1");
        int s1 =a.nextInt();
        System.out.println("Sayi2");
        int s2 =a.nextInt();
        int i=1;

        //Ebob
        while (i < s1 || i < s2){

            if(s1 % i == 0 && s2 % i == 0)
            {
                System.out.print("Ebob: "+ i+ " ");
                i++;
            }
            else i++;
        }
        System.out.println("");
        while (i <(s1*s2)){

            if(i % s1 ==0 && i % s2 == 0){
                System.out.println("Ekok:"+ i);
                break;
            }
            else i++;
        }
    }
}
