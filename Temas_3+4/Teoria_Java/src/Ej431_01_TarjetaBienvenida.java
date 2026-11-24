import java.util.Scanner;

public class Ej431_01_TarjetaBienvenida {

    public static void dibujarLinea() {
        System.out.println("==============================");
    }

    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre + ". Bienvenido/a a 1º de DAM.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");

        String nombrePersona = sc.nextLine();
        String nombrePersona1 = sc.nextLine();
        String nombrePersona2 = sc.nextLine();

        dibujarLinea();
        saludar(nombrePersona);
        saludar(nombrePersona1);
        saludar(nombrePersona2);
        dibujarLinea();

    }
}
