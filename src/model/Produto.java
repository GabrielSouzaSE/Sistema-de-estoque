/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author biel_
 */
public class Produto {

    private int codigo;
    private String nome;
    private double custo;
    private String unidade;
    private String marca;
    private Categoria categoria = new Categoria();
    private Familia familia = new Familia();
    private Fornecedor fornecedor = new Fornecedor();
    
    public int inserirNovoProduto(){
        return 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
    // lixo, remover posteriormente na refatoração
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