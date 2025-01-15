package ejerciciot3figuras;

import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del circulo: ");
        double radio = scanner.nextDouble();

        // Calcular
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("\n--- Resultados del Circulo ---");
        System.out.println("Area: " + String.format("%.2f", area));
        System.out.println("Perimetro: " + String.format("%.2f", perimetro));

        scanner.close();
    }
}

