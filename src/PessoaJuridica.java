public abstract class PessoaJuridica extends Pessoa {
    protected String cnpj;

    // Criação do construtor
    public PessoaJuridica(String nome, String telefone, String cnpj) {
        super(nome, telefone);
        this.cnpj = cnpj;
    }
}
