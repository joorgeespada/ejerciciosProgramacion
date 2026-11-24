import java.util.Scanner;

public class Ej431_02_Areas {

    public static double areaRectangulo(double base, double altura){

        return base * altura;
    }

    public static double areaRectanguloareaCirculo(double radio){

        return 3.14 * (radio * radio);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el largo del césped: ");
        String largo = sc.nextLine();
        System.out.println("Dame el ancho del césped: ");
        String ancho = sc.nextLine();
        System.out.println("Dame el radio de la fuente: ");
        String radio = sc.nextLine();

        double largoD = Double.parseDouble(largo);
        double anchoD = Double.parseDouble(ancho);
        double radioD = Double.parseDouble(radio);

        double areaRectangulo = areaRectangulo(largoD, anchoD);
        double areaCirculo = areaRectanguloareaCirculo(radioD);

        System.out.println("El área del rectángulo es de: " + areaRectangulo);
        System.out.println("El área del círculo es de: " + areaCirculo);

        double calculoTotal = areaRectangulo - areaCirculo;
        System.out.println("El área total es de: " + calculoTotal);

    }
}
