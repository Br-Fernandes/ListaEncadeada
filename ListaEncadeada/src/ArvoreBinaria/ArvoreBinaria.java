package ArvoreBinaria;

public class ArvoreBinaria<T> {

    private No<T> raiz;

    public ArvoreBinaria(No<T> raiz) {
        this.raiz = raiz;

    }

    public ArvoreBinaria(){
        this.raiz = null;

    }

    public String preOrdem(No<T> r) {
        if (raiz == null) {
            return "Arvore vazia";

        } else if (*)

        return "";
    }

    public String inOrdem() {
        return "";

    }

    public String posOrdem(No<T> r) {
        if (raiz == null) {
            return "Arvoré vazia";

        } else if (raiz.getEsq() != null) {
            posOrdem(raiz.getEsq());

        } else if (raiz.getDir() != null) {
            posOrdem(raiz.getDir());

        }
        return String.valueOf(raiz);
    }

    public String emLargura() {
        return "";
    }


}
