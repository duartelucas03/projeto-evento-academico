public class Patrocinador extends PessoaJuridica {
    private double valorInvestido;

    public Patrocinador(String nome, String telefone, String cnpj, double valorInvestido) {
        super(nome, telefone, cnpj);
        this.valorInvestido = valorInvestido;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public String toString() {
        return "Patrocinador: " + super.toString() + " - Valor investido: " + valorInvestido;
    }

}
