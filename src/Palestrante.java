public class Palestrante extends PessoaFisica {
    private String temaPalestra;

    public Palestrante(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    public void ministrarPalestra(Evento e) {
        e.setPalestrante(this);
    }

    public String toString() {
        return super.toString();
    }

}
