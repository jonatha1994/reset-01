package aula2.exercio1;

public class Carro extends Veiculo {
    String combustível;
    int numeroRodas;

    Carro(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel, int numeroRodas) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima, numeroRodas);
        this.combustível = combustivel;
        this.numeroRodas = numeroRodas;
    }
}
