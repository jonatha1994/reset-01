package atividaderpg;

public class DanosAtaque {
    int poderAtaqueArma;
    int poderAtaque;
    int defesaAlvo;

    DanosAtaque(int poderAtaqueArma, int poderAtaque, int defesaAlvo) {
        this.poderAtaqueArma = poderAtaqueArma;
        this.poderAtaque = poderAtaque;
        this.defesaAlvo = defesaAlvo;
    }
    int Ataque = poderAtaqueArma * poderAtaque - defesaAlvo;
}
