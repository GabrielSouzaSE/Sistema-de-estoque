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
public class Pessoa {

    private String nome, CPF, RG, telefone;
    private Endereco end = new Endereco();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }
    
    //lixo
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
