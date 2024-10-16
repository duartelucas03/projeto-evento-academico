public class Participante extends PessoaFisica {
    private String curso;

    public Participante(String nome, String telefone, String cpf, String curso) {
        super(nome, telefone, cpf);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void inscrever(Evento e) {
        e.adicionarParticipante(this);
    }

    public void cancelarInscricao(Evento e) {
        e.removerParticipante(this);
    }

    public String toString() {
        return super.toString();
    }
}

