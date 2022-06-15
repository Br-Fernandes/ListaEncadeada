package ArvoreBinariaBusca;

import ArvoreBinaria.No;

import javax.print.DocFlavor;

public class ArvBinTeste  {

    public static void main(String[] args) {

        ArvBiBusca<String> arbb = new ArvBiBusca<>();

        arbb.inserir("4");
        arbb.inserir("2");
        arbb.inserir("1");
        arbb.inserir("3");
        arbb.inserir("6");
        arbb.inserir("5");
        arbb.inserir("7");

        System.out.println(arbb.preOrdem());

        arbb.remover("3");


        System.out.println(arbb.preOrdem());



    }

}
