package ejerciciot3figuras;

import java.util.Scanner;
        
public class TrianguloRectangulo {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Ingrese la base del Triangulo Rectangulo:");
        double base = scanner.nextDouble();
        
         System.out.print("Ingrese la altura del triangulo rectangulo: ");
        double altura = scanner.nextDouble();

        // Calcular la hipotenusa (Teorema de Pitágoras)
        double hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        // Calcular el área
        double area = (base * altura) / 2;

        // Calcular el perímetro
        double perimetro = base + altura + hipotenusa;

        // Determinar el tipo de triángulo
        String tipoTriangulo;
        if (base == altura && altura == hipotenusa) {
            tipoTriangulo = "Triangulo equilatero";
        } else if (base == altura || base == hipotenusa || altura == hipotenusa) {
            tipoTriangulo = "Triangulo isosceles";
        } else {
            tipoTriangulo = "Triangulo escaleno";
        }

        // Mostrar los resultados
        System.out.println("\n--- Resultados del Triangulo Rectangulo ---");
        System.out.println("Hipotenusa: " + String.format("%.2f", hipotenusa));
        System.out.println("Area: " + String.format("%.2f", area));
        System.out.println("Perimetro: " + String.format("%.2f", perimetro));
        System.out.println("Tipo de Triangulo: " + tipoTriangulo);

        scanner.close();
    }
    
}
