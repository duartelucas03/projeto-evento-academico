// Artur Batalini, Lucas Soares e Luiz Alexandre Freitas
public class EventoMain {
    public static void main(String[] args) {

        // Organizadores
        Organizador org1 = new Organizador("Lucas Soares", "(34) 99988-7766", "321.654.987-01");
        Organizador org2 = new Organizador("Luiz Alexandre Freitas", "(31) 98456-7890", "654.321.987-02");
        Organizador org3 = new Organizador("Artur Batalini", "(11) 99123-4567", "987.654.321-03");

        // Eventos
        Evento evento1 = new Evento("Conferência de Inovação", "12/03/2024", "São Paulo", "Evento focado em tendências e inovação tecnológica", 10, org1);
        Evento evento2 = new Evento("Encontro de Engenharia", "25/06/2024", "Belo Horizonte", "Seminário sobre o futuro da engenharia civil", 15, org2);
        Evento evento3 = new Evento("Congresso de Sustentabilidade", "15/09/2024", "Rio de Janeiro", "Discussão sobre práticas sustentáveis em diversos setores", 8, org3);

        // Participantes
        Participante p1 = new Participante("João Santos", "(21) 98765-4321", "123.456.789-01", "Engenharia Civil");
        Participante p2 = new Participante("Marina Costa", "(31) 98234-5678", "987.654.321-02", "Ciências da Computação");
        Participante p3 = new Participante("Thiago Lopes", "(11) 99234-5678", "456.789.123-03", "Arquitetura");
        Participante p4 = new Participante("Lucas Almeida", "(11) 99765-4321", "321.654.987-12", "Administração");
        Participante p5 = new Participante("Carla Rodrigues", "(21) 98877-6655", "123.987.654-98", "Marketing");
        Participante p6 = new Participante("Rafael Souza", "(31) 99988-5544", "987.654.321-11", "Engenharia de Software");
        Participante p7 = new Participante("Camila Torres", "(71) 99345-6677", "456.123.789-33", "Medicina");
        Participante p8 = new Participante("Juliana Lima", "(41) 98765-4433", "789.456.123-44", "Psicologia");
        Participante p9 = new Participante("Felipe Costa", "(61) 99678-3322", "234.567.890-22", "Economia");
        Participante p10 = new Participante("André Oliveira", "(51) 99889-2211", "987.321.654-56", "Direito");
        Participante p11 = new Participante("Patrícia Melo", "(81) 99234-5566", "654.987.321-77", "Biomedicina");
        Participante p12 = new Participante("Fernando Santos", "(19) 99112-3344", "123.789.456-99", "Engenharia Mecânica");
        Participante p13 = new Participante("Larissa Moreira", "(85) 99777-8899", "321.123.654-88", "Design");
        Participante p14 = new Participante("Roberto Farias", "(13) 99556-7788", "789.654.321-09", "Jornalismo");
        Participante p15 = new Participante("Renata Azevedo", "(27) 99888-9900", "456.789.123-65", "Nutrição");
        Participante p16 = new Participante("Eduardo Ramos", "(32) 99667-4455", "321.987.654-34", "Arquitetura");
        Participante p17 = new Participante("Bianca Fonseca", "(44) 99321-1122", "654.321.987-87", "Farmácia");
        Participante p18 = new Participante("Thiago Barros", "(45) 99766-5544", "789.123.456-78", "Ciências Contábeis");
        Participante p19 = new Participante("Gabriela Martins", "(62) 99234-7788", "123.456.789-45", "Relações Internacionais");
        Participante p20 = new Participante("Vinícius Duarte", "(34) 99443-2211", "987.123.654-12", "Engenharia Elétrica");
        Participante p21 = new Participante("Beatriz Silva", "(47) 99555-6677", "456.654.321-98", "Fisioterapia");
        Participante p22 = new Participante("Marcelo Fernandes", "(92) 99666-3322", "654.789.123-21", "Engenharia de Produção");
        Participante p23 = new Participante("Fernanda Vasconcelos", "(48) 99887-7766", "789.987.654-67", "Química");

        // Palestrantes
        Palestrante pa1 = new Palestrante("Bruno Castro", "(11) 99876-5432", "123.654.789-10");
        Palestrante pa2 = new Palestrante("Sofia Mendes", "(21) 99234-5678", "987.321.654-32");
        Palestrante pa3 = new Palestrante("Rodrigo Ferreira", "(31) 99345-6789", "456.987.123-45");


        // Patrocinadores
        Patrocinador pat1 = new Patrocinador("EcoSolutions", "(11) 95321-8765", "12.345.678/0001-90", 25000.00);
        Patrocinador pat2 = new Patrocinador("GreenTech", "(31) 99456-7890", "98.765.432/0001-09", 40000.00);
        Patrocinador pat3 = new Patrocinador("SustentaMais", "(21) 98234-5678", "11.222.333/0001-45", 15000.00);


        // Inscrições dos participantes nos eventos
        Inscricao.inscrever(evento1, p1);
        Inscricao.inscrever(evento3, p2);
        Inscricao.inscrever(evento2, p3);
        Inscricao.inscrever(evento1, p4);
        Inscricao.inscrever(evento3, p5);
        Inscricao.inscrever(evento1, p6);
        Inscricao.inscrever(evento2, p7);
        Inscricao.inscrever(evento3, p8);
        Inscricao.inscrever(evento2, p9);
        Inscricao.inscrever(evento1, p10);
        Inscricao.inscrever(evento3, p11);
        Inscricao.inscrever(evento1, p12);
        Inscricao.inscrever(evento3, p13);
        Inscricao.inscrever(evento1, p14);
        Inscricao.inscrever(evento3, p15);
        Inscricao.inscrever(evento3, p16);
        Inscricao.inscrever(evento1, p17);
        Inscricao.inscrever(evento3, p18);
        Inscricao.inscrever(evento3, p19);
        Inscricao.inscrever(evento3, p20);
        Inscricao.inscrever(evento3, p21);
        Inscricao.inscrever(evento3, p22);
        Inscricao.inscrever(evento3, p23);

        // Cancelamento de inscrição de alguns participantes
        Inscricao.cancelarInscricao(evento1, p5);
        Inscricao.cancelarInscricao(evento1, p10);
        Inscricao.cancelarInscricao(evento2, p18);
        Inscricao.cancelarInscricao(evento3, p14);

        // Patrocinadores patrocinando os eventos
        Inscricao.patrocinar(evento1, pat1);
        Inscricao.patrocinar(evento1, pat3);
        Inscricao.patrocinar(evento2, pat3);
        Inscricao.patrocinar(evento2, pat1);
        Inscricao.patrocinar(evento3, pat2);
        Inscricao.patrocinar(evento3, pat3);

        // Adicionando os palestrantes ao evento
        pa1.ministrarPalestra(evento1);
        pa2.ministrarPalestra(evento2);
        pa3.ministrarPalestra(evento3);

        // Gerando certificados dos participantes
        evento1.gerarCertificadosGeral();
        evento2.gerarCertificadosGeral();
        evento3.gerarCertificadosGeral();

        // Relatórios criados para os eventos
        Relatorio.gerarRelatorio(evento1);
        Relatorio.gerarRelatorio(evento2);
        Relatorio.gerarRelatorio(evento3);



    }

}