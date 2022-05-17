package pilhas;

import ListaLigada.ListaLigada;

public class Pilha<T> {

    private int topo;
    private ListaLigada<T> elemento;

    public Pilha() {
        this.topo = -1;
        elemento = new ListaLigada<T>();


    }

    public void push(T elemento) {
        this.elemento.adicionarInicio(elemento);
        this.topo++;

    }

    public void pop() {
        this.elemento.remover(getTopo());
        this.topo--;

    }

    public boolean isEmpty() {
        if (this.topo == -1)
            return true;
        else
            return false;

    }

    public String top() {
        return (String) this.elemento.getList().getElement();

    }

    @Override
    public String toString() {
        return "Pilha{" +
                "topo=" + getTopo() +
                ", elemento=" + elemento.getList().getNext().getElement() +
                '}';
    }

    public T getTopo() {
        return (T) this.elemento.getList().getElement();

    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public ListaLigada<T> getElemento() {
        return elemento;
    }

    public void setElemento(ListaLigada<T> elemento) {
        this.elemento = elemento;
    }
}
