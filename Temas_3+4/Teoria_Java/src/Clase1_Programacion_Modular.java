public class Clase1_Programacion_Modular {
    public static int sumar (int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }
    public static void main (String []args){

        int numA1 = 3;
        int numA2 = 4;
        int numB1 = 6;
        int numB2 = 8;
        int numC1 = 12;
        int numC2 = 7;

        int respuesta = sumar(numA1,numA2);//Llamada al método de arriba

        int sumaA = numA1 + numA2;
        int sumaB = numB1 + numB2;
        int sumaC = numC1 + numC2;

        System.out.println("El resultado de sumaA es: " + sumaA + ".");
        System.out.println("El resultado de sumaB es: " + sumaB + ".");
        System.out.println("El resultado de sumaC es: " + sumaC + ".");

        System.out.println(respuesta);

    }
}
