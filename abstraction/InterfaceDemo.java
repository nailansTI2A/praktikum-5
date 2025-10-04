interface Vehicle {
    void drive();
    void stop();
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Mobil berjalan di jalan raya...");
    }

    public void stop() {
        System.out.println("Mobil berhenti dengan rem cakram.");
    }
}

class Bike implements Vehicle {
    public void drive() {
        System.out.println("Motor melaju di jalur motor...");
    }

    public void stop() {
        System.out.println("Motor berhenti dengan rem tromol.");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("Interface Demo");
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.drive();
        v1.stop();

        v2.drive();
        v2.stop();
    }
}
