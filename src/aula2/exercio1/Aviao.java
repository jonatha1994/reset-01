package aula2.exercio1;

public class Aviao extends Veiculo {
    String combustível;
    double altitudeMaxima;
    int numeroRodas;

    Aviao(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel, double altitudeMaxima, int numeroRodas) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima, numeroRodas);
        this.combustível = combustivel;
        this.altitudeMaxima = altitudeMaxima;
        this.numeroRodas = numeroRodas;
    }
}