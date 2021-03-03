package estoque;

import javax.swing.JOptionPane;

public class Vendedor extends Funcionario{

    private double adicionalVenda;

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
