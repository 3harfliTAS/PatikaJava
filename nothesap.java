import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

       int mat,fiz,turk,kim,muz,ort;

        System.out.println("Matematik Notunu Gir:");
        mat = a.nextInt();
        System.out.println("Fizik Notunu Gir:");
        fiz = a.nextInt();
        System.out.println("Turkce Notunu Gir:");
        turk = a.nextInt();
        System.out.println("Kimya Notunu Gir:");
        kim = a.nextInt();
        System.out.println("Muzik Notunu Gir:");
        muz = a.nextInt();

        if(mat >0 && mat < 100 && fiz >0 && fiz < 100 && turk >0 && turk < 100
             && kim >0 && kim < 100 && muz >0 && muz < 100){

            ort = (mat + fiz + turk + kim + muz)/5;
            System.out.println("Ortalama: "+ ort);
            if (ort>=55){
                System.out.println("Gecer");
            }
            else{
                System.out.println("Kalir");
            }
            
        }
        else{ // Hangi ders yanlış giriliyor bilgisini vermek gerekir.
            System.out.println("Girilen not 0-100 arasinda olmali");
        }






        }

    }
