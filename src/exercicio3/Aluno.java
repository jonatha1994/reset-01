package exercicio3;

public class Aluno {
    String nome;
    int nota;
    int notaAprovacao;

    Aluno(String nome, int nota, int notaAprovacao) {
        this.nome = nome;
        this.nota = nota;
        this.notaAprovacao = notaAprovacao;
    }

    boolean meaiorOuIgual(int nota, int notaAprovacao) {
        return nota >= notaAprovacao;
    }

}