package escola;
//Getters e Setters (VS Code)
public class Aluno {
    private String nome; //atributos da classe
    private int idade;
    private String sexo;

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

    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
}   



