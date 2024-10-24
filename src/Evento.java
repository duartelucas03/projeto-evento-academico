import java.util.ArrayList;
import java.util.List;

// Classe para criação do evento
public class Evento {
    private String nome;
    private String data;
    private String local;
    private String descricao;
    private int capacidade;
    private List<Participante> participantes = new ArrayList<>();
    private List<Patrocinador> patrocinadores = new ArrayList<>();
    private Palestrante palestrante;
    private Organizador organizador;

    // Criação do construtor
    public Evento(String nome, String data, String local, String descricao, int capacidade, Organizador organizador) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.descricao = descricao;
        this.capacidade = capacidade;
        this.organizador = organizador;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    // Metodo para definir o palestrante
    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }

    // Metodo para adicionar participante no ArrayList do evento.
    public void adicionarParticipante(Participante p) {
        if (calculaParticipantes()<this.capacidade) {
            participantes.add(p);
            System.out.println("Inscrição confirmada para o participante: " + p);
        }else {
            System.out.println("Capacidade máxima atingida!");
        }
    }

    // Metodo para remover participante no ArrayList do evento.
    public void removerParticipante(Participante p) {
        participantes.remove(p);
        System.out.println("Inscrição cancelada para o participante: " + p);
    }

    // Metodo para adicionar patrocinador no ArrayList do evento.
    public void adicionarPatrocinador(Patrocinador pt) {
        patrocinadores.add(pt);
    }

    // Metodo para calcular o numero de participantes
    public int calculaParticipantes(){
        return participantes.toArray().length;
    }

    // Metodo para armazenar os dados do relatório
    public String dadosRelatorio(){
        String dados = "===================RELÁTORIO===================\n\n\nNome do evento: " + getNome() + "\n\nDescrição: "
        + getDescricao() + "\n\nPalestrante: " + getPalestrante() + "\n\nData: " + getData() + "\n\nLocal: " + getLocal()
        + "\n\nOrganizador: " + getOrganizador() + "\n\nCapacidade máxima de inscritos: " + getCapacidade()
        + "\n\nNúmero de participantes: " + calculaParticipantes() + "\n\nLista de Participantes:\n";
        for (int i=0; i<calculaParticipantes(); i++) {
            String a = String.valueOf(participantes.get(i));
            dados = dados.concat((i+1) + " - " + a + "\n");
        }
        dados = dados.concat("\n\nLista de Patrocinadores:\n");
        for (int i=0; i<patrocinadores.toArray().length; i++) {
            String a = String.valueOf(patrocinadores.get(i));
            dados = dados.concat((i+1) + " - " + a + "\n");
        }
        return dados;
    }

    // Metodo para gerar o certificado
    public void gerarCertificadosGeral(){
        for (int i=0; i<participantes.toArray().length; i++){
            Certificado.gerarCertificado(participantes.get(i), this.nome, this.data, this.local);
        }
    }

}
