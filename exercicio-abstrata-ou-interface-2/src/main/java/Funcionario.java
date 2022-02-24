public abstract class Funcionario {

    // Atributos
    private String nome;

    // Construtor
    public Funcionario(String nome) {
        this.nome = nome;
    }

    // toString
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                '}';
    }

    // Getter's and Setter's
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
