package aula11;

public class CuriosidadeInt {
    
    public static void main(String[] args) {
        
        int var1 = 2147483647; // limite (-2.147.483.648 || 2.147.483.647)
        int var2 = 1;
        

        //O que aconte aqui? Ele Soma ou da erro?
        System.out.println(var1 + var2);

        /*
         * Resposta: soma, porque os números em java funcionam igual uma roleta, 
         * no momento que pega o limete e soma outra coisa ele vai voltar para os números negativos. 
         * Isso para qualquer tipo de valor inteiro no java.
         */
    }
}
