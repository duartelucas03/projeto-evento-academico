public class Patrocinador extends PessoaJuridica {
    private double valorInvestido;

    public Patrocinador(String nome, String telefone, String cnpj, double valorInvestido) {
        super(nome, telefone, cnpj);
        this.valorInvestido = valorInvestido;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void apoiarEvento(Evento e) {
        // Código para apoiar o evento
    }
}
