public class Ej35_3_AccesoConcierto {
    public static void main(String[] args){
          int edad = 16;
        boolean tieneEntrada = true;
        boolean vaAcompanado = false;
        String tipoEntrada = "VIP";

        boolean puedeEntrar = (tieneEntrada == true) && ((vaAcompanado == true) || (edad >= 18));
        System.out.println("¿Puede entrar?: " + puedeEntrar);

        boolean esVip = "VIP".equals("VIP");
        System.out.println("¿Es VIP?: "+ esVip);

        String pista = (esVip == true) ? "Puedes entrar a la zona vip" : "No puedes entrar a la pista";
        System.out.println(pista);

//        System.out.println("Edad el próximo concierto: " + edad + 2);
//        System.out.println("Edad el próximo concierto: " + (edad + 2));
        /*En la primera salida por pantalla, al ir detrás de un string se realiza una conversión implícita
        y se añade el 2 al valor de la variable. Y en la segunda al tener paréntesis primero se realiza la suma
        y luego la salida por pantalla del string.*/
    }
}
