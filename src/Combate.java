package atividaderpg;

import exercicio3.Aluno;

public class Combate {
    public static void main(String[] args) {

        //Personagens
        Guerreiro ciro = new Guerreiro("Cirus de Harvard", 500, 150, 150);
        Barbaro boulos = new Barbaro("Boulozonski", 500, 200, 100);
        Mago bozo = new Mago("Bozonarus Taokey", 500, 200, 150, 5);
        Feiticeiro carluxo = new Feiticeiro("Carluxo, filho de Bozo", 500, 100, 50, 5);
        Druida malafa = new Druida("Malafezes", 500, 100, 100, 5);
        Clerigo daciolo = new Clerigo("Padre Daciolus", 500, 100, 150, 5);

        //Itens de ataque
        Armas armaGuerreiro = new Armas("Espada da Astrofísica", 2);
        Armas armaBarbaro = new Armas("Machado Invasor de Terras", 3);
        Magias magiaMago = new Magias("Fraquejada", 3, 3);
        Magias magiaFeiticeiro = new Magias("Mamadeira de Pi****", 3, 3);
        PoderDivino poderClerigo = new PoderDivino("Glória a Deuxxxx", 2, 2);
        PoderDivino poderDruida = new PoderDivino("Cobrança de Dízimo", 1, 1);

        //Texto intro
        System.out.println("INTRODUÇÃO");
        System.out.println("Em busca do poder de Braziliópolis, surgem de todos os lados candidatos a ocupar o trono que pertencia a Michelangelus Temerarus");
        System.out.println("Uma guerra que mistura os defensores do povo contra os impostores de Deus. Que comece a batalha!!!");
        System.out.println(" ");

        //Dados personagens
        System.out.println("OS CANDIDATOS E SEUS ATRIBUTOS");
        System.out.println("- " + ciro.nome + ", o Guerreiro");
        System.out.println("  " + "Vida: " + ciro.vida);
        System.out.println("  " + "Ataque: " + ciro.ataque);
        System.out.println("  " + "Defesa: " + ciro.defesa);
        System.out.println(" ");

        System.out.println("- " + boulos.nome + ", o Bárbaro");
        System.out.println("  " + "Vida: " + boulos.vida);
        System.out.println("  " + "Ataque: " + boulos.ataque);
        System.out.println("  " + "Defesa: " + boulos.defesa);
        System.out.println(" ");

        System.out.println("- " + bozo.nome + ", o Mago");
        System.out.println("  " + "Vida: " + bozo.vida);
        System.out.println("  " + "Ataque: " + bozo.ataque);
        System.out.println("  " + "Defesa: " + bozo.defesa);
        System.out.println("  " + "Mana: " + bozo.mana);
        System.out.println(" ");

        System.out.println("- " + carluxo.nome + ", o Feiticeiro");
        System.out.println("  " + "Vida: " + carluxo.vida);
        System.out.println("  " + "Ataque: " + carluxo.ataque);
        System.out.println("  " + "Defesa: " + carluxo.defesa);
        System.out.println("  " + "Mana: " + carluxo.mana);
        System.out.println(" ");

        System.out.println("- " + malafa.nome + ", o Druida");
        System.out.println("  " + "Vida: " + malafa.vida);
        System.out.println("  " + "Ataque: " + malafa.ataque);
        System.out.println("  " + "Defesa: " + malafa.defesa);
        System.out.println("  " + "Fé: " + malafa.fe);
        System.out.println(" ");

        System.out.println("- " + daciolo.nome + ", o Clérigo");
        System.out.println("  " + "Vida: " + daciolo.vida);
        System.out.println("  " + "Ataque: " + daciolo.ataque);
        System.out.println("  " + "Defesa: " + daciolo.defesa);
        System.out.println("  " + "Fé: " + daciolo.fe);

        //Texto narração
        System.out.println(" ");
        System.out.println("E assim aconteceu a primeira leva de ataques...");
        System.out.println(" ");

        //Etapa 1 - Ataques

        int ataqueGuerreiroFeiticeiro = armaGuerreiro.poderAtaqueArma * ciro.ataque - carluxo.defesa;
        if(ataqueGuerreiroFeiticeiro >= carluxo.vida) {
            System.out.println(ciro.nome + " atacou " + carluxo.nome + " com " + armaGuerreiro.nome + " causando " + ataqueGuerreiroFeiticeiro + " de danos. " + carluxo.nome + " está morto");
        } else if (ciro.vida > 0) {
            System.out.println(ciro.nome + " atacou " + carluxo.nome + " com " + armaGuerreiro.nome + " causando " + ataqueGuerreiroFeiticeiro + " de danos");
        } else if (ciro.vida < 0) {
            System.out.println(ciro.nome + " está morto e não pode atacar ");
        }

        int ataqueBarbaroDruida = armaBarbaro.poderAtaqueArma * boulos.ataque - malafa.defesa;
        if(ataqueBarbaroDruida >= malafa.vida) {
            System.out.println(boulos.nome + " atacou " + malafa.nome + " com " + armaBarbaro.nome + " causando " + ataqueBarbaroDruida + " de danos. " + malafa.nome + " está morto");
        } else if (boulos.vida > 0) {
            System.out.println(boulos.nome + " atacou " + malafa.nome + " com " + armaBarbaro.nome + " causando " + ataqueBarbaroDruida + " de danos");
        } else if (boulos.vida < 0) {
            System.out.println(boulos.nome + " está morto e não pode atacar ");
        }

        int manaFinalMago = bozo.mana - magiaMago.custoMana;
        int ataqueMagoGuerreiro = magiaMago.poder * bozo.ataque - ciro.defesa;
        if(ataqueMagoGuerreiro >= ciro.vida) {
            System.out.println(bozo.nome + " atacou " + ciro.nome + " com " + magiaMago.nome + " causando " + ataqueMagoGuerreiro + " de danos. " + ciro.nome + " está morto");
        } else if (bozo.mana < magiaMago.custoMana) {
            System.out.println(bozo.nome + " não possui mana suficiente para atacar");
        } else if (bozo.vida > 0) {
            System.out.println(bozo.nome + " atacou " + ciro.nome + " com " + magiaMago.nome + " causando " + ataqueMagoGuerreiro + " de danos");
        } else if (bozo.vida < 0) {
            System.out.println(bozo.nome + " está morto e não pode atacar ");
        }

        int manaFinalFeiticeiro = carluxo.mana - magiaFeiticeiro.custoMana;
        int ataqueFeiticeiroClerigo = magiaFeiticeiro.poder * carluxo.ataque - daciolo.defesa;
        if(ataqueFeiticeiroClerigo >= daciolo.vida) {
            System.out.println(carluxo.nome + " atacou " + daciolo.nome + " com " + magiaFeiticeiro.nome + " causando " + ataqueFeiticeiroClerigo + " de danos. " + daciolo.nome + " está morto");
        } else if (carluxo.mana < magiaFeiticeiro.custoMana) {
            System.out.println(carluxo.nome + " não possui mana suficiente para atacar");
        } else if (carluxo.vida > 0) {
            System.out.println(carluxo.nome + " atacou " + daciolo.nome + " com " + magiaFeiticeiro.nome + " causando " + ataqueFeiticeiroClerigo + " de danos");
        } else if (carluxo.vida < 0) {
            System.out.println(carluxo.nome + " está morto e não pode atacar ");
        }

        int feFinalDruida = malafa.fe - poderDruida.custoFe;
        int ataqueDruidaBarbaro = poderDruida.poder * malafa.ataque - boulos.defesa;
        if(ataqueDruidaBarbaro >= boulos.vida) {
            System.out.println(malafa.nome + " atacou " + boulos.nome + " com " + poderDruida.nome + " causando " + ataqueDruidaBarbaro + " de danos. " + boulos.nome + " está morto");
        } else if (malafa.fe < poderDruida.custoFe) {
            System.out.println(malafa.nome + " não possui fé suficiente para atacar");
        } else if (malafa.vida > 0) {
            System.out.println(malafa.nome + " atacou " + boulos.nome + " com " + poderDruida.nome + " causando " + ataqueDruidaBarbaro + " de danos");
        } else if (malafa.vida < 0) {
            System.out.println(malafa.nome + " está morto e não pode atacar ");
        }

        int feFinalClerigo = daciolo.fe - poderClerigo.custoFe;
        int ataqueClerigoMago = poderClerigo.poder * daciolo.ataque - bozo.defesa;
        if(ataqueClerigoMago >= bozo.vida) {
            System.out.println(daciolo.nome + " atacou " + bozo.nome + " com " + poderClerigo.nome + " causando " + ataqueClerigoMago + " de danos. " + bozo.nome + " está morto");
        } else if (daciolo.fe < poderClerigo.custoFe) {
            System.out.println(daciolo.nome + " não possui fé suficiente para atacar");
        } else if (daciolo.vida > 0) {
            System.out.println(daciolo.nome + " atacou " + bozo.nome + " com " + poderClerigo.nome + " causando " + ataqueClerigoMago + " de danos");
        } else if (daciolo.vida < 0) {
            System.out.println(daciolo.nome + " está morto e não pode atacar ");
        }

        //Texto narração
        System.out.println(" ");
        System.out.println("E após a primeira rodada de ataques e alguns danos irreparáveis, o campo de batalha apresenta-se devastado...");
        System.out.println(" ");

        //Status personagens
        int vidaAtualGuerreiro = ciro.vida - ataqueMagoGuerreiro;
        if (vidaAtualGuerreiro > 0) {
            System.out.println("- " + ciro.nome + ", o Guerreiro");
            System.out.println("  " + "Vida: " + vidaAtualGuerreiro);
            System.out.println("  " + "Ataque: " + ciro.ataque);
            System.out.println("  " + "Defesa: " + ciro.defesa);
            System.out.println(" ");
        } else {
            System.out.println("- " + ciro.nome + ", o Guerreiro, está morto");
            System.out.println(" ");}

        int vidaAtualBarbaro = boulos.vida - ataqueDruidaBarbaro;
        if (vidaAtualBarbaro > 0) {
            System.out.println("- " + boulos.nome + ", o Bárbaro");
            System.out.println("  " + "Vida: " + vidaAtualBarbaro);
            System.out.println("  " + "Ataque: " + boulos.ataque);
            System.out.println("  " + "Defesa: " + boulos.defesa);
            System.out.println(" ");
        } else {
            System.out.println("- " + boulos.nome + ", o Bárbaro, está morto");
            System.out.println(" ");}

        int vidaAtualMago = bozo.vida - ataqueClerigoMago;
        int  manaAtualMago = bozo.mana - magiaMago.custoMana;
        if (vidaAtualMago > 0) {
            System.out.println("- " + bozo.nome + ", o Mago");
            System.out.println("  " + "Vida: " + vidaAtualMago);
            System.out.println("  " + "Ataque: " + bozo.ataque);
            System.out.println("  " + "Defesa: " + bozo.defesa);
            System.out.println("  " + "Mana: " + manaAtualMago);
            System.out.println(" ");
        } else {
            System.out.println("- " + bozo.nome + ", o Mago, está morto");
            System.out.println(" ");}

        int vidaAtualFeiticeiro = carluxo.vida - ataqueGuerreiroFeiticeiro;
        int  manaAtualFeiticeiro = carluxo.mana - magiaFeiticeiro.custoMana;
        if (vidaAtualFeiticeiro > 0) {
            System.out.println("- " + carluxo.nome + ", o Feiticeiro");
            System.out.println("  " + "Vida: " + vidaAtualFeiticeiro);
            System.out.println("  " + "Ataque: " + carluxo.ataque);
            System.out.println("  " + "Defesa: " + carluxo.defesa);
            System.out.println("  " + "Mana: " + manaAtualFeiticeiro);
            System.out.println(" ");
        } else {
            System.out.println("- " + carluxo.nome + ", o Feiticeiro, está morto");
            System.out.println(" ");}

        int vidaAtualDruida = malafa.vida - ataqueBarbaroDruida;
        int  feAtualDruida = malafa.fe - poderDruida.custoFe;
        if (vidaAtualDruida > 0) {
            System.out.println("- " + malafa.nome + ", o Druida");
            System.out.println("  " + "Vida: " + vidaAtualDruida);
            System.out.println("  " + "Ataque: " + malafa.ataque);
            System.out.println("  " + "Defesa: " + malafa.defesa);
            System.out.println("  " + "Fé: " + feAtualDruida);
            System.out.println(" ");
        } else {
            System.out.println("- " + malafa.nome + ", o Druida, está morto");
            System.out.println(" ");}

        int vidaAtualClerigo = daciolo.vida - ataqueFeiticeiroClerigo;
        int  feAtualClerigo = daciolo.fe - poderClerigo.custoFe;
        if (vidaAtualClerigo > 0) {
            System.out.println("- " + daciolo.nome + ", o Clérigo");
            System.out.println("  " + "Vida: " + vidaAtualClerigo);
            System.out.println("  " + "Ataque: " + daciolo.ataque);
            System.out.println("  " + "Defesa: " + daciolo.defesa);
            System.out.println("  " + "Fé: " + feAtualClerigo);
            System.out.println(" ");
        } else {
            System.out.println("- " + daciolo.nome + ", o Clérigo, está morto");
            System.out.println(" ");}


        //Etapa 2 - Ataques
    }
}