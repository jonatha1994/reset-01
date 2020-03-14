package aula2.exercio1;

public class Bicicleta extends Veiculo {
    int numeroRodas;

    Bicicleta(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, int numeroRodas) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima, numeroRodas);
        this.numeroRodas = numeroRodas;
    }
}
