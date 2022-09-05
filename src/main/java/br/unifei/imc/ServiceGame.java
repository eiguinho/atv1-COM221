package br.unifei.imc;
import lombok.Data;

import br.unifei.imc.Editora;
import br.unifei.imc.Jogos;
import br.unifei.imc.Plataformas;

import java.util.ArrayList;
import java.util.List;

public class ServiceGame {
    public static List<Jogos> getListaPorPlataforma(List<Jogos> JogosList, Plataformas.plataformas p){
        List<Jogos> JogosPorPlataforma = new ArrayList<>();
        JogosList.stream().filter(jogo -> jogo.getPlatform().equals(p.name()))
                .forEach(jogos -> JogosPorPlataforma.add((jogos)));
        return JogosPorPlataforma;
    }
    public static List<Jogos> getListaPorEditora(List<Jogos> JogosList, Editora.editoras p){
        List<Jogos> JogosPorEditora = new ArrayList<>();
        JogosList.stream().filter(game -> (game.getPublisher().replaceAll("\\s+","")).equals(p.name())).forEach(Jogos -> JogosPorEditora.add((Jogos)));
        return JogosPorEditora;
    }
}