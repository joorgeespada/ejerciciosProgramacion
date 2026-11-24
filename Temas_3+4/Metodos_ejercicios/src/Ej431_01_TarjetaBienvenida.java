import java.util.Scanner;

public class Ej431_01_TarjetaBienvenida {

    public static void linea(){
        System.out.println("==============================");
    }

    public static void saludar() {
        System.out.println("¡Hola Ana!: Bienvenida a 1º de DAM");
        System.out.println("¡Hola Luis!: Bienvenida a 1º de DAM");
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cómo te llamas: ");
        String nombre = sc.nextLine();
        linea();
        saludar();
        System.out.println("¡Hola " + nombre +"!: Bienvenida a 1º de DAM");
        linea();
    }
}
