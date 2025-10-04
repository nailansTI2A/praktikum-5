abstract class Animal {
    public abstract void sound();

    // Concrete method 
    public void sleep() {
        System.out.println("Tidur...");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Anjing: Guk guk!");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Kucing: Meong!");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        System.out.println("Abstract Class Demo");
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a1.sleep();

        a2.sound();
        a2.sleep();
    }
}
