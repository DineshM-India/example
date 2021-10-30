package InheritanceVehicle;
interface Vechicle {
	 void engine();
     void start();
     void stop();
}
class Car  implements Vechicle{
public void driver(){
		System.out.println("Be a Driver");
	}
public void engine() {
	System.out.println("Car: EngineType:Diesel");
}
public void start() {
	System.out.println("Car: Started...");
}
public void stop() {
	System.out.println("Car: Stop");
}

}

class Aeroplane  implements Vechicle{
public void piolet() {
System.out.println("Be a Piolet");		
	}
public void engine() {
	System.out.println("Aero: EngineType:Petrol");	
}
public void start() {
	System.out.println("Areo : Started...");
}
public void stop() {
	System.out.println("Aero : Stop");
}
}
class Boat  implements Vechicle{
	public void helms(){
		System.out.println("Be a Helms");
	}
public void engine() {
	System.out.println("Boat: EngineType:Diesel");
	
}
public void start() {
	System.out.println("Boat: Started...");
}
public void stop() {
	System.out.println("Boat: Stop");
}
}
class Road extends Car{
	 Road(){
		engine();
		driver();
		start();
		stop();
	}
}
class Air extends Aeroplane{
	Air(){
		engine();
	    piolet();
	    start();
	    stop();
	}
}
class Water extends Boat{
	Water(){
		engine();
		helms();
		start();
		stop();
		
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Road  obj1 = new Road();
		Air   obj2 = new Air();
		Water obj3 = new Water();
	
	}

}
