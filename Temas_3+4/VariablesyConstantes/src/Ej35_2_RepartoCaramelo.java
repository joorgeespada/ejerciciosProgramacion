public class Ej35_2_RepartoCaramelo {
    public static void main (String [] args){
        int caramelos = 47;

        int repartoEntero = caramelos / 6;
        System.out.println(repartoEntero);

        int sobrante = caramelos % 6;
        System.out.println(sobrante);

        double particion = (double) caramelos / 6;
        System.out.println(particion);

        boolean sobraAlguno = sobrante != 0;
        System.out.println(sobraAlguno);

        boolean repartoJusto = sobrante == 0;
        System.out.println(repartoJusto);

        boolean masDe5 = particion >= 5;
        System.out.println(masDe5);


    }
}
