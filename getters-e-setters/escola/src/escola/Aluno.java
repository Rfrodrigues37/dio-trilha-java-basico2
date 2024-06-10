package escola;

public class Aluno {
    private String nome; //atributos da classe
    private int idade;

    public String getNome(){
        return nome;
    }
    public void setNome(String newNome){
        nome = newNome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int newIdade){
        this.idade = newIdade;
    }   
}
