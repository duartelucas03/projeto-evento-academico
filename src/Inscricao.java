public class Inscricao {
    private Participante participante;
    private Evento evento;
    private String dataInscricao;
    private String status;

    public Inscricao(Participante participante, Evento evento, String dataInscricao, String status) {
        this.participante = participante;
        this.evento = evento;
        this.dataInscricao = dataInscricao;
        this.status = status;
    }


    public void confirmarInscricao() {
        this.status = "Confirmada";
    }

    public void cancelarInscricao() {
        this.status = "Cancelada";
    }

    public Participante getParticipante() {
        return participante;
    }

    public Evento getEvento() {
        return evento;
    }

    public String getDataInscricao() {
        return dataInscricao;
    }

    public String getStatus() {
        return status;
    }
}
