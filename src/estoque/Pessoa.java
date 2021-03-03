package estoque;

import javax.swing.JOptionPane;

public class Pessoa {

    private String nome, CPF, RG, telefone;
    private Endereco end = new Endereco();

    public void cadastrarPessoa(){

        this.nome = JOptionPane.showInputDialog("O nome da pessoa");
        this.CPF = JOptionPane.showInputDialog("O CPF da pessoa");
        this.RG = JOptionPane.showInputDialog("O RG da pessoa");
        this.telefone = JOptionPane.showInputDialog("O telefone da pessoa");
        end.cadastrarEndereco();
    }

    public void exibirPessoa(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome +
                "\nCPF: " + this.CPF +
                "\nRG: " + this.RG +
                "\nTelefone: " + this.telefone);
        end.exibirEndereco();
    }
}
