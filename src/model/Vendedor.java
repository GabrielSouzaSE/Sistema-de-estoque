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
public class Vendedor extends Funcionario{

    private double adicionalVenda;

    public double getAdicionalVenda() {
        return adicionalVenda;
    }

    public void setAdicionalVenda(double adicionalVenda) {
        this.adicionalVenda = adicionalVenda;
    }
    
    //lixo
    public void cadastrarVendedor(){

        super.cadastrarFuncionario();
        this.adicionalVenda = Double.parseDouble(JOptionPane.showInputDialog("O valor adicional de produto vendido"));

    }

    public void exibirVendedor(){

        super.exibirFuncionario();
        JOptionPane.showMessageDialog(null,
                "Valor adicional sobre vendas: " + this.adicionalVenda);
    }

}
