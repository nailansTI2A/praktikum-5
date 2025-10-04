class Kalkulator {
    int tambah(int a, int b) {
        return a + b;
    }

    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    double tambah(double a, double b) {
        return a + b;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();

        System.out.println("Tambah 2 int   : " + k.tambah(5, 10));
        System.out.println("Tambah 3 int   : " + k.tambah(5, 10, 15));
        System.out.println("Tambah 2 double: " + k.tambah(2.5, 3.7));
    }
}
