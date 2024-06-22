import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        //Banco digital

        Conta cc = new ContaCorrente();
        cc.depositar(200);
        
        Conta poupanca = new ContaPoupanca();
        cc.transferir(20, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}
