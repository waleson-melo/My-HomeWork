/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corvus.app.view;

import br.com.corvus.app.model.MateriaModel;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author waleson_melo
 */
public class MateriaView {

    Scanner sc = new Scanner(System.in);

    MateriaModel mm = new MateriaModel();

    public void menuMateriaView() throws SQLException {
        int opcao = -1;

        OUTER:
        while (true) {
            System.out.println("===============================");
            System.out.println("=========|  Materia  |=========");
            System.out.println("===============================");

            System.out.println("(1) Cadastrar Materia");
            System.out.println("(2) Alterar Dados Materia");
            System.out.println("(3) Apagar Materia");
            System.out.println("(4) Pesquisar Materia");
            System.out.println("(5) Listar Materias");
            System.out.println("(0) Voltar");

            System.out.println("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 0:
                    break OUTER;
                case 1:
                    cadastrarMateriaView();
                    break;
                case 2:
                    alterarMateria();
                    break;
                case 3:
                    break;
                case 4:
                    pesquisarMateria();
                    break;
                case 5:
                    listarMaterias();
                    break;
                default:
                    System.out.println("Opção invalida.");
                    break;
            }
        }
    }

    public void cadastrarMateriaView() throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("==========MATERIA=============");
        System.out.println("==============================");
        System.out.print("Nome: ");

        mm.setNome(sc.nextLine());
        System.out.print("Carga Horaria: ");
        mm.setCargaHoraria(sc.nextLine());
        System.out.print("Codigo Professor: ");
        mm.setCodigoProfessor(sc.nextLine());
        System.out.print("Nome Professor: ");
        mm.setProfessorNome(sc.nextLine());
        System.out.print("Status: ");
        mm.setStatus(sc.nextLine());

        mm.cadastrarMateria();
    }

    public void listarMaterias() throws SQLException {
        System.out.println("==============================");
        System.out.println("==========MATERIAS============");
        System.out.println("==============================");
        mm.listarMaterias();
    }

    public void alterarMateria() throws SQLException {
        System.out.println("==============================");
        System.out.println("==========MATERIA=============");
        System.out.println("==============================");

        mm.listarMaterias();

        System.out.print("Codigo para editar as informações: ");
        mm.setCodigo(sc.nextLine());

        System.out.print("Nome: ");
        mm.setNome(sc.nextLine());
        System.out.print("Carga Horaria: ");
        mm.setCargaHoraria(sc.nextLine());
        System.out.print("Codigo Professor: ");
        mm.setCodigoProfessor(sc.nextLine());
        System.out.print("Nome Professor: ");
        mm.setProfessorNome(sc.nextLine());
        System.out.print("Status: ");
        mm.setStatus(sc.nextLine());

        mm.alterarMateria();
    }

    public void pesquisarMateria() {
        System.out.println("==============================");
        System.out.println("==========MATERIA=============");
        System.out.println("==============================");

        System.out.print("Nome da materia: ");
        mm.setNome(sc.nextLine());

        mm.pesquisarMateria();
    }
}
