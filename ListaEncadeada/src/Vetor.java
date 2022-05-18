public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor() {
        elementos = new String[100];
        tamanho = 0;

    }

    public Vetor(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;

    }

    public boolean adiciona(String elemento) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == null) {
                elementos[i] = elemento;
                tamanho++;
                break;

            }

        }

       return true;

    }

    public boolean adiciona(int posicao, String elemento) {
        if (posicao >= 0 && elementos[posicao] == null) {
            elementos[posicao] = elemento;
            tamanho++;
            return true;

        } else if (posicao > 0 && elementos[posicao] != null){
            elementos[posicao - 1] = elemento;
            tamanho++;
            return true;

        } else {
            System.out.println("posição inexistente");
            return false;

        }

    }

    public String busca(int posicao) {
        if (elementos[posicao] != null) {
            System.out.println(elementos[posicao]);


        } else {
            System.out.printf("Posição inexiste\n");

        }

        return "";

    }

    public int busca(String elemento) {
        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] == elemento){
                System.out.println("O elemento está na posição: " + i);
                break;

            } else {
                System.out.println(-1);

            }

        }

        return 0;

    }

    public int tamanho() {
        System.out.println(tamanho);
        return tamanho;

    }

    public void remova(int posicao) {
        if (elementos[posicao] != null) {
            elementos[posicao] = null;

        }

    }

    public String toString() {
        for (int i = 0; i < elementos.length; i++){
            System.out.println("O elemento na posição " + i + " é: " + elementos[i]);

        }

        return "";

    }

}
