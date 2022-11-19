import java.util.Scanner;

public class asalSayi {
    public static void main(String[] args) {

        int asal=0;
        for (int i =2;i<100;i++){
            for(int j=2;j<i;j++){
                
            if(i % j ==0) {
                asal++;
            }
            }
            if (asal ==0){
                System.out.print(i+" ");
            }
            asal=0;
        }
    }
}
