public class Ej34_2_TextoANumero {
    public static void main(String[] args) {
        String edadTexto = "17";
        String precioTexto = "4.50";
        String socioTexto = "true";

        int edad = Integer.parseInt(edadTexto);
        double precio = Double.parseDouble(precioTexto);
        boolean socio = Boolean.parseBoolean(socioTexto);

        int año = edad + 1;
        double dosEntradas = precio * 2;

        System.out.println("El año que viene tendrás " + año + " años.");
        System.out.println("Dos entradas cuestan " + dosEntradas + " euros.");
        System.out.println("¿Es socio?: " + socio);

    }
}
