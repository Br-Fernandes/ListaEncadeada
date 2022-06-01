package ArvoreBinaria;

public class TesteArvore  {

    public static void main(String[] args) {

        //Criar arvore binaria
        ArvoreBinaria<String> arv = new ArvoreBinaria<String>();

        No<String> no1;
        No<String> no2 = null;

        no1 =   new No<>("Anne",
                new No<>("Anna",null, null),
                new No<>("Ananda", null, null));

        no2 =   new No<String>("Mingau",
                no2,
                new No<>("Akira", null, null));

        System.out.println(arv.posOrdem(no1));

    }

}
