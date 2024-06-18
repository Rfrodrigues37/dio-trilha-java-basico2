/* Interface - nterface especifica o que uma classe deve fazer, mas não como ela deve fazer */
public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);  

    void imprimirExtrato ();
    
}
