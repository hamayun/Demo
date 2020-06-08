import java.io.*; 
  
interface Vehicle { 
    // all are the abstract methods. 
    void changeGear(int a); 
    void speedUp(int a); 
    void applyBrakes(int a); 
} 
  
class Bicycle implements Vehicle{ 
    int speed; 
    int gear; 

    // to change gear 
    @Override
    public void changeGear(int newGear){ 
	    gear = newGear;
    } 
      
    // to increase speed 
    @Override
    public void speedUp(int increment){ 
	    speed = speed + increment;
    } 
      
    // to decrease speed 
    @Override
    public void applyBrakes(int decrement){ 
	    speed = speed - decrement;
    } 
    
    public void printStates() { 
         System.out.println("speed: " + speed + " gear: " + gear); 
    } 
} 

class Bike implements Vehicle {
    int speed;
    int gear;

    // to change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates() {
         System.out.println("speed: " + speed
             + " gear: " + gear);
    }
}

class SuperBike extends Bike {
    String make;
    int engineSize;

    public SuperBike(String m, int s){
	make = m;
	engineSize = s;
    }
}

class Car implements Vehicle{
    int speed;
    int gear;
    String make_model;

    public Car(String mm){
	make_model = mm;
    }

    // to change gear
    @Override
    public void changeGear(int newGear){
	gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment){
	speed = speed + (increment * 2);
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
	speed = speed - (decrement * 2);
    }

    public void printStates() {
         System.out.println(make_model + " speed: " + speed + " gear: " + gear);
    }
}

public class VehicleDemo { 
    public static void main (String[] args) { 
        // creating an inatance of Bicycle  
        // doing some operations  
        Bicycle bicycle = new Bicycle(); 
        bicycle.changeGear(2); 
        bicycle.speedUp(3); 
        bicycle.applyBrakes(1); 
        
        System.out.println("Bicycle present state :"); 
        bicycle.printStates();

        // creating instance of bike.
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.println("Bike present state :");
        bike.printStates();

        // creating instance of Car.
        Car car = new Car("Honda-Civic");
        car.changeGear(2);
        car.speedUp(4);
        car.applyBrakes(1);

        System.out.println("Car present state :");
        car.printStates();
    } 
} 

