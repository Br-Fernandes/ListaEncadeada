package ArvoreBinaria;

public class ArvoreBinaria<T> {

    protected No<T> raiz;

    public ArvoreBinaria(No<T> raiz) {
        this.raiz = raiz;

    }

    public ArvoreBinaria(){
        this.raiz = null;

    }

    public String preOrdem(No<T> no) {
        if (no != null) {
            return no.getInfo() + " "
                    + preOrdem(no.getEsq())
                    + preOrdem(no.getDir());

        }

        return "";
    }

    public String preOrdem() {
        return preOrdem(this.raiz);

    }

    public String inOrdem() {
        return "";

    }

    public String posOrdem(No<T> r) {
        String str = "";

        if (raiz.getInfo() == null) {
            return "Arvoré vazia";

        } else if (raiz.getEsq() != null) {
            posOrdem(r.getEsq());
            str += raiz;

        } else if (raiz.getDir() != null) {
            posOrdem(r.getDir());
            str += raiz;

        }
        return str;
    }

    public String posOrdem() {
        return posOrdem(this.raiz);

    }

    public String emLargura() {
        return "";
    }

}
