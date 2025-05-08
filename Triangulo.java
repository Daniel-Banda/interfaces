public class Triangulo implements FiguraGeometrica {
	private String nombre;
	private double base;
	private double altura;
	private double lado;

	public Triangulo(String nombre, double base, double altura, double lado) {
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}

	@Override
	public double calcularPerimetro() {
		return lado * 3;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Triangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}
}

