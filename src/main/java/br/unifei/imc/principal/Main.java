package br.unifei.imc.principal;

import br.unifei.imc.Editora;
import br.unifei.imc.Jogos;
import br.unifei.imc.Plataformas;
import br.unifei.imc.ServiceGame;
import br.unifei.imc.Csvutil;

import java.nio.file.Paths;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Jogos> listaJogos = Csvutil.readGameCsv(Paths.get("src/vendas-games.csv"));
        List<Jogos> listaps3 = ServiceGame.getListaPorPlataforma(listaJogos, Plataformas.plataformas.PS3);
        List<Jogos> listawii = ServiceGame.getListaPorPlataforma(listaJogos, Plataformas.plataformas.Wii);
        System.out.println("\nJogos da plataforma Wii ou ps3: ");
        System.out.println(listaps3);
        System.out.println(listawii);
        List<Jogos> listasega = ServiceGame.getListaPorEditora(listaJogos, Editora.editoras.Sega);
        List<Jogos> listaub = ServiceGame.getListaPorEditora(listaJogos, Editora.editoras.Ubisoft);
        System.out.println("\nJogos da Sega ou Ubisoft: ");
        System.out.println(listasega);
        System.out.println(listaub);
    }
}
