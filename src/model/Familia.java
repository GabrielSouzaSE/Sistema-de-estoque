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
public class Familia {

    private String nome;
    private String tipo;

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

//lixo
    public void cadastrarFamilia(){
        this.nome = JOptionPane.showInputDialog("Nome da familia do produto");
        this.tipo = JOptionPane.showInputDialog("Tipo da familia do produto");
    }
    public void exibirFamilia(){
        JOptionPane.showMessageDialog(null,"Nome: " + this.nome +
                "\ntipo: " + this.tipo);
    }

}
