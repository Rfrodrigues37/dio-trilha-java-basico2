/* Conceito de herança em prática */

public class ContaCorrente extends Conta {

    private static int SEQUENCIAL;

    public ContaCorrente() {

        super.agencia = 1;
        super.numero = SEQUENCIAL;


    }

}