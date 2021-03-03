package sistemaDeEstoque;

import javax.swing.JOptionPane;

public class Produto {

    private int codigo;
    private String nome;
    private double custo;
    private String unidade;
    private String marca;
    private Categoria categoria = new Categoria();
    private Familia familia = new Familia();
    private Fornecedor fornecedor = new Fornecedor();

    public void cadastrarProduto(){
        this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do produto"));
        this.nome = JOptionPane.showInputDialog("Nome do produto");
        this.custo = Double.parseDouble(JOptionPane.showInputDialog("Curso do produto em R$"));
        this.unidade = JOptionPane.showInputDialog("Unidade do produto");
        this.marca = JOptionPane.showInputDialog("Marca do produto");
        categoria.cadastrarCategoria();
        familia.cadastrarFamilia();
        fornecedor.cadastrarFornecedor("Atacadao", "79 99229922", "Joselito");
    }
    public void exibirProduto(){
        JOptionPane.showMessageDialog(null, "Codigo: " + this.codigo +
                "\nNome: " + this.nome +
                "\nCusto: " + this.custo +
                "\nUnidade: " + this.unidade +
                "\nMarca: " + this.marca);
        categoria.exibirCategoria();
        familia.exibirFamilia();
        fornecedor.exibirFornecedor();
    }

}