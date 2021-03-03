/*
1. No principal, faça um menu e utilizando o switch permita, cadastrar ou exibir produto, cliente, funcionário.
2. Refatore o produto, inserindo uma classe categoria e familia com as seguintes informações (Familia: Nome, tipo; Categoria: Nome, Tipo, Descrição)
3. Faça uma associação entre produto e categoria, produto e familia, ou seja, o produto tem uma familia e o produto tem uma categoria;
4. Utilizando herança, crie, em funcionário as seguintes subclasses: Gerente, Atendente e vendedor.
*/
package sistemaDeEstoque;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        List<Gerente> gerentes = new ArrayList<>();
        List<Atendente> atendentes = new ArrayList<>();
        List<>

        int i = 0;

        while (i == 0) {

            Produto pdt = new Produto();
            Cliente clt = new Cliente();
            //Funcionario fcr = new Funcionario();

            int resp = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: Cadastrar produto [1]," +
                    " Exibir produto [2]," +
                    " Cadastrar cliente [3]," +
                    " Exibir cliente [4]," +
                    " Cadastrar funcionário [5]," +
                    " Exibir funcionário [6]"));

            switch (resp) {
                case 1:
                    System.out.println("A");
                    pdt.cadastrarProduto();
                    //System.out.println(pdt);
                    produtos.add(pdt);
                    //System.out.println(produtos);
                    break;
                case 2:
                    System.out.println("B");
                    for(Produto p: produtos) {
                        p.exibirProduto();
                    }
                    //pdt.exibirProduto();
                    break;
                case 3:
                    System.out.println("C");
                    clt.cadastrarCliente();
                    clientes.add(clt);
                    break;
                case 4:
                    System.out.println("D");
                    for(Cliente c: clientes) {
                        c.exibirCliente();
                    }
                    //clt.exibirCliente();
                    break;
                case 5:
                    System.out.println("E");
                    //fcr.cadastrarFuncionario();

                    int respCFun = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite a opção: Cadastrar Gerente [1]," +
                            " Cadastrar Atendente [2]," +
                            " Cadastrar Vendedor [3]"));

                    switch (respCFun){
                        case 1:
                            System.out.println("E.G");
                            break;
                        case 2:
                            System.out.println("E.A");
                            break;
                        case 3:
                            System.out.println("E.V");
                            break;
                        default:
                            System.out.println("Opção invalida!");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("F");
                    //fcr.exibirFuncionario();

                    int respEFun = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite a opção: Cadastrar Gerente [1]," +
                            " Cadastrar Atendente [2]," +
                            " Cadastrar Vendedor [3]"));

                    switch (respEFun){
                        case 1:
                            System.out.println("E.G");
                            break;
                        case 2:
                            System.out.println("E.A");
                            break;
                        case 3:
                            System.out.println("E.V");
                            break;
                        default:
                            System.out.println("Opção invalida!");
                            break;
                    }
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }

            i = Integer.parseInt(JOptionPane.showInputDialog("[0] para continuar ou [1] para sair"));

        }

    }

}
