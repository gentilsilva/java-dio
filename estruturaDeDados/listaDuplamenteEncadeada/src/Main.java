public class Main {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> listaDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();

        listaDuplamenteEncadeada.add("c1");
        listaDuplamenteEncadeada.add("c2");
        listaDuplamenteEncadeada.add("c3");
        listaDuplamenteEncadeada.add("c4");
        listaDuplamenteEncadeada.add("c5");
        listaDuplamenteEncadeada.add("c6");
        listaDuplamenteEncadeada.add("c7");

        System.out.println(listaDuplamenteEncadeada);

        listaDuplamenteEncadeada.remove(3);
        listaDuplamenteEncadeada.add(3, "c99");

        System.out.println(listaDuplamenteEncadeada);
        System.out.println(listaDuplamenteEncadeada.get(3));

    }

}
