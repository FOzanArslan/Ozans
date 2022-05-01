public class Worker {
    String wName;
    double wSalary;
    int wWorkHours;
    int wHireYear;

    public Worker(String wName,double wSalary,int wWorkHours,int wHireYear){
        this.wName = wName;
        this.wSalary = wSalary;
        this.wWorkHours = wWorkHours;
        this.wHireYear = wHireYear;
    }

    public double tax(){
        if (this.wSalary<1000) return this.wSalary;
        else return (this.wSalary*3)/100;
    }
    public double bonus(){
        if (this.wWorkHours> 40){
            return (this.wWorkHours-40)*30;
        }else return this.wWorkHours;
    }
    public double raiseSalary(){
        if (2021 - this.wHireYear<10){
            return (this.wSalary*5)/100;
        }else if(2021 - this.wHireYear>9 && 2021 - this.wHireYear<20){
            return (this.wSalary*10)/100;
        }else return (this.wSalary*15)/100;
    }
    public String toString(){
        System.out.println("Adı\t:\t"+ wName);
        System.out.println("Maaşı\t:\t"+ wSalary);
        System.out.println("Çalışma Saati\t:\t"+ wWorkHours);
        System.out.println("Başlangıç Yılı\t:\t"+ wHireYear);
        System.out.println("Vergi\t:\t"+ tax());
        System.out.println("Bonus\t:\t"+ bonus());
        System.out.println("Maaş Artışı\t:\t"+ raiseSalary());
        double sum = -tax()+bonus()+raiseSalary()+wSalary;
        System.out.println("Vergiler, Bonuslar ve Maaş Artışı ile birlikte maaş\t:\t"+ sum);
        return null;
    }

}
