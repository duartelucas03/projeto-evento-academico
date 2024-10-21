public class PessoaJuridica extends Pessoa {
    protected String cnpj;

    public PessoaJuridica(String nome, String telefone, String cnpj) {
        super(nome, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
