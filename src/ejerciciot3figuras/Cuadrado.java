package ejerciciot3figuras;

import java.util.Scanner;

public class Cuadrado {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();

        // Calcular
        double area = Math.pow(lado, 2); // Área = lado^2
        double perimetro = 4 * lado;    // Perímetro = 4 * lado

        System.out.println("\n--- Resultados del Cuadrado ---");
        System.out.println("Area: " + String.format("%.2f", area));
        System.out.println("Perimetro: " + String.format("%.2f", perimetro));

        scanner.close();
    }
}


