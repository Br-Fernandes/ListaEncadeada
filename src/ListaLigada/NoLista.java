package ListaLigada;

public class NoLista<T> {

    private T element;
    private NoLista next;

    public NoLista(Object element) {
        this.element = (T) element;
    }

    public T getElement() {
        return (T) element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public NoLista getNext() {
        return next;
    }

    public void setNext(NoLista next) {
        this.next = next;
    }
}
