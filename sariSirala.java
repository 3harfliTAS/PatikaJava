import java.util.Scanner;

public class sayiSirala {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Sayi gir");
        int sayi_1 = a.nextInt();

        System.out.println("Sayi gir");
        int sayi_2 = a.nextInt();

        System.out.println("Sayi gir");
        int sayi_3 = a.nextInt();


        if(sayi_1 > sayi_2 && sayi_1 > sayi_3) {
            System.out.print(sayi_1+" ");
            if (sayi_2 > sayi_3) {
                System.out.print(" "+ sayi_2);
                System.out.print(" "+ sayi_3);
            } else {
                System.out.print(" "+ sayi_3);
                System.out.print(" "+ sayi_2);
            }
        }
            if(sayi_2 > sayi_1 && sayi_2 > sayi_3){
                System.out.print(sayi_2 +" " );
                if(sayi_1 > sayi_3){
                    System.out.print(" "+ sayi_1);
                    System.out.print(" "+ sayi_3);
                }
                else{
                    System.out.print(" "+ sayi_3);
                    System.out.print(" "+ sayi_1);
                }
            }
            if(sayi_3 > sayi_1 && sayi_3 > sayi_1){
                System.out.println(sayi_3);
                if(sayi_2 > sayi_1){
                    System.out.print(" "+sayi_2);
                    System.out.print(" "+sayi_1);
                }
                else{
                    System.out.print(" "+ sayi_1);
                    System.out.print(" "+ sayi_2);
                }
            }
        }
    }

    
    
    
    

