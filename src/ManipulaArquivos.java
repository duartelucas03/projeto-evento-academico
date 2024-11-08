import java.io.*;

public interface ManipulaArquivos {

        // Metodo para escrever o certificado dentro do arquivo txt
        static void escritaCertificado(String dadosCertificado, String nomeArq) {
            try {
                FileWriter arq = new FileWriter(nomeArq);
                PrintWriter out = new PrintWriter(arq);
                out.println(dadosCertificado);
                arq.close();

            } catch (IOException erro) {
                System.out.println("Erro na geração do certificado.");
            }
        }

        // Metodo para escrever o relatorio dentro do arquivo txt
        static void escritaRelatorio(String dadosRelatorio, String nomeArq) {
            try {
                FileWriter arq = new FileWriter(nomeArq);
                PrintWriter out = new PrintWriter(arq);
                out.println(dadosRelatorio);
                arq.close();

            } catch (IOException erro) {
                System.out.println("Erro na geração do relatório.");
            }
        }
    }