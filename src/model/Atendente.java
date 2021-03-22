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
public class Atendente extends Funcionario{

    private int registro;

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

//lixo
    public void cadastrarAtendente(){

        super.cadastrarFuncionario();
        this.registro = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de registro de reclamações"));

    }

    public void exibirAtendente(){

        super.exibirFuncionario();
        JOptionPane.showMessageDialog(null,
                "Quant. de registro de reclamações: " + this.registro);
    }

}
