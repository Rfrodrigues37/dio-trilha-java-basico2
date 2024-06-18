
public class Conta implements IConta {
    //Caracteriscicas - todas private, ou seja só podem ser vista dentro da classe*/
    //protected permite que as classes filhas consigam exergar tudo o que a classe mãe tem

    // private - aquilo que só seu pai sabe 
    // protected - seu pai sabe, mas não contou pra mais ninguems
    // public - o que os seus vizinhos sabem 


    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL ++;
    }

    protected int agencia; 
    protected int numero;
    protected double saldo;
    


    @Override
    public void sacar(double valor) {
        saldo -= valor;

        //throw new UnsupportedOperationException("Unimplemented method 'sacar'");
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
        //throw new UnsupportedOperationException("Unimplemented method 'depositar'");
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
       // throw new UnsupportedOperationException("Unimplemented method 'transferir'");
    }
 


    /*Getters - os getters podem ser chamados externamente por serem public.
    isto é feito para proteção das "caracterisctivas da classe, processo conhecido como encapsulamento*/
    
    public int getAgencia () {
        return agencia;
    }
    public int getNumero () {
        return numero;
    }
    public double getSaldo () {
        return saldo;
    }

    protected void imprimirInfosComuns() {
       
        System.out.println(String.format("Agencia:   %d", this.agencia, null));
        System.out.println(String.format("Número:   %d", this.numero, null));
        System.out.println(String.format("Saldo:   % .2f", this.saldo, null));
    
        }
    @Override
    public void imprimirExtrato() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimirExtrato'");
    }

}