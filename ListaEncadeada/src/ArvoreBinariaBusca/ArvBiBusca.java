package ArvoreBinariaBusca;

import ArvoreBinaria.ArvoreBinaria;
import ArvoreBinaria.No;

public class ArvBiBusca<T extends Comparable>  extends ArvoreBinaria<T>  {

    //construtores
    public ArvBiBusca() {
        super();

    }

    public ArvBiBusca(No<T> raiz) {
        super(raiz);

    }


    //metodos

    public boolean localizar(No<T> aux, T num, boolean loc) {
        if (aux != null && loc == false) {
            if (aux.getInfo() == num) {
                loc = true;
            } else if (num.compareTo(aux.getInfo()) < 0) {
                loc = localizar(aux.getEsq(), num, loc);
            } else {
                loc = localizar(aux.getDir(), num, loc);
            }
        }
        return loc;
    }

    public void inserir(T valor) {
        super.raiz = inserir(super.raiz, valor);

    }
    public No<T> inserir(No<T> r , T valor)  {
        if (r == null) {
            No<T> novo = new No<>(valor, null, null);
            return  novo;

        } else {
            if (valor.compareTo(r.getInfo()) < 0) {
                r.setEsqNo(inserir(r.getEsq(), valor));
                return r;

            } else {
                r.setDir(inserir(r.getDir(), valor));
                return r;

            }

        }

    }

    public void remover(T valor) {
        super.raiz = remover(super.raiz, valor);

    }

    public No<T> remover(No<T> r, T valor) {
        if (r == null) {
            System.out.println("pilha vazia");
            return r;

        } else {
            if (valor.compareTo(r.getInfo()) < 0) {
                r.setEsqNo(remover(r.getEsq(), valor));
                return r;

            } else if (valor.compareTo(r.getInfo()) == 0) {
               return r;

            } else {
                r.setDir(remover(r.getDir(), valor));
                return r;

            }

        }
        
    }

    public void removeAtual(No<T> r) {
        if (r.getEsq() == null && r.getDir() == null) {
            r.setInfo((T) "");

        } else if (r.getEsq() != null && r.getDir() != null) {


        }

    }


//    public void remover(T valor) {


//    }

    //metodos percurso em profundidade


}
