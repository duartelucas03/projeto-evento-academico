import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EventoMain {
    public static void main(String[] args) {

        Organizador organizador1 = new Organizador("Ana Silva", "9876543210", "12345678901");
        Evento novoEvento = new Evento("Trabalho POO", "10/02/204", "Uberlandia", "PIOR MATERIA", 300, organizador1 );

        Participante p1 = new Participante("Pedro", "34993245995", "040483535359", "GI");
        Participante p2 = new Participante("Jorge", "34993243995", "0404835345359", "GI");
        Palestrante pa1 = new Palestrante("Artur Talini", "3249249", "a4833592");


        p1.inscrever(novoEvento);
        p2.inscrever(novoEvento);
        novoEvento.mostarParticipantes();
        novoEvento.setPalestrante(pa1);
        novoEvento.mostrar();
    }
}