package sistemaDeEstoque;

import javax.swing.JOptionPane;

public class Gerente extends Funcionario{

    private double adicionalCargo;

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