package estoque;

import javax.swing.JOptionPane;

public class Endereco {

    private String cep;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;

    public void cadastrarEndereco(){

        this.cep = JOptionPane.showInputDialog("Entre com o cep");
        this.endereco = JOptionPane.showInputDialog("Entre com o endereço");
        this.numero = JOptionPane.showInputDialog("Entre com o numero");
        this.complemento = JOptionPane.showInputDialog("Entre com o complemento");
        this.bairro = JOptionPane.showInputDialog("Entre com o bairro");
        this.cidade = JOptionPane.showInputDialog("Entre com a cidade");
        this.uf = JOptionPane.showInputDialog("Entre com o estado");
    }

    public void exibirEndereco(){

        JOptionPane.showMessageDialog(null,
                "Cep: " + this.cep +
                        "\nEndereço: " + this.endereco +
                        "\nNúmero: " + this.numero +
                        "\nComplemento" + this.complemento +
                        "\nBairro: " + this.bairro +
                        "\nCidade: " + this.cidade +
                        "\nEstado: " + this.uf);
    }

}
