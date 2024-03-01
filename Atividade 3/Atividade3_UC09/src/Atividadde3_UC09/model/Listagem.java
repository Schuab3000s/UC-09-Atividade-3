package Atividadde3_UC09.model;

import java.util.ArrayList;
import java.util.List;

public class Listagem {

    private static final List<Pessoa> listaPessoa = new ArrayList<>();
    private static final List<Consulta> listaConsulta = new ArrayList<>();

    public static List<Pessoa>
            ListarPessoa() {
        return listaPessoa;
    }

    public static void Adicionar(Pessoa pessoa) {
        listaPessoa.add(pessoa);
    }

    public static List<Consulta> ListarConsulta() {
        return listaConsulta;
    }

    public static void Adicionar(Consulta consulta) {
        listaConsulta.add(consulta);
    }
}
