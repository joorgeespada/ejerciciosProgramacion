public class Ej36_3_BooleanasPasoAPaso {
    public static void main(String []args){
        int edad = 26;
        boolean tieneCarnet = false;
        boolean esSocio = true;

        boolean r1 = edad >= 18 && tieneCarnet || esSocio;// true && true = true
        boolean r2 = edad >= 18 && (tieneCarnet || esSocio);// true *Preguntar a raúl porque en la solución pone que es false*
        boolean r3 = !tieneCarnet && edad + 5 > 20;// true
        boolean r4 = edad % 2 == 0 && !esSocio;//false
//        boolean r5 = !(tieneCarnet || esSocio);//false

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);


        boolean r5 = !(tieneCarnet || esSocio);//de Morgan:false

        System.out.println(r5);
    }
}
