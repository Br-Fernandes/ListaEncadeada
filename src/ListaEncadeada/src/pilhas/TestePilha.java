package pilhas;

import ListaLigada.NoLista;

public class TestePilha<T> {

    public static void main(String[] args) {



        Pilha<String> p1 = new Pilha<>();
        ExerciciosPilha ep = new ExerciciosPilha();



        p1.push("Mingau");
        p1.push("NAnan");
        p1.push("Anne");

        System.out.println(p1.getTopo());

       // ep.inverterPilha();


    }

}
