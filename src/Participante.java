public class Participante extends PessoaFisica {
    private String curso;

    public Participante(String nome, String telefone, String cpf, String curso) {
        super(nome, telefone, cpf);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }



    public String toString() {
        return super.toString();
    }
}

