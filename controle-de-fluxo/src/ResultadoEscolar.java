public class ResultadoEscolar {
    public static void main(String[] args) {
        // Cenário 2 if / else

        int nota = 3;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
