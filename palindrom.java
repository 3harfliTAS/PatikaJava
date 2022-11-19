import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int c=a.nextInt();
        int lnum,temp=c,reverse=0;
        while(temp != 0){

            lnum =temp %10;
            reverse = (reverse *10) +lnum;
            temp /= 10;

        }
        if(reverse == c){
       System.out.println("Palindrom");
        }    
        else System.out.println("Palindrom degil");

    }
}
