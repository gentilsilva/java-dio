package main.java.pilha;

public class Pilha {

    private No<Integer> refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No<Integer> novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefProximoNo(refAuxiliar);
    }

    public No<Integer> pop() {
        if(!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefProximoNo();
            return noPoped;
        }

        return null;
    }

    public No<Integer> top() {
        return this.refNoEntradaPilha;
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
