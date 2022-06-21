package pilhas;

import ListaLigada.ListaLigada;

import java.io.IOException;
import java.util.Collections;

public class Pilha<T> {

    private int topo;
    private ListaLigada<T> elemento;

    public Pilha() {
        this.topo = -1;
        elemento = new ListaLigada<T>();

    }

    public void push(Object elemento) {
        this.elemento.adicionarInicio((T) elemento);
        setTopo(this.topo += 1);

    }

    public void pop() {
        elemento.removeComeco();
        setTopo(this.topo -= 1);

    }

    public boolean isEmpty() {
        if (this.topo == -1)
            return true;
        else
            return false;

    }

    public Object top() {
        return  this.elemento.getList().getElement();

    }

    @Override
    public String toString() {
        return "Pilha{ " +
                "topo= " + topo +
                ", elemento= " + elemento.toString() +
                '}';
    }

    public void inverterPilha() {
        Object[] elementos = new Object[getTopo()+1];

        if (isEmpty()) {
            System.out.println("Pilha vazia");

        } else {
            for (int i =0;i<elementos.length;i++) {
                elementos[i] = top();
                pop();

            }
            for (int i=-1;i<=getTopo();i++) {
                try {
                    push(elementos[i+1]);

                } catch (IndexOutOfBoundsException e) {
                    break;

                }

            }

        }

    }

    public void inverterPalavras() {
        String texto = (String) top();
        String[] textoSeparado = texto.split(" ");
        String textoInvertido = "";

        for (int i=0;i< textoSeparado.length;i++){
            String palavra = textoSeparado[i];
            String palavraInvertida = "";

            for (int c=palavra.length()-1;c>=0;c--){
                palavraInvertida = palavraInvertida + Character.toString(palavra.charAt(c));

            }
            textoInvertido = textoInvertido + palavraInvertida + " ";

        }
        System.out.println(textoInvertido);

    }

    public boolean isPalindrome() {
        boolean palindrome;

        String a = (String) top();
        String b = "";

        try {
            for (int i=a.length();i>0;i--) {
                b += a.substring(i - 1,i);

            }

            if (b.equals(top())) {
                palindrome = true;

            } else {
                palindrome = false;

            }

        } catch (NumberFormatException ex) {
            palindrome = false;

        }
        return palindrome;

    }

    public boolean parentizacaoCorreta() {
        String expressao = (String) top();
        String[] a = expressao.split("");
        int abreParenteses = 0;
        int fechaParentes = 0;

        for (int i=0;i<a.length;i++){
            if (a[i].equals("(")) {
                abreParenteses++;

            } else if (a[i].equals(")")) {
                fechaParentes++;

            }

        }

        if (abreParenteses == fechaParentes)
            return true;

        else
            return false;

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