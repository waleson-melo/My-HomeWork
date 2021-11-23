/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.corvus.app.view;

import br.com.corvus.app.model.ProfessorModel;
import java.util.Scanner;

/**
 *
 * @author mcamb
 */
public class ProfessorView {
    
    Scanner sc = new Scanner(System.in);
    
    ProfessorModel pm = new ProfessorModel();
    
    public void menuProfessorView(){
        int opcao = -1;
        
        OUTER:
        while(true){
            System.out.println("===============================");
            System.out.println("=========|  Professor  |=========");
            System.out.println("===============================");

            System.out.println("(1) Cadastrar");
            System.out.println("(2) Alterar Dados");
            System.out.println("(3) Apagar");
            System.out.println("(4) Pesquisar");
            System.out.println("(5) Listar");
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
                    break;
                case 3:
                    break;
                case 4:
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
    
     public void cadastrarProfessorView(){
         
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==============================");
        System.out.println("========== Professor =============");
        System.out.println("==============================");
        System.out.print("Nome: ");
        pm.setNome(sc.nextLine());
        System.out.print("CPF: ");
        pm.setCpf(sc.nextLine());
        System.out.print("Codigo : ");
        pm.setCodigo(sc.nextInt());
        System.out.print("E-mail: ");
        pm.setEmail(sc.nextLine());
        System.out.println("Telefone: ");
        pm.setTelefone(sc.nextLine());
        
        pm.cadastrarProfessor();
    }
     
     public void listarProfessor(){
         Sysout.out.println("Nome: " + pm.getNome);
         Sysout.out.println("CPF: " + pm.getCpf);
         Sysout.out.println("Codigo: " + pm.getCodigo);
         Sysout.out.println("E-mail: " + pm.getEmail);
         Sysout.out.println("Telefone: " + pm.getTelefone);
     }
}
