public class Main {

    public static void main(String[] args) {

        Vetor v1 = new Vetor(5);

        v1.adiciona("bruno");
        v1.adiciona("neide");
        v1.adiciona(2,"bolinha");
        v1.adiciona(4,"breno");

        v1.busca(2);
        v1.busca(3);

        v1.busca("neide");
        v1.busca(null);

        v1.tamanho();

        System.out.println(v1.toString());

    }

}
