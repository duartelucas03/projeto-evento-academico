import java.util.List;

public class Relatorio {
    private Evento evento;
    private List<String> dadosRelatorio;


    public static void gerarRelatorio(Evento e) {
            e.dadosRelatorio();
    }

    public Evento getEvento() {
        return evento;
    }

}
