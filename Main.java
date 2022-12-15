public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.Puerta();
        miCoche.Puerta();
        miCoche.Puerta();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b) {
        return a + b;
    }
}

class Coche {
    public int puertas= 1;

    public void Puerta () {
        this.puertas++;
    }
}







