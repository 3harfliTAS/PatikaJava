public class Ring {
    boxer b1;
    boxer b2;
    int minWeight;
    int maxWeight;

    public Ring(boxer b1, boxer b2, int minWeight, int maxWeight) {
        this.b1 = b1;
        this.b2 = b2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public boolean checkWeight(){
        return(b1.weight >= minWeight && b1.weight <= maxWeight) && (b2.weight >= minWeight && b2.weight <= maxWeight);
    }

    public void run(){
        if(checkWeight()) {
            while (b1.health > 0 && b2.health > 0) {

                System.out.println("----NEW ROUND");
                b2.health = b1.hit(b2);

                if (isWin()) {
                    break;
                }
                printScore();
            }
        }
        else {
            System.out.println("Sporcularin agirliklari uyusmuyor");
        }
    }

    public boolean isWin(){
        if(b1.health ==0){
            System.out.println("Maci kazanan "+ this.b2.name);
            return true;
        }
        else if(b2.health==0){
            System.out.println("Maci kazanan "+ this.b2.name);
            return true;
        }
        return false;
    }
    public void printScore(){
        System.out.println("---------");
        System.out.println(b1.name+ " Kalan Can \t "+ this.b1.health);
        System.out.println(b2.name+ " Kalan Can \t "+ this.b2.health);
    }


}




public class boxer {
    String name;
    int damage, health,weight;
    double dodge;

    public boxer(String name,int damage,int health,int weight,double dodge){

        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;

    }
    public int hit(boxer foe){
        System.out.println("----------------");
        System.out.println(this.name +" "+foe.name+" " +this.damage+" hasar vurdu");

    if(foe.dodge()) {
        System.out.println(foe.name+" gelen hasari savurdu");
        return foe.health;
    }

        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }
    public boolean dodge(){

        double randomValue= Math.random()*100;
        return randomValue <= this.dodge;
    }

}

public class boxGame {
    public static void main(String[] args) {

        boxer marc = new boxer("A",15,100,95,30);
        boxer anthony = new boxer("B",10,95,90,15);
        Ring r=new Ring(marc,anthony,85,100);
        r.run();



    }
}


