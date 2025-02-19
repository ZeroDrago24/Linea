class Punto {
    public float x, y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }
}

class Linea {
    public Punto p1, p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return "Línea desde " + p1 + " hasta " + p2;
    }

    public void dibujaLinea() {
        System.out.println("Dibujando línea entre " + p1 + " y " + p2);
    }
}

class Circulo {
    public Punto centro;
    public float radio;

    public Circulo(Punto c, float r) {
        this.centro = c;
        this.radio = r;
    }

    public String toString() {
        return "Círculo con centro en " + centro + " y radio " + String.format("%.2f", radio);
    }

    public void dibujaCirculo() {
        System.out.println("Dibujando círculo con centro " + centro + " y radio " + radio);
    }
}

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(0.0f, 3.0f);
        Punto p2 = new Punto(4.0f, 7.0f);

        Linea linea = new Linea(p1, p2);
        Circulo circulo = new Circulo(p1, 5.0f);

        System.out.println(linea);
        linea.dibujaLinea();

        System.out.println(circulo);
        circulo.dibujaCirculo();
    }
}
