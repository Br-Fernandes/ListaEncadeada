package pilhas;

import ListaLigada.ListaLigada;

public class ExerciciosPilha {

    Pilha<Integer> pilha;

    public void inverterPilha() {
        pilha = new Pilha<>();
        ListaLigada[] elementos = new ListaLigada[pilha.getTopo()];

        if (pilha.isEmpty()) {
            System.out.println("Pilha vazia");

        } else {
            for (int i =0;i<=pilha.getTopo();i++) {
                while (pilha.isEmpty()) {
                    elementos[i] = pilha.getElemento();
                    System.out.println(pilha.getElemento());
                    //pilha.pop();

                }

            }

        }

    }

}
