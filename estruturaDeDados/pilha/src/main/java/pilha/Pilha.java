package main.java.pilha;

public class Pilha<T> {

    private No<T> refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(T inteiro) {
        No novoNo = new No(inteiro);
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefProximoNo(refAuxiliar);
    }

    public T pop() {
        if(!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefProximoNo();
            return (T) noPoped;
        }

        return null;
    }

    public T top() {
        return (T) this.refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "-----------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "-----------\n";

        No noAuxiliar = refNoEntradaPilha;

        while(true) {
            if(noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefProximoNo();
            } else {
                break;
            }
        }

        stringRetorno += "===========\n";
        return stringRetorno;
    }
}
