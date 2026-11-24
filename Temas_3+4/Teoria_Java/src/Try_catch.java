public class Try_catch {
    public static void main(String[] args){
        try {
            int numero1 = 5;
            int numero2 = 0;
            int resultado = numero1 / numero2;

            System.out.println("Fin del programa: " + resultado);

        }catch (ArithmeticException e){
            System.out.println("La has preparado colega :) " + e.getMessage());
        }
    }
}
