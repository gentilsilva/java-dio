package main.java.fila;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T object) {
        No novoNo = new No(object);
        novoNo.setRefProximoNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T dequeue() {
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(true) {
                if(primeiroNo.getRefProximoNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefProximoNo();
                } else {
                    noAuxiliar.setRefProximoNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T first() {
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while(true) {
                if(primeiroNo.getRefProximoNo() != null) {
                    primeiroNo = primeiroNo.getRefProximoNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;
        if(refNoEntradaFila != null) {
          while(true) {
              stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]---->";
              if(noAuxiliar.getRefProximoNo() != null) {
                  noAuxiliar = noAuxiliar.getRefProximoNo();
              } else {
                  stringRetorno += "null";
                  break;
              }
          }
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
