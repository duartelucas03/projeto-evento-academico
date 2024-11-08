// Classe utilizada para realizar a inscrição dos participantes e patrocinadores no evento.
public abstract class Inscricao {

    // Metodo para adicionar participante no ArrayList do evento.
    public static void inscrever(Evento e, Participante p) {
        e.adicionarParticipante(p);
    }

    // Metodo para remover participante no ArrayList do evento.
    public static void cancelarInscricao(Evento e, Participante p) {
        e.removerParticipante(p);
    }

    // Metodo para adicionar patrocinador no ArrayList do evento.
    public static void patrocinar(Evento e, Patrocinador pt){
        e.adicionarPatrocinador(pt);
    }
}
