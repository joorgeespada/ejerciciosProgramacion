public class Ej33_1_FichaVideojuego {
    public static void main (String[] args) {
        String titulo = "Aventura en Aranjuez";
        int anioLanzamiento = 2025;
        double precio = 59.99;
        boolean disponible = true;
        var plataforma = "PC";  //Se refiere a un dato de tipo "String"
        var jugadoresMaximos = 4;   //Se refiere a un dato de tipo "integer"
        System.out.println(titulo);
        System.out.println(anioLanzamiento);
        System.out.println(precio);
        System.out.println(disponible);
        System.out.println(plataforma);
        System.out.println(jugadoresMaximos);

        String oferta = "NUEVA OFERTA";

        precio = 39.99;
        disponible = false;
        System.out.println(oferta);
        System.out.println(precio);
        System.out.println(disponible);
    }
}
