/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corvus.app.view;

import br.com.corvus.app.model.MateriaModel;
import java.util.Scanner;

/**
 *
 * @author waleson_melo
 */
public class MateriaView {
    Scanner sc = new Scanner(System.in);
    
    MateriaModel mm = new MateriaModel();
    
    public void menuMateriaView(){
        int opcao = -1;
        
        OUTER:
        while(true){
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
                    break;
                case 3:
                    break;
                case 4:
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
    
    public void cadastrarMateriaView(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==============================");
        System.out.println("==========MATERIA=============");
        System.out.println("==============================");
        System.out.print("Nome: ");
        mm.setNome(sc.nextLine());
        System.out.print("Carga Horaria: ");
        mm.setCargaHoraria(sc.nextLine());
        System.out.print("Nome Professor: ");
        mm.setProfessorNome(sc.nextLine());
        System.out.print("Status: ");
        mm.setStatus(sc.nextLine());
    }
    
    public void listarMaterias(){
        System.out.println("Nome: " + mm.getNome());
        System.out.println("Carga Horaria: " + mm.getCargaHoraria());
        System.out.println("Nome Professor: " + mm.getProfessorNome());
        System.out.println("Status: " + mm.getStatus());
        
    }
}
