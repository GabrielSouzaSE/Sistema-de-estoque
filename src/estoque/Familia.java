package estoque;

import javax.swing.JOptionPane;

public class Familia {

    private String nome;
    private String tipo;

    public void cadastrarFamilia(){
        this.nome = JOptionPane.showInputDialog("Nome da familia do produto");
        this.tipo = JOptionPane.showInputDialog("Tipo da familia do produto");
    }
    public void exibirFamilia(){
        JOptionPane.showMessageDialog(null,"Nome: " + this.nome +
                "\ntipo: " + this.tipo);
    }

}