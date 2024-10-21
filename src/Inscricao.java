public class Inscricao {
    private Participante participante;
    private Evento evento;
    private String dataInscricao;
    private Patrocinador patrocinador;


    public Participante getParticipante() {
        return participante;
    }

    public Evento getEvento() {
        return evento;
    }

    public String getDataInscricao() {
        return dataInscricao;
    }

    public static void inscrever(Evento e, Participante p) {
        e.adicionarParticipante(p);
        System.out.println("Inscrição confirmada para o participante: " + p);
    }

    public static void cancelarInscricao(Evento e, Participante p) {
        e.removerParticipante(p);
        System.out.println("Inscrição cancelada para o participante: " + p);
    }

    public static void patrocinar(Evento e, Patrocinador pt){
        e.adicionarPatrocinador(pt);
    }
}
