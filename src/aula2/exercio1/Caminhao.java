package aula2.exercio1;

public class Caminhao extends Veiculo {
    String combustível;
    int numeroRodas;

    Caminhao(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel, int numeroRodas) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima, numeroRodas);
        this.combustível = combustivel;
        this.numeroRodas = numeroRodas;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "combustível='" + combustível + '\'' +
                ", numeroRodas=" + numeroRodas +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", terreno='" + terreno + '\'' +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}

