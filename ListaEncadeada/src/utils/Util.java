package utils;

import ListaLigada.ListaLigada;
import ListaLigada.ListaLigada.*;

public class Util {

    ListaLigada l = new ListaLigada<>();

    public boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < l.getSize();

    }

}
