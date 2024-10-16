import java.util.List;

public class Relatorio {
    private Evento evento;
    private List<String> dadosRelatorio;

    public Relatorio(Evento evento, List<String> dadosRelatorio) {
        this.evento = evento;
        this.dadosRelatorio = dadosRelatorio;
    }

    public void gerarRelatorio() {
        // Código para gerar o relatório
    }

    public List<String> getDadosRelatorio() {
        return dadosRelatorio;
    }

    public Evento getEvento() {
        return evento;
    }
}
