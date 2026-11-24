import java.util.Scanner;
import java.util.InputMismatchException;


public class Ej442_02_EntradaCine {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce tu edad: ");
            int edad = sc.nextInt();
            System.out.println("Edad: " + edad + " años.");
            double precio;
            if (edad < 12) {
                precio = 4.5;
            } else if (edad >= 65) {
                    precio = 5.0;
                } else {
                    precio = 8.0;
                }
                System.out.println("El precio de su entrada es de: " + precio + " euros.");
                System.out.println("¡Disfruta de la película!");

        } catch (InputMismatchException e) {
            System.out.println("Introduce un numero entero, ni letras ni decimales.");
        }
        
    }
}
