public class Ej34_3_MediaNotas {
    public static void main(String []args){
        int notaUno = 7;
        int notaDos = 8;
        int notaTres = 8;

        int suma = notaUno + notaDos + notaTres;
        int mediaEntera =   suma / 3;
        double mediaMal = suma / 3;
        double mediaBien = (double) suma / 3;
        int mediaTruncada = (int) mediaBien;
        long mediaRedondeada = Math.round(mediaBien);

        System.out.println(mediaEntera);
        System.out.println(mediaMal);
        System.out.println(mediaBien);
        System.out.println(mediaTruncada);
        System.out.println(mediaRedondeada);

    }
}
