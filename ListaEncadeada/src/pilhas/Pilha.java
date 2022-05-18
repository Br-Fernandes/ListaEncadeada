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
        setTopo(this.topo += 1);

    }

    public void pop() {
        elemento.removeComeco();

    }

    public boolean isEmpty() {
        if (this.topo == -1)
            return true;
        else
            return false;

    }

    public void top() {
        T valor;

        try {
            System.out.println(this.elemento.getList().getElement());

        } catch (NullPointerException exception) {
            System.out.println("Topo vazio");

        }

    }

    @Override
    public String toString() {
        return "Pilha{ " +
                "topo= " + topo +
                ", elemento= " + elemento.toString() +
                '}';
    }

    public int getTopo() {
        return topo;
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
