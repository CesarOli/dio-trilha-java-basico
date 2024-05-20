public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 3000;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numeroQualquer = 43;
        System.out.println(numeroQualquer);

        numeroQualquer = 10;

        System.out.println(numeroQualquer);

        final double VALOR_DE_PI = 3.14;  
        System.out.println(VALOR_DE_PI);
    }
}
