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
public class Categoria {

    private String nome, tipo, descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

//lixo
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

