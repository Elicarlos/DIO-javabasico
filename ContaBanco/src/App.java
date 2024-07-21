import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        ContaTerminal conta;
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o seu nome:");
        String nome = scan.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scan.nextLine();

        System.out.println("Numero da conta");
        int numero_conta = scan.nextInt();

        

       

        conta = new ContaTerminal();
        conta.agencia = agencia;
        conta.nome = nome;
        conta.numero = numero_conta;
     

        System.out.println("Olá "+ conta.nome + " , obrigado por criar uma conta em nosso banco, sua agência é: " + conta.agencia + " , conta: " + conta.numero + " e seu saldo: " + conta.saldo + " já está disponível para saque");
        


        scan.close();
        

       
        
        
    }
}
