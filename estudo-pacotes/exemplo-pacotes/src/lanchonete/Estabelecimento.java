package lanchonete;

public class Estabelecimento {

    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //açoes que não precisam estarem disponiveis pata toda aplicação
        cozinheiro.lavarIngrtedientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngrediantesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.prepararVitamina();

        //ações que o estabeleescimento precisa ter ciencia
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estarem disponiveis para toda a aplicação
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        //ação que somente o seu pacote cozinha precisa conhecer (default)
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        //açao que somente o seu pacote cozinha precisa conhecer (default)
        atendente.trocarGas();

        Cliente cliente = new Cliente ();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //não deveria, mas o estabelescimento
        //ainda não definiu normas de atendimento
        cliente.pegarPedidoBalcao();

        //esta ação é muito sigilosa, que tal ser privada
        cliente.consultarSaldoAplicativo();

        //ja pensou o sclientes ouvindo que o gás acabou
        cozinheiro.pedirParaTrocarGas(atendente);
        cozinheiro.pedirParaTrocarGas(almoxarife);
    }
    
}
