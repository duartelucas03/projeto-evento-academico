public class Palestrante extends PessoaFisica {

    // Criação do construtor
    public Palestrante(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    // Metodo para definir o palestrante
    public void ministrarPalestra(Evento e) {
        e.setPalestrante(this);
    }

    public String toString() {
        return super.toString();
    }
}