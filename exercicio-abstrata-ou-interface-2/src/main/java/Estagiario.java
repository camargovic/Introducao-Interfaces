public class Estagiario extends Funcionario {

    // Atributos
    private int qtdAulas;
    private Double valorHora;

    // Construtor
    public Estagiario(String nome, int qtdAulas, Double valorHora) {
        super(nome);
        this.qtdAulas = qtdAulas;
        this.valorHora = valorHora;
    }

    // toString
    @Override
    public String toString() {
        return "Estagiario{" +
                "qtdAulas=" + qtdAulas +
                ", valorHora=" + valorHora +
                "} " + super.toString();
    }
}
