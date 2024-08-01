package models;

import lombok.Data;

@Data
public class Endereco {

    private String pais;
    private String estado;
    private String cidade;
    private String cep;
    private String bairro;
    private String rua;
    private String numero;


    public Endereco(String pais, String estado, String cidade, String cep, String bairro, String rua, String numero) {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }
}
