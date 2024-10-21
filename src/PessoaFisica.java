public class PessoaFisica extends Pessoa {
    protected String cpf;

    public PessoaFisica(String nome, String telefone, String cpf) {
        super(nome, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
