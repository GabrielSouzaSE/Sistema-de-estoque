package estoque;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa{

    private int matricula;
    private double salario;
    private String setor;

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