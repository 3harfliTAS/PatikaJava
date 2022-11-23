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


