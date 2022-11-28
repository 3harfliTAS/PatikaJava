public class yemek {
    public static void main(String[] args) {

        int yemek = (int) (Math.random() * 2);
        int yanina = (int) (Math.random() * 5);
        int olsunMu = (int) (Math.random() * 2);
        int corbaSec = (int) (Math.random() * 6);


        String[] menu = {"Makarna", "Pilav"};
        String[] tur = {"kiymali","tavuk", "ton balik", "kasarli","soslu"};
        String [] corba = {"Mercimek","Tavuk","Domates","Ezogelin","Yayla","Yogurt"};
        String[] pilavinYani = {"tavuk", "kofte","sote","fasulye","nohut"};


        System.out.println(yemek +" "+ yanina+" "+corbaSec +" " +olsunMu);
        if (menu[yemek] == "Makarna") {
            System.out.print("Menu Makarna : ");
            if (tur[yanina] == "kiymali") {
                System.out.println("kiymali makarna");

            }else if (tur[yanina] == "tavuk"){
                System.out.println("tavuklu makarna");
            }
            else if (tur[yanina] == "ton balik"){
                System.out.println("ton balikli makarna");
            }
            else if (tur[yanina] == "soslu"){
                System.out.println("kremali makarna");
            }
            else
                System.out.println("kasarli makarna");
        }
        else {
            System.out.print("Pilav: ");
            if (pilavinYani[yanina] == "tavuk"){
                System.out.println("Tavuk pilav");
            }
            else if(pilavinYani[yanina] == "kofte"){
                System.out.println("Kofte pilav");
            }
            else if(pilavinYani[yanina] == "sote"){
                System.out.println("Pilav sote");
            }
            else if(pilavinYani[yanina] == "fasulye"){
                System.out.println("Kuru fasulye pilav");
            }
            else {
                System.out.println("Nohut pilav");
            }

        }

        if (olsunMu == 1){
            System.out.print("Corba: ");
            if(corba[corbaSec] == "Mercimek"){
                System.out.println("Mercimek");
            }
            else if(corba[corbaSec] == "Domates"){
                System.out.println("Domates");
            }
            else if(corba[corbaSec] == "Ezogelin"){
                System.out.println("Ezogelin");
            }
            else if(corba[corbaSec] == "Yayla"){
                System.out.println("Yogurtlu ");
            }
            if(corba[corbaSec]== "Tavuk"){
             if(corba[corbaSec] == "Tavuk" && tur[yanina] != "tavuk") {
                    System.out.println("Tavuk");
                }
             else {
                 System.out.println("Mercimek");
             }
            }

        }
        else System.out.println("Corba yok!");
    }
}
