public class Ej431_03_ImprimirODevolver {

    public static void mostrarDoble(int n) {
        System.out.println("El doble de " + n + " = " + (n * 2));
    }

    public static int doble(int n){
        return n * 2;
    }

    public static void main (String [] args){


        mostrarDoble(5);
        int i = doble(5) + doble(3);
        System.out.println("El resultado de doble(5) + doble(3) es: " + i);
        doble(doble(4));

        if (doble(7) > 10){
            System.out.println("El doble de 7 es mayor que 10.");
        }

        //int x = mostrarDoble(5);  //pide como que sea una funcion o algo asi


    }
}
