package main.java.fila;

public class No<T> {

    private T object;
    private No<T> refProximoNo;

    public No(T object) {
        this.refProximoNo = null;
        this.object = object;
    }

    public No() {
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getRefProximoNo() {
        return refProximoNo;
    }

    public void setRefProximoNo(No refProximoNo) {
        this.refProximoNo = refProximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "objeto=" + object +
                '}';
    }
}
