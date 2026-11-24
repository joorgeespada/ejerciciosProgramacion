import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej442_01_RepartoCaramelos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("¿Cuántos caramelos hay? (introduce un número entero): ");
            int caramelos = sc.nextInt();
            System.out.print("¿Cuántos niños hay? (introduce un número entero): ");
            int ninos = sc.nextInt();
            int reparto = caramelos / ninos;
            int resto = caramelos % ninos;

            System.out.println("Cada niño toca a " + reparto + " caramelos.");
            System.out.println("Sobran " + resto + " caramelos.");
            System.out.println("Fin del reparto.");

        } catch (InputMismatchException e) {
            System.out.println("Eso no es un número entero.");
        } catch (ArithmeticException e) {
            System.out.println("Error división: " + e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}




