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
public class Gerente extends Funcionario{

    private double adicionalCargo;

    public double getAdicionalCargo() {
        return adicionalCargo;
    }

    public void setAdicionalCargo(double adicionalCargo) {
        this.adicionalCargo = adicionalCargo;
    }
    
    //lixo
    public void cadastrarGerente(){

        super.cadastrarFuncionario();
        this.adicionalCargo = Double.parseDouble(JOptionPane.showInputDialog("O valor adicional do Cargo de Gerente"));

    }

    public void exibirGerente(){

        super.exibirFuncionario();
        JOptionPane.showMessageDialog(null,
                "Valor adicional pelo cargo de Gerente: " + this.adicionalCargo);
    }

}
