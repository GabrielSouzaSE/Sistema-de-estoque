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
public class Endereco {

    private String cep;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

//lixo
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