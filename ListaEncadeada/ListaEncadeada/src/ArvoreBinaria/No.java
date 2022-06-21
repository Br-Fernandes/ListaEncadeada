package ArvoreBinaria;

import ArvoreBinariaBusca.ArvBiBusca;

public class No<T> extends ArvBiBusca<Integer> {

    protected T info;
    protected No<T> esq;
    protected No<T> dir;

    //construtores
    public No(){
        setInfo(null);
        setEsqNo(null);
        setDir(null);

    }

    public No(T info) {
        setInfo(info);

    }



    public No(T info, No<T> esq, No<T> dir) {
        setInfo(info);
        setEsqNo(esq);
        setDir(dir);

    }



    //getters e setters
    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public No<T> getEsq() {
        return esq;
    }

    public void setEsqNo(No<T> esq) {
        this.esq = esq;
    }

    public No<T> getDir() {
        return dir;
    }

    public void setDir(No<T> dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "No{" +
                "info=" + info +
                ", esq=" + esq +
                ", dir=" + dir +
                '}';
    }

}
