package br.unifei.imc;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import lombok.Data;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Data
public class Csvutil {
    public static List<Jogos> readGameCsv(Path csvFilePath){
        List<Jogos> ListaJogos = new ArrayList<>();
        try{
            Reader reader = Files.newBufferedReader(csvFilePath);
            CsvToBean<Jogos> csvToBean = new CsvToBeanBuilder(reader).withType(Jogos.class).withIgnoreLeadingWhiteSpace(true).build();
            ListaJogos = csvToBean.parse();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return ListaJogos;
    }
}