public class Comentarios {
    public static void main(String[] args) {
        // Ola eu sou um comentário em uma única linha


        /*Olá
         * Eu sou um comentário mais detalhado 
         * quando necessário, e/ ou mais robusto.
         */
    }
    public void metodo(){
        /*Este método foi elaborado as pressas
         * por isso eu abrevei o nome das variáveis 
         * mas olha, ele tem a finalidade de somar ou multiplicar 
         * dois números
         */
        }

        public int somaMultiplica(int n, int x, String m){ 
            int r = 0; // r é igual ao resultado
            if(m == "M"){ // M= multiplicação
                r = n * x;
            }else{
                // se não soma mesmo
                r = n + x;
            }
            return r;
            
        }
    }