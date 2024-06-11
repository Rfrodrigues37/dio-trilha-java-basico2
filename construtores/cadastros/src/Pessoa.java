public class Pessoa {
    
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }


    public String getNome () {
        return nome;
    }

    public String getCpf () {
        return cpf;
    }

    public void setEndereco (String newEndereco) {
        this.endereco = newEndereco;

    }
}
