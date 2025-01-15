package ejerciciot3figuras;

import java.util.Scanner;

public class Rombo {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.print("Ingrese la diagonal mayor del rombo: ");
        double diagonalMayor = scanner.nextDouble();

        System.out.print("Ingrese la diagonal menor del rombo: ");
        double diagonalMenor = scanner.nextDouble();

        System.out.print("Ingrese el lado del rombo: ");
        double lado = scanner.nextDouble();

        //Area
        double area = (diagonalMayor * diagonalMenor) / 2;

        //Perímetro
        double perimetro = 4 * lado;

        // Determinar las
        String tipoRombo;
        if (diagonalMayor == diagonalMenor) {
            tipoRombo = "Es un rombo con diagonales iguales (un cuadrado).";
        } else {
            tipoRombo = "Es un rombo con diagonales diferentes.";
        }

        System.out.println("Area: " + String.format("%.2f", area));
        System.out.println("Perimetro: " + String.format("%.2f", perimetro));
        System.out.println(tipoRombo);

        scanner.close();
    }
}
