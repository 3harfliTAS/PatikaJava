import java.util.Scanner;

public class recursiveFib {

    static int fib(int a){

        if (a == 1 || a ==2){
            return 1;
        }
        return fib(a-1)+fib(a-2);
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        System.out.println(fib(b));

    }
}
