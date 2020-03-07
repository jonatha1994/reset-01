public class App {
    public static void main(String[] args) {
        Calculadora calculadoraDeIdades = new Calculadora ();
        int somaDasIdades = calculadoraDeIdades.somar(33,54);
        System.out.println(somaDasIdades);

        int subtracaoDasIdades = calculadoraDeIdades.subtrai(33, 54);
        System.out.println(subtracaoDasIdades);

        int multiplicacaoDasIdades = calculadoraDeIdades.multiplica(33, 54);
        System.out.println(multiplicacaoDasIdades);

        double divisaoDasIdades = calculadoraDeIdades.divide(33, 54);
        System.out.println(divisaoDasIdades);

        Comparador dadosComparacao = new Comparador ();
        boolean resultado = dadosComparacao.menorQue (33, 54);
        System.out.println(resultado);
    }
}
