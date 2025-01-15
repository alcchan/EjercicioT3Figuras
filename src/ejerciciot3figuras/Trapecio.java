package ejerciciot3figuras;

import java.util.Scanner;

public class Trapecio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base mayor del trapecio: ");
        double baseMayor = scanner.nextDouble();

        System.out.print("Ingrese la base menor del trapecio: ");
        double baseMenor = scanner.nextDouble();

        System.out.print("Ingrese la altura del trapecio: ");
        double altura = scanner.nextDouble();

        System.out.print("Ingrese el lado 1 del trapecio: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese el lado 2 del trapecio: ");
        double lado2 = scanner.nextDouble();

        //Area
        double area = ((baseMayor + baseMenor) * altura) / 2;

        //Perimetro
        double perimetro = baseMayor + baseMenor + lado1 + lado2;

        // Determinar trapecio 
        String tipoTrapecio;
        if (lado1 == lado2) {
            tipoTrapecio = "Es un trapecio isósceles.";
        } else {
            tipoTrapecio = "Es un trapecio escaleno.";
        }

        System.out.println("\n--- Resultados del Trapecio ---");
        System.out.println("Area: " + String.format("%.2f", area));
        System.out.println("Perimetro: " + String.format("%.2f", perimetro));
        System.out.println(tipoTrapecio);

        scanner.close();
    }
}
