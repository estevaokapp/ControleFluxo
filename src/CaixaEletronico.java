import java.util.Scanner;



public class CaixaEletronico {
    public static void main(String[] args) {
         double valor = 100;
  
         
         double depositar = 0;
         Scanner scan = new Scanner(System.in) ;

        System.out.println("informe seu nome");
        String nome = scan.next();
        
        
        
        System.out.println("informe o valor de saque");
        double saque = scan.nextDouble();

        if (saque > valor){
            System.out.println("Saldo insuficiente!");
        }else{
            valor = valor - saque;
            System.out.println("saque efetuado com sucesso");
            System.out.println(nome + " sacou " + saque + " reais ");
            System.out.println("valor disponivel para na conta " + valor + "reais");
        }







    }
}
