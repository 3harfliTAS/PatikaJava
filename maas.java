public class maas {
    String name;
    double salary,workHours;
    int hireYear;


    public maas(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        return (salary <1000)?0:salary*(0.03);
        }

    public double bonus(){

        return (workHours<40)?0:((workHours-40)*30);

    }
    public double raiseSalary(){
        double prize=0;
        int a = 2021 - hireYear;
        if(a < 10){
            prize = salary +(salary*0.05);
        }
        else if(a >9 && a <20){
            prize = salary +(salary*0.1);
        }
        else{
            prize = salary +(salary*0.15);
        }

        return prize;
    }

    public String toString(){
        String result ="Calisan Ad Soyad: "+name+
        "\n Salary: " + salary+
        "\n Work Hours: " + workHours+
        "\n HireYear: " + hireYear+
        "\n Tax: " + tax()+
        "\n Bonus: " + bonus()+
        "\n Raise salary: " + raiseSalary()
                ;
        return result;
    }
}

