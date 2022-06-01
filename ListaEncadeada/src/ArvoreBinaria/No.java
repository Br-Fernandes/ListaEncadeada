package ArvoreBinaria;

public class No<T> {

    private T info;
    private No<T> esq;
    private No<T> dir;

    //construtores
    public No(){
        this.info = null;
        this.esq = null;
        this.dir = null;

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
}
