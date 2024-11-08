public interface Relatorio extends ManipulaArquivos {

    // Metodo para gerar o relatório em .txt
    static void gerarRelatorio(Evento e) {
            String dadosRelatorio = e.dadosRelatorio();
            String nomeRelatorio = "relatorio" + e.getNome() + ".txt";
            ManipulaArquivos.escritaRelatorio(dadosRelatorio, nomeRelatorio);
    }
}