package models;

import lombok.Data;

@Data
public class Cliente {

    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;

    public Cliente(String nome, String cpf, String email, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }
}
