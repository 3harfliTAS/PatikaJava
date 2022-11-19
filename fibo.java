import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {

        Scanner a=new Scanner(System.in);

        System.out.print("Kac elemanli : ");
        int c=a.nextInt();
        int x=0,y=1,z,t;
        System.out.print(x+","+y);
        for(int i=2;i<=c;i++) {
            z=x+y;
            System.out.print(","+z);
            x = y;
            y=z;
            System.out.print(" ");
        }

    }
}
