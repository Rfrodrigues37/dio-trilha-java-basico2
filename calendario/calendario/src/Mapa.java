import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Mapa {
    
    public static void main(String[] args) {
        //Rotina que cria os turnos dados do turno inserindo os dias trabalhados e folga
        Turnos N1 = new Turnos(); // N1 = 08 as 16
        N1.dias = 4;
        N1.folga = 1;

        Turnos N2 = new Turnos(); // N1 = 16 as 24
        N2.dias = 4;
        N2.folga = 1;

        Turnos N3 = new Turnos(); // N1 = 00 as 08
        N3.dias = 4;
        N3.folga = 2;
        
             

        int diferencaDiasInt = caputurarData();
        System.out.println("Diferença em dias: " + diferencaDiasInt);

    }
            
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
