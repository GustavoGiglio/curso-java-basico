package Aula07;

/* 
-------------------------------------------------------------------
Erro02.java:8: error: variable cont might not have been initialized
System.out.println("você digitou: "+ cont);
-------------------------------------------------------------------
public class Erro02 {
    public static void main(String[] args) {
        int cont;
        System.out.println("você digitou: "+ cont);
    }
}
*/

public class Erro02 {
    public static void main(String[] args) {
        int cont = 0;
        System.out.println("você digitou: "+ cont);
    }
}