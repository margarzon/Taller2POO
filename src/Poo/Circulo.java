package Poo;

public class Circulo {
    private float area;

    public Circulo(float area) {
        this.area = area;

    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void calcularArea() {
        float area = 0;
        area = area * area;
        System.out.println("El area del circulo es: " + area);
    }

}
