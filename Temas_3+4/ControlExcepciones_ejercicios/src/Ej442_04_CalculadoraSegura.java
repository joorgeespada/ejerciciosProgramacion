import java.util.Scanner;


public class Ej442_04_CalculadoraSegura {

    public static int leerEntero(Scanner sc, String mensaje) {
        int numero = 0;
        boolean interruptor = false;

        while (!interruptor) {
            try {
                System.out.print(mensaje);
                String elegido = sc.nextLine();
                numero = Integer.parseInt(elegido);
                interruptor = true;

            } catch (NumberFormatException e) {
                System.out.println("Eso no es un número entero. Inténtalo de nuevo.");
            }
        }
        return numero;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eleccion = 0;
        do {
            System.out.println("=== CALCULADORA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Resto");
            System.out.println("6. Raíz cuadrada: primer número para raíz y segundo cero");
            System.out.println("0. Salir");

            eleccion = leerEntero(sc, "Opción: ");

             boolean parada = false;

                if (eleccion >= 1 && eleccion <= 6) {
                    int num1 = leerEntero(sc, "Primer número: ");
                    int num2 = leerEntero(sc, "Segundo número: ");
                    switch (eleccion) {
                        case 1:
                            double suma = num1 + num2;
                            System.out.println("Resultado: " + num1 + " + " + num2 + " = " + suma);
                            break;
                        case 2:
                            double resta = num1 - num2;
                            System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resta);
                            break;
                        case 3:
                            double multiplicacion = num1 * num2;
                            System.out.println("Resultado: " + num1 + " + " + num2 + " = " + multiplicacion);
                            break;
                        case 4:
                            double division = num1 / num2;
                            System.out.println("Resultado: " + num1 + " + " + num2 + " = " + division);
                            break;
                        case 5:
                            int resto = num1 % num2;
                            if (num1 < num2){
                                System.out.println("Resultado: 0");
                            }else {
                                System.out.println("Resultado: " + num1 + " % " + num2 + " = " + resto);
                            }
                            break;
                        case 6:
                             int raizCuadrada = num1 * num1;
                            System.out.println("Resultado: " + num1 + " * " + num1 + " = " + raizCuadrada);
                        }
                    System.out.println();
                }else if (eleccion == 0){
                    System.out.println("¡Hasta luego!");
                }

                else {
                    System.out.println("Prueba con un número de 1 al 5 :)");
                }
            } while (eleccion != 0);
        }
    }

