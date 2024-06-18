
public class Conta implements IConta {
  //Caracteriscicas - todas private, ou seja só podem ser vista dentro da classe*/

    protected int agencia;
    protected int numero;
    protected double saldo;



    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sacar'");
    }
    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'depositar'");
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transferir'");
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

}