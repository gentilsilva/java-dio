import models.*;

public class Main {

    public static void main(String[] args) {

        Banco bUm = new Banco("Um");
        Endereco clienteEndereco = new Endereco("Brasil", "Minas Gerais", "Belo Horizonte",
                "000111222", "Bairro Um", "Rua Um", "1");
        Cliente cliente = new Cliente("Cliente UM", "00011122233", "cliente@email.com", clienteEndereco);

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cp.depositar(500);
        cc.depositar(500);

        bUm.addConta(cc);
        bUm.addConta(cp);

        bUm.imprimirContas();

    }

}
