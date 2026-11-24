
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ej442_03_NotaValida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean notaValida = false;

        double condicionParada;

        while (!notaValida) {
            try {
                System.out.println("Introduce tu nota en decimal: ");
                String nota = sc.nextLine();
                int notaInt = Integer.parseInt(nota);


                if (notaInt <= 10 && notaInt >= 0) {
                    String valoracion = "";
                    switch (notaInt) {
                        case 0, 1, 2, 3, 4:
                            valoracion = "insuficiente";
                            break;
                        case 5:
                            valoracion = "suficiente";
                            break;
                        case 6:
                            valoracion = "bien";
                            break;
                        case 7, 8:
                            valoracion = "notable";
                            break;
                        case 9, 10:
                            valoracion = "sobresaliente";
                            break;
                    }
                    System.out.println("Tu calificación es de: " + nota + " (" + valoracion + ")");
                    notaValida = true;
                }
                else{
                        System.out.println("Nota no válida");
                    }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
