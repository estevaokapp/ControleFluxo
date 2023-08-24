import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class controleFluxo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // ESTRUURAS DE REPETIÇÕES FOR
        /*
         * for (int carneirinhos = 1; carneirinhos<=20;carneirinhos++){
         * System.out.println("Contando carneirinhos " + carneirinhos);
         * }
         */
        /*
         * String alunos [] = {"felipe","Estevao","Samuel","Abraão"};
         * for (int x = 0; x < alunos.length; x++){
         * System.out.println("aluno no indice x = " + x+ " é " + alunos [x]);
         * }
         */
        // EXEMPLO WHILE
        // enquanto um bloco condicional for valido sera executado
        // ate que ele se torne falso
        /*
         * double mesada = 50.0;
         * while (mesada > 0) {
         * Double valorDoce = valorAleatorio();
         * if (valorDoce > mesada)
         * valorDoce = mesada;
         * System.out.println("valor do doce " + valorDoce + " adicionado ao carrinho");
         * mesada = mesada - valorDoce;
         * }
         * System.out.println("Mesada " + mesada);
         * System.out.println("gastou toda sua mesada em doces");
         * }
         * 
         * private static double valorAleatorio() {
         * return ThreadLocalRandom.current().nextDouble(2, 8);
         * }
         */
        // DO-WHILE
        // testa a condicao apos executaro codigo sendo assim, mesmo que a condiçao
        // seja considerada invalida no primeiro teste o bloco sera executado pelo
        // menos uma vezes.
        /*
         * System.out.println("Discando...");
         * do{
         * System.out.println("telefone tocando");
         * }while(tocando());
         * 
         * System.out.println("ALo !!!");
         * 
         * }
         * public static boolean tocando(){
         * boolean atendeu = new Random().nextInt(3)==1;
         * System.out.println("atendeu? " + atendeu );
         * return ! atendeu;
         */
        /*for(int x=1;x<=10;x++){
            if(x % 2==0) //% operador que representa módulo de uma divisão
                System.out.println(x);
    }*/
    }
}