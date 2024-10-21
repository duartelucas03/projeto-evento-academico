// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EventoMain {
    public static void main(String[] args) {

        Organizador organizador1 = new Organizador("Ana Silva", "9876543210", "12345678901");
        Evento novoEvento = new Evento("Trabalho POO", "10/02/204", "Uberlandia", "Evento sobre xxx", 300, organizador1 );

        Participante p1 = new Participante("Pedro", "34993245995", "040483535359", "GI");
        Participante p2 = new Participante("Jorge", "34993243995", "0404835345359", "GI");
        Palestrante pa1 = new Palestrante("Artur Talini", "3249249", "a4833592");
        Patrocinador pt1 = new Patrocinador("Soares eventos", "3495868208", "20392058058", 34000.50);
        Patrocinador pt2 = new Patrocinador("Soares producoes", "349563608", "20392063658", 34050.50);

        Inscricao.inscrever(novoEvento, p1);
        Inscricao.inscrever(novoEvento, p2);
        novoEvento.mostarParticipantes();
        novoEvento.setPalestrante(pa1);
        Inscricao.patrocinar(novoEvento, pt1);
        Inscricao.patrocinar(novoEvento, pt2);
        Relatorio.gerarRelatorio(novoEvento);
        Inscricao.cancelarInscricao(novoEvento, p2);
        novoEvento.mostarParticipantes();
        Relatorio.gerarRelatorio(novoEvento);
    }

}