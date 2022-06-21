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

    public boolean localizar(No<T> r, T valor ) {
        if (r == null) {
            return false;

        }
        if (valor.compareTo(r.getInfo()) == 0) {
            return true;

        }
        if (valor.compareTo(r.getInfo()) > 0) {
            return localizar(r.getEsq(), valor);

        } else {
            return  localizar(r.getDir(), valor);

        }

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
            if (valor.compareTo(r.getInfo()) == 0) {
                r.setEsqNo(remover(r.getEsq(), valor));
                return r;

            } else if (valor.compareTo(r.getInfo()) < 0) {
               return r;

            } else {
                r.setDir(remover(r.getDir(), valor));
                return r;

            }

        }

    }

    public T minimo(No<T> r) {
        if (r == null) {
            return (T) r;

        }
        if (r.getEsq() == null) {
            return r.getInfo();

        } else {
            return minimo(r.getEsq());

        }

    }

    public T maximo(No<T> r) {
        if (r == null) {
            return (T) r;

        }
        if (r.getDir() == null) {
            return r.getInfo();

        } else {
            return maximo(r.getDir());

        }

    }

    public T sucessor(No<T> r) {
        return minimo(r.getDir());

    }

    public Integer numNos(No<T> r) {
        Integer num = 0;

        if (r == null) {
            return 0;

        }
        if (r.getEsq() != null) {
            num++;
            numNos(r.getEsq());

        }
        if (r.getDir() != null) {
            num++;
            numNos(r.getDir());

        }
        return num;

    }

    public Integer numFolhas(No<T> r) {
        Integer num = 0;

        if (r == null) {
            return 0;

        }
        if (r.getEsq() == null && r.getDir() == null) {
            num++;

        } else {
            return numFolhas(r.getEsq()) + numFolhas(r.getDir());

        }
        return num;

    }

    public static void main(String[] args) {

        No<String> no = new No<String>("6",
                        new No<>("3",
                                new No<>("2",
                                        new No<>("1", null, null),
                                        null),
                                null),
                        new No<>("9",
                                new No<>("8",
                                        new No<>("7", null, null),
                                        null),
                                new No<>("12",
                                        null,
                                        new No<>("15", null, null))));

        ArvBiBusca ab = new ArvBiBusca();
        System.out.println(ab.numNos(no));

    }


//    public void remover(T valor) {


//    }

    //metodos percurso em profundidade


}
