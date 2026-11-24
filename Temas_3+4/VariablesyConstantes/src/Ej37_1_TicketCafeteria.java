import java.util.Scanner;

public class Ej37_1_TicketCafeteria {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        final double IVA_HOSTELERIA = 0.10;
        double cafe = 1.50;

        System.out.print("Introduzca el producto deseado: ");
        String producto = sc.nextLine();

        System.out.print("Cantidad: ");
        String cantidad = sc.nextLine();

        System.out.print("Precio sin IVA: ");
        String precio = sc.nextLine();

        int pedido = Integer.parseInt(cantidad);
        double euros = Double.parseDouble(precio);

        double precioFinal = pedido * euros;
        System.out.println("Precio final sin IVA: " + precioFinal + ".");

        double precioIVA = precioFinal * IVA_HOSTELERIA;
                System.out.println("IVA 10%: " + precioIVA);
        double sumaIVA = precioIVA + precioFinal;
        System.out.println("Precio final con IVA: " + sumaIVA); //no he usado nextInt porque solo usaremos nextline para evitar fallos de java al mezclar.



        sc.close();

    }
}
