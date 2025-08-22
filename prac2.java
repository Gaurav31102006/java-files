class Car {
private String brand;
private String model;
private double price;


//setter class


public void setBrand(String b)
{
this.brand=b;
}
public void setModel(String m)

{this.model=m;
}
public void setPrice(double p)
{ this.price=p; }


//getter class

public String getBrand()
{
    return(this.brand);
}

public String getModel()
        
{
    return(this.model);
}

public double getPrice()
        
{
    return(this.price);
}

//main class

    public void displayDetails() {
        System.out.println("Car details");
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Price:"+price+"\n");
        
    }
}
//main class
public class prac2 {
    public static void main (String[]args) {
        
        Car c1 = new Car();
c1.setBrand("Toyota");
c1.setModel("Fortuner");
c1.setPrice(5000000);

        Car c2 = new Car();
c2.setBrand("Koenigsegg");
c2.setModel("Gamera");
c2.setPrice(89009999);

Car c3 = new Car();
c3.setBrand("Koenigsegg");
c3.setModel("Jesko");
c3.setPrice(89009999);


// displaying

/*c1.displayDetails();
c2.displayDetails();
c3.displayDetails();
*/

System.out.println("Car details");
System.out.println("Brand:"+c1.getBrand());
System.out.println("Model:"+c1.getModel());
System.out.println("Price:"+c1.getPrice()+"\n");

System.out.println("Car details");
System.out.println("Brand:"+c2.getBrand());
System.out.println("Model:"+c2.getModel());
System.out.println("Price"+c2.getPrice()+"\n");

System.out.println("Car details");
System.out.println("Brand:"+c3.getBrand());
System.out.println("Model:"+c3.getModel());
System.out.println("Price:"+c3.getPrice()+"\n");


    }
}

