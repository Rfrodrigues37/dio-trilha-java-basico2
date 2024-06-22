import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
            curso1.setTitulo("java");
            curso1.setDescricao("curso de java");
            curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
            curso2.setTitulo("java script");
            curso2.setDescricao("curso de javascript");
            curso2.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();
            mentoria1.setTitulo("Mentoria um");
            mentoria1.setDescricao("Mentoria do curso de numero um");
            mentoria1.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}