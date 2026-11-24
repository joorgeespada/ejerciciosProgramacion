public class Ej33_3_FichaGrupo {
    enum turno {MANANA, TARDE}

    public static void main(String[] args) {
        final int MAX_ALUMNOS = 30;
        final String curso = "1ºDAM";
        int alumnosMatriculados = 24;
        turno grupo = turno.MANANA;
        int plazasLibres = 0;
        String delegado = null;
        plazasLibres = MAX_ALUMNOS - alumnosMatriculados;
        System.out.println(plazasLibres);
        

    }
}

