package ArvoreBinariaBusca;

import ArvoreBinaria.ArvoreBinaria;
import ArvoreBinaria.No;

public class ArvBiBusca<T> extends ArvoreBinaria<Integer> {

    //construtores
    public ArvBiBusca() {

    }


    //metodos
    public void inserir(Integer valor) {
        if (raiz == null) {
            raiz.setInfo(Integer.parseInt(valor.toString()));

        } else if (valor.hashCode() < raiz.getInfo().hashCode() && raiz.getEsq() == null ) {
            raiz.setEsqNo(new No<>(valor));

        } else if (valor.hashCode() < raiz.getInfo().hashCode() && raiz.getEsq() != null) {
            inserir(raiz.getEsq());

        } else if (valor.hashCode() > raiz.getInfo().hashCode() && raiz.getDir() == null) {
            raiz.setDir(valor);

        } else  if (valor.hashCode() > raiz.getInfo().hashCode() && raiz.getDir() != null) {
            inserir(raiz.getDir());

        }

    }

//    public void remover(T valor) {


//    }

    //metodos percurso em profundidade


}
