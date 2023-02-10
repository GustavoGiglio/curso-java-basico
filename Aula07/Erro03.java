package Aula07;

/*
---------------------------------------------------------------
error: can't find main(String[]) method in class: Aula07.Erro03
---------------------------------------------------------------
public class Erro03 {

    public static void Main(String[] args) {
        System.out.println("Você digitou: " + 1/0);
    }
}
-------------------------------------------------------------------
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Aula07.Erro03.main(Erro03.java:29)
-------------------------------------------------------------------
public class Erro03 {
    
    public static void main(String[] args) {
        System.out.println("Você digitou: " + 1/0);
    }
}

*/

public class Erro03 {
    
    public static void main(String[] args) {
        System.out.println("Você digitou: " + 1/2);
    }
}