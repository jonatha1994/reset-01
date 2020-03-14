package aula2.exercio1;

public class App {
    public static void main(String[] args) {
        Aviao jatinho = new Aviao("Avião", 900, "Ar", 300, "Diesel", 1000, 6);
        System.out.println("Veículo: " + jatinho.nome + "\nVelocidade máxima: " + jatinho.velocidadeMaxima + " km/h" + "\nTerreno: " + jatinho.terreno + "\nLotação máxima: " + jatinho.lotacaoMaxima + " pessoas" + "\nCombustível: " + jatinho.combustível + "\nAltitude máxima: " + jatinho.altitudeMaxima + " pés" + "\nNúmero de rodas: " + jatinho.numeroRodas);
        System.out.println(" ");

        Bicicleta bike = new Bicicleta("Bicicleta", 30, "Terra", 2, 2);
        System.out.println("Veículo: " + bike.nome + "\nVelocidade máxima: " + bike.velocidadeMaxima + " km/h" + "\nTerreno: " + bike.terreno + "\nLotação máxima: " + bike.lotacaoMaxima + " pessoas" + "\nNúmero de rodas: " + bike.numeroRodas);
        System.out.println(" ");

        Carro caranga = new Carro("Carro", 250, "Terra", 5, "Gasolina", 5);
        System.out.println("Veículo: " + caranga.nome + "\nVelocidade máxima: " + caranga.velocidadeMaxima + " km/h" + "\nTerreno: " + caranga.terreno + "\nLotação máxima: " + caranga.lotacaoMaxima + " pessoas" + "\nCombustível: " + caranga.combustível + "\nNúmero de rodas: " + caranga.numeroRodas);
        System.out.println(" ");

        Caminhao caminhao = new Caminhao("Caminhão", 250, "Terra", 5, "Gasolina", 12);
        System.out.println("Veículo: " + caminhao.nome + "\nVelocidade máxima: " + caminhao.velocidadeMaxima + " km/h" + "\nTerreno: " + caminhao.terreno + "\nLotação máxima: " + caminhao.lotacaoMaxima + " pessoas" + "\nCombustível: " + caminhao.combustível + "\nNúmero de rodas: " + caminhao.numeroRodas);
        System.out.println(" ");

        System.out.println(caminhao);
    }


}
