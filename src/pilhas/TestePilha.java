package pilhas;

import ListaLigada.NoLista;

public class TestePilha<T> {

    public static void main(String[] args) {

        NoLista<String> batata = new NoLista<>("Anne");

        System.out.println();

        Pilha<String> p1 = new Pilha<>();

        p1.push("Mingau");
        p1.push("NAnan");
        p1.push("Anne");

        System.out.println(p1.top());
        System.out.println(p1.isEmpty());
        System.out.println(p1.toString());
        p1.pop();
        System.out.println(p1.top());

    }

}
