import java.util.Scanner;

public class Ej37_4_CuotaGimnasio {
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);

        int precioInicial = 30;
        final int DESC_VEINTICINCO = 20;
        final int DESC_ESTUDIANTES = 10;

        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Introduce tu edad: ");
        String edad = sc.nextLine();

        System.out.println("¿Eres estudiante?: ");
        String estudiante = sc.nextLine();

        double descuentoMenores = precioInicial * DESC_VEINTICINCO / 100;
        double precioMenores = precioInicial - descuentoMenores;

        int edadInteger = Integer.parseInt(edad);
        boolean esEstudiante = estudiante.equals("si");

        double descuentoEstudiante = precioInicial * DESC_ESTUDIANTES / 100;
        double precioestudiante = precioInicial - descuentoEstudiante;

        System.out.println("--FICHA DE SOCIO-- ");
        System.out.println("Nombre:  " + nombre);
        System.out.println("Edad: " + edad);



        if ((edadInteger < 25) && (esEstudiante == false )){
            System.out.println("Descuento aplicado: " + DESC_VEINTICINCO + "%" );
            System.out.println("Su precio con descuento de menor de 25 es de: " + precioMenores + " euros.");
        }

        if ((esEstudiante == true) && (edadInteger > 25)){
            System.out.println("Descuento aplicado: " + DESC_ESTUDIANTES + "%");
            System.out.println("Su precio con descuento de estudiante es: " + precioestudiante + " euros.");
        }

        if ((edadInteger < 25) && (esEstudiante == true)){
            double dobleDescuento = precioInicial - (descuentoEstudiante + descuentoMenores) ;
            System.out.println("Descuentos aplicados: 10 + 20 = 30% " );
            System.out.println("Precio con ambos descuentos:" + dobleDescuento + " euros." );
            //
        }

        if (!(edadInteger < 25) && !(esEstudiante == true)){
            System.out.println("Su precio sin descuento es de: " + precioInicial + " euros.");

        }
        

        }


    }
