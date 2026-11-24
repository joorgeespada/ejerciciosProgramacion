import java.util.Scanner;

public class Ej432_01_ConversorTemperaturas {

    public static double celsiusAFahrenheit(double celsius){
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitACelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Pasándole 100 a celsiusAFahrenheit: " + celsiusAFahrenheit(100));

        System.out.println("Dame una temperatura: ");

        String temperatura = sc.nextLine();
        double temperauraDouble = Double.parseDouble(temperatura);

        double masDiez = celsiusAFahrenheit(temperauraDouble + 10);

        temperauraDouble = celsiusAFahrenheit(temperauraDouble);

        System.out.println("Temperatura pasada por el usuario: " + temperauraDouble);
        System.out.println("Temperatura pasada por el usuario + 10: " + masDiez);

        double idaYVuelta = fahrenheitACelsius(celsiusAFahrenheit(26));
        System.out.println("Ida y vuelta: " + idaYVuelta);

        //Por último, muestra una tabla de 0 a 40 ºC de 10 en 10, llamando al método dentro de un bucle for.

        for (int i = 0; i < 41; i+= 10){
            System.out.println(i + " - " + celsiusAFahrenheit(i));
        }
    }
}
