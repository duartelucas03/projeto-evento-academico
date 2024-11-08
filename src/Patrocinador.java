public class Patrocinador extends PessoaJuridica {
    private double valorInvestido;

    // Criação do construtor
    public Patrocinador(String nome, String telefone, String cnpj, double valorInvestido) {
        super(nome, telefone, cnpj);
        this.valorInvestido = valorInvestido;
    }

    public String toString() {
        return super.toString() + " - Valor investido: " + valorInvestido;
    }
}