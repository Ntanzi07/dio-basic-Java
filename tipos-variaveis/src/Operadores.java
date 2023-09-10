public class Operadores {
    public static void main(String[] args) throws Exception {
        System.out.println("\nExemplo 1");
        String nomeCompleto = "Nathan " + "Tanzi";
        System.out.println(nomeCompleto);
        
        System.out.println("\nExemplo 2");
        String concatena = "?";
        concatena = 1 + 1 + 1 + "1";
        System.out.println(concatena);
        concatena = 1 + "1" + 1 + "1";
        System.out.println(concatena);
        concatena = "1" + (1 + 1 + 1);
        System.out.println(concatena);

        System.out.println("\nExemplo 3");

        int numero = 5;
        System.out.println(- numero);
        System.out.println(numero);
        numero =-numero;
        System.out.println(numero);
        //para voltar a ser positivo
        numero =numero * -1;
        System.out.println(numero);

        System.out.println("\nExemplo 4");
        int a, b;
        a = 5;
        b = 6;
        //usando uma maneira simplificada
        String resultado = a==b ?"verdadeira" : "falso";
        //usando if/else
        /* 
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        */
        System.out.println(resultado);

        System.out.println("\nExemplo 5");
        int num1 = 2,num2 = 1;
        String tex1= "Hello";
        String tex2= "Hello";
        
        //comparar numeros
        System.out.println(num1 == num2);
        //comparar conteudo
        System.out.println(tex1.equals(tex2));
    }
}