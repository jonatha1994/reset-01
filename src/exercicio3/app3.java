package exercicio3;

public class app3 {
    public static void main(String[] args) {
        Aluno notaFinal = new Aluno("João",9, 7);
        boolean resultado = notaFinal.meaiorOuIgual (9, 7);
        System.out.println("Aluno: " + notaFinal.nome);
        System.out.println("Nota: " + notaFinal.nota);

        if(resultado == true) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        Aluno notaFinal2 = new Aluno("Maria",5, 7);
        boolean resultado2 = notaFinal2.meaiorOuIgual (5, 7);
        System.out.println("Aluno: " + notaFinal2.nome);
        System.out.println("Nota: " + notaFinal2.nota);

        if(resultado2 == true) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        Aluno notaFinal3 = new Aluno("Laura",10, 7);
        boolean resultado3 = notaFinal3.meaiorOuIgual (10, 7);
        System.out.println("Aluno: " + notaFinal3.nome);
        System.out.println("Nota: " + notaFinal3.nota);

        if(resultado3 == true) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
