package listaLigada;

public class Programa {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
//        System.out.println(lista.getTamanho());
        lista.adicionar("a");
        lista.adicionar("b");
        lista.adicionar("c");
        lista.adicionar("d");
        lista.adicionar("e");
        lista.adicionar("f");
        lista.adicionar("g");
        lista.adicionar("h");
        System.out.println("tamanho inicial: " + lista.getTamanho());
        System.out.println("primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("ultimo: " + lista.getUltimo().getValor());

        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }

        System.out.println("--------------------------------------------");

        lista.remover("a");
//        lista.remover("b");
//        lista.remover("ce");
//        lista.remover("df");
//        System.out.println("removido");
//        lista.adicionar("sp");
//        lista.adicionar("am");

//         lista.empate("b");
//        lista.primeiroQSai("a");
        //ista.segundoQSai("b");
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }
        System.out.println("tamanho final: " + lista.getTamanho());
        System.out.println("primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("ultimo: " + lista.getUltimo().getValor());
    }
}
