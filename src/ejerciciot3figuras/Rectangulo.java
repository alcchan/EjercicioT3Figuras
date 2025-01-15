package ejerciciot3figuras;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la base del rectangulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = scanner.nextDouble();

        // Calcular el área y el perímetro
        double area = base * altura; // Área = base * altura
        double perimetro = 2 * (base + altura); // Perímetro = 2 * (base + altura)

        // Mostrar los resultados
        System.out.println("\n--- Resultados del Rectangulo ---");
        System.out.println("Area: " + String.format("%.2f", area));
        System.out.println("Perimetro: " + String.format("%.2f", perimetro));

        scanner.close();
    }
}

