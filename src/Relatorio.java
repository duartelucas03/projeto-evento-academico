public abstract class Relatorio {

    // Metodo para gerar o relatório em .txt
    public static void gerarRelatorio(Evento e) {
            String dadosRelatorio = e.dadosRelatorio();
            String nomeRelatorio = "relatorio" + e.getNome() + ".txt";
            ManipulaArquivos.escritaRelatorio(dadosRelatorio, nomeRelatorio);
    }

}
