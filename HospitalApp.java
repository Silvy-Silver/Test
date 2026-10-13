interface Notification{
    void send(String msg);
}

class SMS implements Notification{
    public void send(String msg){
        System.out.println("Sending SMS: "+msg);
    }
}

class Email implements Notification{
    public void send(String msg){
        System.out.println("Sending Email: "+msg);
    }
}

class WhatsApp implements Notification{
    public void send(String msg){
        System.out.println("Sending WhatsApp: "+msg);
    }
}

class Hospital{
    void bookAppointment(Notification n){
        System.out.println("Appointment booked!");
        n.send("Your appointment is confirmed.");
    }
}

public class HospitalApp{
    public static void main(String[] args){
        Hospital h=new Hospital();

        h.bookAppointment(new SMS());
        h.bookAppointment(new Email());
        h.bookAppointment(new WhatsApp());
    }
}
