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


    }
}