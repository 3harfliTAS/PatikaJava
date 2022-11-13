import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);

        String kullanici_adi = "user", parola = "12345";

        System.out.println("Kullanici adi");
        String giris = aa.nextLine();
        System.out.println("Parola");
        String girisparola = aa.nextLine();

        if(giris.equals(kullanici_adi) && girisparola.equals(parola)){
            System.out.println("Başarili şekilde giris yapildi");

        }
        else {
            System.out.println("Giris bilgileriniz hatali,sifrenizi degistirmek isterseniz evet/hayir yazın?");
            String cevap = aa.next();
            if(cevap.equals("evet") ){

                System.out.println("yeni sifre giriniz");
                String sifre = aa.next();

                if(sifre.equals(parola)){
                    System.out.println("Sifre eskisi ile aynı");

                }
                else{
                    System.out.println("Sifre basarili sekilde degisti");
                    parola = sifre;
                }
            }
                else{
                System.out.println("Tekrar deneyin");
            }
            }

        }

    }
