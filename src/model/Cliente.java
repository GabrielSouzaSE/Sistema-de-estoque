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
public class Cliente extends Pessoa{

    private Double limite;
    private String codCliente;
    private String mesNascimento;
    private String primeiraCompra;

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(String mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public String getPrimeiraCompra() {
        return primeiraCompra;
    }

    public void setPrimeiraCompra(String primeiraCompra) {
        this.primeiraCompra = primeiraCompra;
    }

//lixo
    public void cadastrarCliente(){

        super.cadastrarPessoa();
        this.limite = Double.parseDouble(JOptionPane.showInputDialog("Entre com o limite"));
        this.codCliente = JOptionPane.showInputDialog("Código do cliente");
        this.mesNascimento = JOptionPane.showInputDialog("Entre com o mês de nascimento");
        this.primeiraCompra = JOptionPane.showInputDialog("Entre com a data da primeira compra");
    }

    public void exibirCliente(){

        super.exibirPessoa();
        JOptionPane.showMessageDialog(null,
                "Limite: " + this.limite +
                        "\nCódigo: " + this.codCliente +
                        "\nNascimento: " + this.mesNascimento +
                        "\n1º Compra: " + this.primeiraCompra);
    }

}