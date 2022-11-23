import java.util.Arrays;
import java.util.Scanner;

public class transpoz {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Satir sayisini gir: ");
        int s1 = a.nextInt();
        System.out.println("Sutun sayisini gir: ");
        int s2 = a.nextInt();

        int [][] dizi =new int[s1][s2];
        int [][] dizit =new int[s2][s1];

        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s2; j++) {
                System.out.println((i+1)+".ci satirin "+(j+1)+" .ci elemani");
                dizi[i][j] = a.nextInt();
            }
        }

        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s2; j++) {
                dizit[j][i] = dizi[i][j];
            }
        }
        System.out.println("Transpoz: \n");

        for (int[] t : dizi){
            for (int v : t){
                System.out.print(v+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] val: dizit){
            for (int k: val){
                System.out.print(k+ " ");
            }
            System.out.println();
        }
    }
}
