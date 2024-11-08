public abstract class Pessoa {
    protected String nome;
    protected String telefone;

    // Criação do construtor
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return nome;
    }
}