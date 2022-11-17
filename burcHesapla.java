import java.util.Scanner;

public class burcTahmin {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("Gun/Ay/Yil seklinde giriniz: ");
        int gun = a.nextInt();
        int ay = a.nextInt();
        int yil = a.nextInt();



        if(ay == 1){
            if(gun >= 22){
                System.out.println("Burcunuz: Kova");
            }
            else {
                System.out.println("Burcunuz: Oglak");
            }

        }
        if(ay == 2){

            if(gun >= 20){
                System.out.println("Burcunuz: Balik");
            }
            else {
                System.out.println("Burcunuz: Kova");
            }

        }

        if(ay == 3){

            if(gun >= 21){
                System.out.println("Burcunuz: Koc");
            }
            else {
                System.out.println("Burcunuz: Balik");
            }

        }
        if(ay == 4){

            if(gun >= 21){
                System.out.println("Burcunuz: Boga");
            }
            else {
                System.out.println("Burcunuz: Koc");
            }

        }
        if(ay == 5){

            if(gun >= 22){
                System.out.println("Burcunuz: Ikızler");
            }
            else {
                System.out.println("Burcunuz: Boga");
            }

        } if(ay == 6){

            if(gun >= 22){
                System.out.println("Burcunuz: Yengec");
            }
            else {
                System.out.println("Burcunuz: Ikızler");
            }

        } if(ay == 7){
            if(gun >= 22){
                System.out.println("Burcunuz: Aslan");
            }
            else {
                System.out.println("Burcunuz: Yengec");
            }

        } if(ay == 8){

            if(gun >= 23){
                System.out.println("Burcunuz: Basak");
            }
            else {
                System.out.println("Burcunuz: Aslan");
            }

        } if(ay == 9){

            if(gun >= 22){
                System.out.println("Burcunuz: Basak");
            }
            else {
                System.out.println("Burcunuz: Aslan");
            }

        }
        if(ay == 10){

            if(gun >= 22){
                System.out.println("Burcunuz: Akrep");
            }
            else {
                System.out.println("Burcunuz: Terazi");
            }

        }
        if(ay == 11){

            if(gun >= 22){
                System.out.println("Burcunuz: Yay");
            }
            else {
                System.out.println("Burcunuz: Akrep");
            }

        }
        if(ay == 12){
            if(gun >= 21){
                System.out.println("Burcunuz: Oglak");
            }
            else {
                System.out.println("Burcunuz: Yay");
            }

        }

        }

    }
