package ListaLigada;

import utils.Util;

public class ListaLigada<T> {

    private NoLista list;
    private NoLista end;
    private int size;

  //  Util util = new Util();

    public ListaLigada() {
        this.size = 0;

    }

    public NoLista getList() {
        return list;
    }

    public void setList(NoLista list) {
        this.list = list;
    }

    public NoLista getEnd() {
        return end;
    }

    public void setEnd(NoLista end) {
        this.end = end;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void adicionar(T element) {
        NoLista novo = new NoLista((String) element);
        if (list == null && end == null) {
            list = novo;
            end = novo;

        } else {
            this.end.setNext(novo);
            end = novo;

        }
        size++;

    }

    public void adicionarInicio(T elemento) {
        NoLista novo = new NoLista(elemento);
        if (this.list == null && this.end == null) {
            this.list = novo;
            this.end = novo;

        } else {
            novo.setNext(this.list);
            this.list = novo;

        }
        this.size++;

    }

    public void remover(T element) {
        NoLista actual = this.list;
        NoLista previous = null;

        for (int i=0;i<this.getSize();i++) {
            previous = actual;
            actual = actual.getNext();


            if (actual.getElement().equals(element)) {
                if(actual != null) {
                    if (actual == list) {
                        this.list = actual.getNext();
                        actual.setNext(null);

                    }
                    previous.setNext(actual.getNext());
                    actual = null;
                    break;

                }

            }

        }


        this.size--;

    }

    public void removeComeco() {
        if (!posicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição não existe");

        }
        this.list = this.list.getNext();
        this.size--;

        if (this.size == 0) {
            this.end = null;

        }

    }

    public NoLista get(int posicao) {
        NoLista actual = this.list;

        for (int i = 0; i<posicao; i++) {
            if (actual.getNext() != null) {
                actual = actual.getNext();

            }

        }
        return actual;

    }

    public String toString() {
// Verificando se a Lista está vazia
        if(this.size == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        NoLista atual = list;
// Percorrendo até o penúltimo elemento.
        for (int i = 0; i < this.size - 1; i++) {
            builder.append(atual.getElement());
            builder.append(", ");
            atual = atual.getNext();
        }
// último elemento
        builder.append(atual.getElement());
        builder.append("]");
        return builder.toString();
    }

    public boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < getSize();

    }

}
