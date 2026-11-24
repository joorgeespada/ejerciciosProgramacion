import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        try {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota (0-10): ");
        double nota = sc.nextDouble();

        String calificacion = (nota < 0 || nota > 10) ? "Nota no válida"
                : (nota < 5) ? "Suspenso"
                : (nota < 7) ? "Aprobado"
                : (nota < 9) ? "Notable"
                : "Sobresaliente";

        System.out.println("Calificación: " + calificacion);
        sc.close();
        } catch (Exception e) {
            System.out.println("Con coma muchacho: " + e.getMessage());
        }
    }
}



