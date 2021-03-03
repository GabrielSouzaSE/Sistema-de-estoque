package sistemaDeEstoque;

import javax.swing.JOptionPane;

public class Atendente extends Funcionario{

    private int registro;

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
