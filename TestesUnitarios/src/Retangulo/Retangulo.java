package Retangulo;

public class Retangulo {

    private double altura;
    private double base;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getArea() {
        return altura * base;
    }

    public double getPerimetro() {
        return 2 * altura + 2 * base;
    }

    public double getAltura() {
        return altura;
    }
}
