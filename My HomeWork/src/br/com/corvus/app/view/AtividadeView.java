package br.com.corvus.app.view;

import br.com.corvus.app.model.AtividadeModel;
import java.util.Scanner;

/**
 *
 * @author waleson_melo
 */
public class AtividadeView {

    Scanner sc = new Scanner(System.in);

    AtividadeModel atm = new AtividadeModel();

    public void menuAtividadeView() {
        int opcao = -1;

        OUTER:
        while (true) {
            System.out.println("===============================");
            System.out.println("========|  Atividade  |========");
            System.out.println("===============================");

            System.out.println("(1) Cadastrar Atividade");
            System.out.println("(2) Alterar Dados Atividade");
            System.out.println("(3) Apagar Atividade");
            System.out.println("(4) Pesquisar Atividade");
            System.out.println("(5) Listar Atividades");
            System.out.println("(0) Voltar");

            System.out.println("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 0:
                    break OUTER;
                case 1:
                    cadastrarAtividade();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção invalida.");
                    break;
            }
        }
    }

    public void cadastrarAtividade() {
        System.out.println("==============================");
        System.out.println("=========ATIVIDADE============");
        System.out.println("==============================");
        
        System.out.print("Nome: ");
        atm.setNome(sc.nextLine());
        System.out.print("Codigo Materia: ");
        atm.setCodigoMateria(sc.nextLine());
        System.out.print("Nome Materia: ");
        atm.setNomeMateria(sc.nextLine());
        System.out.print("Data: ");
        atm.setData(sc.nextLine());
        System.out.print("Nota: ");
        atm.setNota(Float.parseFloat(sc.nextLine()));
        System.out.print("Status: ");
        atm.setStatus(sc.nextLine());
        System.out.print("Tipo: ");
        atm.setTipo(sc.nextLine());
        
        atm.cadastrarAtividade();
    }
}
