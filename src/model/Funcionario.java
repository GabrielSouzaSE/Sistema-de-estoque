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
public class Funcionario extends Pessoa{

    private int matricula;
    private double salario;
    private String setor;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    //lixo
    public void cadastrarFuncionario(){

        super.cadastrarPessoa();
        this.matricula = Integer.parseInt(JOptionPane.showInputDialog("Entre com a matricula"));
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Entre com o salario"));
        this.setor = JOptionPane.showInputDialog("Entre com o setor");
    }

    public void exibirFuncionario(){

        super.exibirPessoa();
        JOptionPane.showMessageDialog(null,
                "Matricula: " + this.matricula +
                        "\nSalario: " + this.salario +
                        "\nSetor" + this.setor);
    }

}