/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.corvus.app.view;

import java.sql.SQLException;
import java.util.Scanner;
import br.com.corvus.app.model.ProfessorModel;

/**
 *
 * @author mcamb
 */
public class ProfessorView {
    
    Scanner sc = new Scanner(System.in);
    
    ProfessorModel pm = new ProfessorModel();
    
    public void menuProfessorView() throws SQLException{
        int opcao = -1;
        
        OUTER:
        while(true){
            System.out.println("===============================");
            System.out.println("=========|  Professor  |=========");
            System.out.println("===============================");

            System.out.println("(1) Cadastrar Professor");
            System.out.println("(2) Alterar Dados Professor");
            System.out.println("(3) Apagar Professor");
            System.out.println("(4) Pesquisar Professor");
            System.out.println("(5) Listar Professor");
            System.out.println("(0) Voltar");

            System.out.println("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());
            
            switch (opcao) {
                case 0:
                    break OUTER;
                case 1:
                    cadastrarProfessorView();
                    break;
                case 2:
                    alterarProfessorView();
                    break;
                case 3:
                    apagarProfessorView();
                    break;
                case 4:
                    pesquisarProfessorView();
                    break;
                case 5:
                    listarProfessor();
                    break;
                default:
                    System.out.println("Opção invalida.");
                    break;
            }
        }
    } 
    
     public void cadastrarProfessorView() throws SQLException{
         
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==============================");
        System.out.println("========== Professor =============");
        System.out.println("==============================");
        System.out.print("Nome: ");
        pm.setNome(sc.nextLine());
        System.out.print("CPF: ");
        pm.setCpf(sc.nextLine());
        System.out.print("Codigo : ");
        pm.setCodigo(sc.nextLine());
        System.out.print("E-mail: ");
        pm.setEmail(sc.nextLine());
        System.out.println("Telefone: ");
        pm.setTelefone(sc.nextLine());
        
        pm.cadastrarProfessor();
    }
     
     public void listarProfessor(){
         System.out.println("Nome: " + pm.getNome());
         System.out.println("CPF: " + pm.getCpf());
         System.out.println("Codigo: " + pm.getCodigo());
         System.out.println("E-mail: " + pm.getEmail());
         System.out.println("Telefone: " + pm.getTelefone());
     }
     
     public void alterarProfessor() throws SQLException {
        System.out.println("==============================");
        System.out.println("========== Professor =============");
        System.out.println("==============================");

        pm.listarProfessor();

        System.out.print("Codigo para editar as informações: ");
        pm.setCodigo(sc.nextLine());

        System.out.print("Nome: ");
        pm.setNome(sc.nextLine());
        System.out.print("CPF: ");
        pm.setCpf(sc.nextLine());
        System.out.print("Codigo: ");
        pm.setCodigo(sc.nextLine());
        System.out.print("E-mail: ");
        pm.setEmail(sc.nextLine());
        System.out.print("Telefone: ");
        pm.setTelefone(sc.nextLine());

        pm.alterarProfessor();
    }
     
     public void pesquisarProfessor() {
        System.out.println("==============================");
        System.out.println("========== PROFESSOR =============");
        System.out.println("==============================");

        System.out.print("Nome do Professor: ");
        pm.setNome(sc.nextLine());

        pm.pesquisarProfessor();
    }
     
     public void apagarProfessor() throws SQLException {
        System.out.println("==============================");
        System.out.println("========== PROFESSOR =============");
        System.out.println("==============================");
        
        pm.listarProfessor();
        
        System.out.print("Codigo do Professor para apagar: ");
        pm.setCodigo(sc.nextLine());
        
        pm.apagarProfessor();
    }

    private void alterarProfessorView() {
        System.out.println("==============================");
        System.out.println("========== PROFESSOR =============");
        System.out.println("==============================");

        pm.listarProfessor();

        System.out.print("Professor para editar as informações: ");
        pm.setCodigo(sc.nextLine());

        System.out.print("Nome: ");
        pm.setNome(sc.nextLine());
        System.out.print("CPF: ");
        pm.setCpf(sc.nextLine());
        System.out.print("Codigo: ");
        pm.setCodigo(sc.nextLine());
        System.out.print("Telefone: ");
        pm.setTelefone(sc.nextLine());

        pm.alterarProfessor();
    }

    private void apagarProfessorView() {
        System.out.println("==============================");
        System.out.println("========== PROFESSOR =============");
        System.out.println("==============================");
        
        pm.listarProfessor();
        
        System.out.print("Codigo do Professor para apagar: ");
        pm.setCodigo(sc.nextLine());
        
        pm.apagarProfessor();
    }

    private void pesquisarProfessorView() {
        System.out.println("==============================");
        System.out.println("========== PROFESSOR =============");
        System.out.println("==============================");

        System.out.print("Nome do Professor: ");
        pm.setNome(sc.nextLine());

        pm.pesquisarProfessor();
    }
}
