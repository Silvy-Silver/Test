abstract class Employee{
    int id;
    String name;

    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    void display(){
        System.out.println("ID: "+id+", Name: "+name);
    }

    abstract double calculateSalary();
}

class FullTime extends Employee{
    double monthlySalary;

    FullTime(int id,String name,double monthlySalary){
        super(id,name);
        this.monthlySalary=monthlySalary;
    }

    double calculateSalary(){
        return monthlySalary;
    }
}

class Contractor extends Employee{
    int hours;
    double rate;

    Contractor(int id,String name,int hours,double rate){
        super(id,name);
        this.hours=hours;
        this.rate=rate;
    }

    double calculateSalary(){
        return hours*rate;
    }
}

class Intern extends Employee{
    double stipend;

    Intern(int id,String name,double stipend){
        super(id,name);
        this.stipend=stipend;
    }

    double calculateSalary(){
        return stipend;
    }
}

public class EmployeeApp{
    public static void main(String[] args){
        Employee e1=new FullTime(1,"Rahul",50000);
        Employee e2=new Contractor(2,"Aman",160,500);
        Employee e3=new Intern(3,"Priya",15000);

        e1.display();
        System.out.println("Salary: "+e1.calculateSalary());
        System.out.println();

        e2.display();
        System.out.println("Salary: "+e2.calculateSalary());
        System.out.println();

        e3.display();
        System.out.println("Salary: "+e3.calculateSalary());
    }
}
