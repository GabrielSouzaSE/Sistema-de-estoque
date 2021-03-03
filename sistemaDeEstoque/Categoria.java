package sistemaDeEstoque;

import javax.swing.JOptionPane;

public class Categoria {

    private String nome, tipo, descricao;

    public void cadastrarCategoria(){
        this.nome = JOptionPane.showInputDialog("Nome da categoria do produto");
        this.tipo = JOptionPane.showInputDialog("Tipo da categoria do produto");
        this.descricao = JOptionPane.showInputDialog("Descricao da categoria do produto");
    }
    public void exibirCategoria(){
        JOptionPane.showMessageDialog(null, "Nome Categoria:" + this.nome +
                "\nTipo Categoria: " + this.tipo +
                "\nDescricao Categoria: " + this.descricao);
    }

}
