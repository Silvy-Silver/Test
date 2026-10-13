abstract class Product{
    String name;
    String sku;
    double price;

    Product(String name,String sku,double price){
        this.name=name;
        this.sku=sku;
        this.price=price;
    }

    void display(){
        System.out.println(name+" | "+sku+" | Rs."+price);
    }

    abstract boolean validate();
}

interface Fulfillable{
    void fulfill();
}

class PhysicalProduct extends Product implements Fulfillable{
    int stock;

    PhysicalProduct(String name,String sku,double price,int stock){
        super(name,sku,price);
        this.stock=stock;
    }

    boolean validate(){
        return price>0&&stock>0;
    }

    public void fulfill(){
        System.out.println("Shipping physical product");
    }
}

class DigitalProduct extends Product implements Fulfillable{
    String url;

    DigitalProduct(String name,String sku,double price,String url){
        super(name,sku,price);
        this.url=url;
    }

    boolean validate(){
        return price>0&&url!=null&&!url.isEmpty();
    }

    public void fulfill(){
        System.out.println("Providing download link: "+url);
    }
}

class Subscription extends Product implements Fulfillable{
    int months;

    Subscription(String name,String sku,double price,int months){
        super(name,sku,price);
        this.months=months;
    }

    boolean validate(){
        return price>0&&months>0;
    }

    public void fulfill(){
        System.out.println("Activating subscription for "+months+" months");
    }
}

public class StoreApp{
    public static void main(String[] args){
        PhysicalProduct p1=new PhysicalProduct("Keyboard","P101",2000,10);
        DigitalProduct p2=new DigitalProduct("Java Course","D101",999,"https://example.com/course");
        Subscription p3=new Subscription("Music Plan","S101",199,12);

        p1.display();
        if(p1.validate()){
            System.out.println("Product is valid");
            p1.fulfill();
        }else{
            System.out.println("Invalid product");
        }

        System.out.println();

        p2.display();
        if(p2.validate()){
            System.out.println("Product is valid");
            p2.fulfill();
        }else{
            System.out.println("Invalid product");
        }

        System.out.println();

        p3.display();
        if(p3.validate()){
            System.out.println("Product is valid");
            p3.fulfill();
        }else{
            System.out.println("Invalid product");
        }
    }
}
