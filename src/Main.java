public class Main {
    public static void main(String[] args) {
        /*for (int i = 0; i < 1000; i++) {
            Punto p = new Punto(i, i);
            System.out.println(p);
            System.out.println("Ho allocato " + Punto.getAllocations() + " punti");
        }
        Punto p = new Punto(1001,1001);
        System.out.println("Ho allocato " + Punto.getAllocations() + " punti");

    }
}
*/

        Punto punto1 = new Punto(2, 4);
        Punto punto2 = new Punto(2, 6);

        Segmento s1 = new Segmento(punto1, punto2);

        System.out.println("Segmento è: " + s1);
        System.out.println("Il punto medio del segmento s1: " + s1.getMidpoint());
    }
}
