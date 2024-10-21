import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome, data, local, descricao;
    private int capacidade;
    private List<Participante> participantes = new ArrayList<>();
    private List<Patrocinador> patrocinadores = new ArrayList<>();
    private Palestrante palestrante;
    private Organizador organizador;

    public Evento(String nome, String data, String local, String descricao, int capacidade, Organizador organizador) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.descricao = descricao;
        this.capacidade = capacidade;
        this.organizador = organizador;
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

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }


    public void adicionarParticipante(Participante p) {
        participantes.add(p);
    }

    public void removerParticipante(Participante p) {
        participantes.remove(p);
    }

    public void adicionarPatrocinador(Patrocinador pt) {
        patrocinadores.add(pt);
    }

    public List<Participante> listarParticipantes() {
        return participantes;
    }

    public List<Patrocinador> listarPatrocinadores() {
        return patrocinadores;
    }


    public int calculaParticipantes(){
        return participantes.toArray().length;
    }

    public void mostarParticipantes(){
        System.out.println("Participantes: " + participantes);
    }

    public void dadosRelatorio(){
        System.out.println("Nome do evento: " + this.nome);
        System.out.println("Palestrante: " + this.palestrante);
        System.out.println("Data: " + this.data);
        System.out.println("Local: " + this.local);
        System.out.println("Número de participantes: " + calculaParticipantes());
        System.out.println("Organizador: " + this.organizador);
        System.out.println(patrocinadores);
    }

}
