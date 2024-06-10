package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();  
        felipe.setNome("Felipe");
        felipe.setIdade(8);
        felipe.setSexo("homem");
        System.out.println("O Aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " Anos"+ " e é " + felipe.getSexo());

    }
}