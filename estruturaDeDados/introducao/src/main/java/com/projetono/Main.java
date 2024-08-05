package main.java.com.projetono;

public class Main {

    public static void main(String[] args) {

        No<String> noUm = new No("Conteudo NoUm");
        No<String> noDois = new No("Conteudo NoDois");
        No<String> noTres = new No("Conteudo NoTres");
        No<String> noQuatro = new No("Conteudo NoQuatro");

        noUm.setProximoNo(noDois);
        noDois.setProximoNo(noTres);
        noTres.setProximoNo(noQuatro);

        System.out.println(noUm);
        System.out.println(noUm.getProximoNo());
        System.out.println(noUm.getProximoNo().getProximoNo());
        System.out.println(noUm.getProximoNo().getProximoNo().getProximoNo());

    }

}
