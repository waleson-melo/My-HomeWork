/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corvus.app.view;
import br.com.corvus.app.model.InstituicaoModel;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author marip
 */
public class InstituicaoView {
    Scanner sc = new Scanner(System.in);
    
    InstituicaoModel im = new InstituicaoModel();
    
    public void menuInstituicaoView() throws SQLException{
        int opcao = -1;
        
        OUTER:
        while(true){
            System.out.println("===============================");
            System.out.println("=========|  Instituição  |=========");
            System.out.println("===============================");

            System.out.println("(1) Cadastrar Instituição ");
            System.out.println("(2) Alterar Dados (Instituição )");
            System.out.println("(3) Listar Instituição Cadastradas");

            System.out.println("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());
            
            switch (opcao) {
                case 0:
                    break OUTER;
                case 1:
                    cadastrarInstituicaoView();
                    break;
                case 2:
                    break;
                case 3:
                    listarInstituicao();
                    break;
                default:
                    System.out.println("Opção invalida.");
                    break;
            }
        }
    } 
   
}
