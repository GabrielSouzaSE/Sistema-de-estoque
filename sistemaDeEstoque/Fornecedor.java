package sistemaDeEstoque;

import javax.swing.JOptionPane;

public class Fornecedor {

    private String nome, telefone, contato;
    private Endereco end = new Endereco();

    public void cadastrarFornecedor(String nome, String telefone, String contato){

        this.nome = nome;
        this.telefone = telefone;
        this.contato = contato;
        end.cadastrarEndereco();
    }

    public void exibirFornecedor(){

        JOptionPane.showMessageDialog(null, "Nome Fornecedor:" + this.nome +
                "\nTelefone Fornecedor: " + this.telefone +
                "\nContato Fornecedor: " + this.contato);
        end.exibirEndereco();
    }
}
