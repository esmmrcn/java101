public class Employee {
    String name; //çalışanın adı soyadı
    double salary;
    int workHours; //haftalık çalışma saati
    int hireYear;
    int nowYear;

    public Employee(String name, int salary, int workHouse,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHouse;
        this.hireYear=hireYear;
        this.nowYear=2021;
    }

    public double tax(){
        if(this.salary<1000)
            return 0;
        else
            return this.salary*0.03;
    }

    public double bonus(){
        if(this.workHours>40)
            return (workHours-40)*30;
        else
            return 0;
    }

    public double raiseSalary(){
        int workYear=nowYear-hireYear;
        if(workYear<10)
            return salary*0.05;
        else if (workYear>9 && workYear<20)
            return salary*0.10;
        else if (workYear>19)
            return salary*0.15;
        else;
            return 0;
    }

 @Override
    public String toString(){

        return "Adı : " + this.name +
                "\nMaaşı : " + this.salary+
                "\nÇalışma Saati : " + this.workHours +
                "\nBaşlangıç Yılı : " + this.hireYear +
                "\nVergi  : " + this.tax() +
                "\nBonus : " + this.bonus() +
                "\nMaaş Artışı : " + this.raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş : " + (salary-tax()+bonus()) +
                "\nToplam Maaş : " + (salary+raiseSalary());
    }


}
