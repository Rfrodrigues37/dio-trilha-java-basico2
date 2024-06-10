import java.util.Scanner;
//
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal

        System.out.println("------------CONTA BANCARIA----------");
        System.out.println();
        System.out.println("Por favor, digite o numero da conta (1234)");
        System.out.println();
        numero = sc.nextInt();

        System.out.println("Por favor, digite o numero da Agência (123-8)");
        agencia = sc.next();

        System.out.println("Me informe o seu nome");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.println("Me informe seu saldo atual");
        saldo = sc.nextDouble();    

        //Exibir a mensagem da conta criada
        
        System.out.printf("Olá %s, obrigado por criar uma conta em"
                         + "nosso banco, sua agencia é %s, "
                         + "conta %d e seu saldo %.2f já esta disponivel "
                         + "para saque.", nomeCliente, agencia, numero, saldo);
        sc.close();
        
    }
}
