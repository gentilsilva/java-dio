package models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<Conta>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void imprimirContas() {
        System.out.println(String.format("=== Imprimindo Clientes do Banco %s ===", this.nome));
        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Agencia: " + this.contas.get(i).getAgencia());
            System.out.println("Numero: " + this.contas.get(i).getNumero());
            System.out.println("Titular: " + this.contas.get(i).getCliente().getNome());
        }
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }
}
