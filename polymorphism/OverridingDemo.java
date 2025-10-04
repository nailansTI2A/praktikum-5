class Hewan {
    void suara() {
        System.out.println("Hewan mengeluarkan suara...");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Kucing mengeong: Meow!");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Anjing menggonggong: Guk guk!");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Hewan h1 = new Hewan();
        Hewan h2 = new Kucing();
        Hewan h3 = new Anjing();

        h1.suara();
        h2.suara();
        h3.suara();
    }
}
