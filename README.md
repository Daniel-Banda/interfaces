# Interfas: Figuras Geométricas en Java

## Objetivo

El objetivo principal es implementar un sistema que permita calcular el **área** y el **perímetro** de distintas figuras geométricas, implementando el concepto de interfaces.

## Estructura del proyecto

El proyecto incluye las siguientes clases:

- `FiguraGeometrica` (Interfaz): Define los métodos comunes `calcularArea()`, `calcularPerimetro()` y `getNombre()`.
- `Triangulo`: Clase que representa un triángulo equilátero.
- `Cuadrado`: Clase que representa un cuadrado.
- `Rectangulo`: Clase que representa un rectángulo.
- `Rombo`: Clase que representa un rombo.
- `Romboide`: Clase que representa un romboide.
- `Trapecio`: Clase que representa un trapecio (con base mayor, base menor y altura).
- `Main`: Contiene el método principal `main()` que instancia un objeto de cada figura, calcula sus propiedades y las imprime en consola.

## Ejemplo de salida

```bash
Triangulo [nombre=Bermudas, base=20.0, altura=10.0, lado=15.0]
+------------------------------------------------------+
| El área de [Bermudas]
| es100.0
+------------------------------------------------------+
| El perímetro de [Bermudas]
| es45.0
+------------------------------------------------------+