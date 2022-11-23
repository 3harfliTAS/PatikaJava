import java.util.Arrays;
import java.util.Scanner;

public class elemanlariSirala {
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        System.out.println("Dizinin boyutu: ");
        int boyut = a.nextInt();
        int e =1;
        int [] list = new int[boyut];
        for(int i =0;i < boyut;i++){
            System.out.print(e+".ci elemani gir ");
            list[i] = a.nextInt();
            e++;
        }
        Arrays.sort(list);
        System.out.println("Siralama: "+ Arrays.toString(list));
        }
    }
