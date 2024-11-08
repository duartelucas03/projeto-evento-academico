public interface Certificado extends ManipulaArquivos {

    // Metodo para gerar o certificado em arquivo de texto
    static void gerarCertificado(Participante p, String NomeEvento, String data, String local) {
        String mensagemCertificado = "Atestamos que " + p.getNome() + ", portador(a) do CPF de número: " + p.getCpf() + ", participou do evento: "
                + NomeEvento + " no dia "  + data + " na cidade de " + local + ".";
        String nomeCertificado = "Certificado" + p.getNome() + ".txt";
        ManipulaArquivos.escritaCertificado(mensagemCertificado, nomeCertificado);
    }
}