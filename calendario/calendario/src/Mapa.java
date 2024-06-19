//Calendario(VS Code) ..
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Mapa {
    
    public static void main(String[] args) {
        
        /*ABAIXO CRIEI OBJETOS QUE SÃO AS INFORMAÇÕES DE QUANTOS DIAS EU TRABALHO E QUANTOS EU FOLGO */
        Turnos N1 = new Turnos(); // N1 = 08 as 16
        N1.dias = 4;
        N1.folga = 1;

        Turnos N2 = new Turnos(); // N1 = 16 as 24
        N2.dias = 4;
        N2.folga = 1;

        Turnos N3 = new Turnos(); // N1 = 00 as 08
        N3.dias = 4;
        N3.folga = 2;
        
             
        /* CHAMO A FUNÇÃO E DEMONSTRO O NUMERO DE DIAS */
        int diferencaDiasInt = caputurarData();

        //TODO Subistituir por raciocinio que calcule qual data é folga ou não.
        
        System.out.println("Diferença em dias: " + diferencaDiasInt);

    }
       /*FUNÇÃO QUE CALCULA O NUMERO DE DIAS ENTRE A DATA INICIAL DO CALENDARIO E O DIA */     
          public static int caputurarData() {
            LocalDate data1 = LocalDate.of(2024, 1, 2);
            Scanner scanner = new Scanner(System.in);
            LocalDate data2 = null;
            boolean entradaValida = false;
            
            while(!entradaValida) {
                 System.out.println("Digite a data desejada para verificar a folga: ");
                 String data2Str = scanner.nextLine();       

                    try {
                        data2 = LocalDate.parse(data2Str, DateTimeFormatter.ISO_DATE);
                        entradaValida = true;
                    } catch (DateTimeParseException e) {

                         System.out.println("Formato de data inválido. Por favoe tente novamente");
                    }
                }
                long diferencaDias = ChronoUnit.DAYS.between(data1, data2);
                int diferencaDiasInt = (int) diferencaDias;
                return (int) diferencaDiasInt;

           }
    

}
