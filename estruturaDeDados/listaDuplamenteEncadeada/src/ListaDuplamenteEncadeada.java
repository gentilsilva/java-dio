public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public void add(T conteudo) {
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setProximoNo(null);
        novoNo.setNoAnterior(ultimoNo);
        if(this.primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if(this.ultimoNo != null) {
            this.ultimoNo.setProximoNo(novoNo);
        }
        this.ultimoNo = novoNo;
        this.tamanhoLista++;
    }

    public void add(int index, T conteudo) {
        NoDuplo<T> noAuxiliar = this.getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setProximoNo(noAuxiliar);
        if(novoNo.getProximoNo() != null) {
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            novoNo.getProximoNo().setNoAnterior(novoNo);
        } else {
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo = novoNo;
        }
        if(index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoAnterior().setProximoNo(novoNo);
        }
        this.tamanhoLista++;
    }

    public void remove(int index) {
        if(index == 0) {
            primeiroNo = primeiroNo.getProximoNo();
            if(primeiroNo != null) {
                primeiroNo.setNoAnterior(null);
            }
        } else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoAnterior().setProximoNo(noAuxiliar.getProximoNo());
            if(noAuxiliar != ultimoNo) {
                noAuxiliar.getProximoNo().setNoAnterior(noAuxiliar.getNoAnterior());
            } else {
                ultimoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    public int size() {
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < this.size(); i++) {
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]---->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
