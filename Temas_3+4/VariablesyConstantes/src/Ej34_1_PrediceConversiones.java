public class Ej34_1_PrediceConversiones {
    public static void main(String[] args){
        int unidades = 7;
        double precioUnidad = 2.75;
        double temperatura = 21.8;

        //implícita
        double unidadesDecimal = unidades;
        //
        double importe = unidades * precioUnidad;
        //Explícita
        int temperaturaEntera = (int) temperatura;
        //Implícita
        long temperaturaRedondeada = Math.round(temperatura);
        //Explícita
        int importeEntero = (int) importe;

        String texto = "Unidades: " + unidades;

        System.out.println("A) " + unidadesDecimal);
        System.out.println("B) " + importe);
        System.out.println("C) " + temperaturaEntera);
        System.out.println("D) " + temperaturaRedondeada);
        System.out.println("E) " + importeEntero);
        System.out.println("F) " + texto);
    }
}
