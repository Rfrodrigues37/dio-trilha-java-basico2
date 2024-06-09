package lanchonete;

public class Cozinheiro {
 
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATUAL HAMBURGER NO BALCÃO.");
        }
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCÃO.");
        }
    public void adicionarComboNoBalcao(){
        adicionarSucoNoBalcao();
        adicionarLancheNoBalcao();
        }
    public void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGER");
        }
    public void prepararVitamina() {
        System.out.println("PREPARANDO SUCO");      
        }
    public void prepararCombo(){
        prepararLanche();
        prepararVitamina();
        }
    public void selecionarIngrediantesLanche() {
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
        }
    public void selecionarIngrediantesVitamina() {
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
        }
    public void lavarIngrtedientes() {
        System.out.println("LAVANDO INGREDIENTES");
        }
    public void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
        }
    public void fritarIngredientesLancha() {
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGER");
        }
    public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();        
        }
    public void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
        }   
    public void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
        }
}
