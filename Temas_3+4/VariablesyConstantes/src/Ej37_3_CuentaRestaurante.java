import java.util.Scanner;

public class Ej37_3_CuentaRestaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el importe de la cuenta: ");
        String importe = sc.nextLine();

        System.out.println("Introduzca el número de comensales: ");
        String comensales = sc.nextLine();

        System.out.println("Introduzca el porcentaje de propina: ");
        String propina = sc.nextLine();

        double importeD = Double.parseDouble(importe);
        int comensalesI = Integer.parseInt(comensales);
        int propinaI = Integer.parseInt(propina);

        double porcentajePropina =  (importeD * propinaI) / 100;
        System.out.println("La propina en euros: " + porcentajePropina);/*Daba cero porque vividía primero
                                                                         y al ser un integer era una multiplicación truncada a cero*/

        double precioPersona = (importeD + porcentajePropina) / comensalesI;
        System.out.println("El precio por persona es de " + precioPersona + " euros.");

        String valoracionCena = (precioPersona < 20) ? " económica" : " cara";
        System.out.println("La cena ha sido " + valoracionCena + ".");


    }
}
