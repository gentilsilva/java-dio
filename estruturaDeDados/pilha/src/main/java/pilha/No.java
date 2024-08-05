package main.java.pilha;

public class No<T> {

    private T dado;
    private No<T> refProximoNo;

    public No(T dado) {
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getRefProximoNo() {
        return refProximoNo;
    }

    public void setRefProximoNo(No<T> refProximoNo) {
        this.refProximoNo = refProximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + dado +
                '}';
    }
}
