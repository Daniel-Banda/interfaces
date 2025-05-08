
public class Rombo implements FiguraGeometrica {
    private String nombre;
    private double lado;
    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo(String nombre, double lado, double diagonalMayor, double diagonalMenor) {
        this.nombre = nombre;
        this.lado = lado;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public String toString() {
        return "Rombo [nombre=" + nombre + ", lado=" + lado +
               ", diagonalMayor=" + diagonalMayor + ", diagonalMenor=" + diagonalMenor + "]";
    }
}
