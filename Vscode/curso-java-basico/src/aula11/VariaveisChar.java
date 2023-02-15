package aula11;

public class VariaveisChar {
    public static void main(String[] args) {
        
        char o = 'o'; //o = 111
        char i = 'i'; //i = 105
        char interrogcao = 0X00E1;

        System.out.println(o+i); //msg saída = 216
        System.out.println(""+ o + i); //msg saída = oi 
        System.out.println(""+ o + i + interrogcao); //msg saída = oi?

        
    }
    
}
