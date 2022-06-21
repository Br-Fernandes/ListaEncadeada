package pilhas;

import java.util.*;

public class TestePilha<T> {

    public static void main(String[] args) {



        Pilha<String> p1 = new Pilha<>();

        p1.push("(3)*(3+6) / 1-(12+5)");

        System.out.println(p1.parentizacaoCorreta());

    }

}
