
public class Main {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo("Bermudas", 20, 10, 15);
        Cuadrado c1 = new Cuadrado("Cuadrado", 12);
        Rectangulo r1 = new Rectangulo("Rectangulo", 8, 4);
        Rombo ro1 = new Rombo("Rombo", 6, 5, 10);
        Romboide rb1 = new Romboide("Romboide", 9, 4);
        Trapecio tr1 = new Trapecio("Trapecio", 5, 6, 7, 8, 6, 8, 4);

			
		imprimirCalculos(t1);
        imprimirCalculos(c1);
        imprimirCalculos(r1);
        imprimirCalculos(ro1);
        imprimirCalculos(rb1);
        imprimirCalculos(tr1);

	}//main

	public static void imprimirCalculos(FiguraGeometrica f) {
		System.out.println(f);
		System.out.println("+------------------------------------------------------+");
		System.out.println("| El área de [" + f.getNombre()
		+ "]");
		System.out.println("| es " + f.calcularArea());
		System.out.println("+------------------------------------------------------+");
		System.out.println("| El perímetro de [" + f.getNombre()
		+ "]");
		System.out.println("| es " + f.calcularPerimetro());
		System.out.println("+------------------------------------------------------+");

	}//imprimirCalculos
}//class Main