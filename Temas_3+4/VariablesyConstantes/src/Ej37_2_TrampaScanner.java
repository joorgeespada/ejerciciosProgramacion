import java.util.Scanner;

public class Ej37_2_TrampaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos años tienes? ");
        String edad = sc.nextLine();
        int edadNum = Integer.parseInt (edad);//Si cambiamos por nextLine funcionaría

        System.out.print("¿Cómo te llamas? "); // Ocurre que la línea del nombre y la ciudad se juntan
        String nombre = sc.nextLine();//Creo que es por que java colapsa al mezclar nextLine con otro

        System.out.print("¿En qué ciudad vives? ");
        String ciudad = sc.nextLine();

        System.out.println("Hola, " + nombre + " de " + ciudad
                + ". Dentro de 10 años tendrás " + (edadNum + 10) + " años.");
        sc.close();
    }
}