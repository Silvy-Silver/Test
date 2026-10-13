abstract class Vehicle{
    String regNo;
    String model;

    Vehicle(String regNo,String model){
        this.regNo=regNo;
        this.model=model;
    }

    void display(){
        System.out.println("Registration: "+regNo);
        System.out.println("Model: "+model);
    }

    abstract int capacity();
}

interface Rideable{
    double calculateFare(double km);
    void startRide();
}

class Car extends Vehicle implements Rideable{
    Car(String regNo,String model){
        super(regNo,model);
    }

    int capacity(){
        return 4;
    }

    public double calculateFare(double km){
        return km*15;
    }

    public void startRide(){
        System.out.println("Car ride started");
    }
}

class Bike extends Vehicle implements Rideable{
    Bike(String regNo,String model){
        super(regNo,model);
    }

    int capacity(){
        return 1;
    }

    public double calculateFare(double km){
        return km*7;
    }

    public void startRide(){
        System.out.println("Bike ride started");
    }
}

class Van extends Vehicle implements Rideable{
    Van(String regNo,String model){
        super(regNo,model);
    }

    int capacity(){
        return 8;
    }

    public double calculateFare(double km){
        return km*25;
    }

    public void startRide(){
        System.out.println("Van ride started");
    }
}

public class RideApp{
    public static void main(String[] args){
        Car c=new Car("TS01AB1234","Sedan");
        Bike b=new Bike("TS02CD5678","Bike");
        Van v=new Van("TS03EF9012","Traveller");

        c.display();
        System.out.println("Capacity: "+c.capacity());
        c.startRide();
        System.out.println("Fare: "+c.calculateFare(10));
        System.out.println();

        b.display();
        System.out.println("Capacity: "+b.capacity());
        b.startRide();
        System.out.println("Fare: "+b.calculateFare(10));
        System.out.println();

        v.display();
        System.out.println("Capacity: "+v.capacity());
        v.startRide();
        System.out.println("Fare: "+v.calculateFare(10));
    }
}
