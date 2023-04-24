public class Segmento {

    private final Punto p1;
    private final Punto p2;

    public Segmento(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Punto getMidpoint() {

        int x = (p1.getX() + p2.getX()) / 2;
        int y = (p1.getY() + p2.getY()) / 2;
        return new Punto(x, y);
    }

    public Segmento clone() {
        Punto p1 = this.p1.clone();
        Punto p2 = this.p2.clone();
        return new Segmento(p1, p2);
    }

    public String toString() {
        return "(" + this.p1 + ", " + this.p2 + ")";
    }
}
