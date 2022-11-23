import java.util.Arrays;
import java.util.Scanner;

public class elemanlariSirala {
    
    static boolean yok(int[] arr,int value,int c) {
        for (int i = 0; i < c; i++) {
            if (value == arr[i]) {
                return false;
            }
        }
    return true;
    }

    static int esitMi(int[] arr,int value) {
        int count = 0;
        for (int i : arr) {
            if (i == value) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Dizinin boyutu: ");
        int boyut = a.nextInt();
        int [] array = new int[boyut];
        for (int j=0;j<boyut;j++){
        array[j]= a.nextInt();
        }

        for(int i =0;i<array.length;i++){
            if(yok(array,array[i],i)){
                System.out.println(array[i]+" sayisi "+ esitMi(array,array[i])+" kez tekrarlandi");
            }

        }
        
        }

    }


