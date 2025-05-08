
public class Trapecio implements FiguraGeometrica {
    private String nombre;
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;
    private double baseMayor;
    private double baseMenor;
    private double altura;

    public Trapecio(String nombre, double lado1, double lado2, double lado3, double lado4,
                    double baseMayor, double baseMenor, double altura) {
        this.nombre = nombre;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3 + lado4;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Trapecio [nombre=" + nombre + ", lado1=" + lado1 + ", lado2=" + lado2 +
               ", lado3=" + lado3 + ", lado4=" + lado4 + ", baseMayor=" + baseMayor +
               ", baseMenor=" + baseMenor + ", altura=" + altura + "]";
    }
}

