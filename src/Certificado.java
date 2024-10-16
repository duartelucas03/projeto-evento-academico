public class Certificado {
    private Participante participante;
    private Evento evento;
    private String dataCertificado;

    public Certificado(Participante participante, Evento evento, String dataCertificado) {
        this.participante = participante;
        this.evento = evento;
        this.dataCertificado = dataCertificado;
    }

    public void gerarCertificado() {
        // Código para gerar o certificado
    }

    public Participante getParticipante() {
        return participante;
    }

    public Evento getEvento() {
        return evento;
    }

    public String getDataCertificado() {
        return dataCertificado;
    }
}
