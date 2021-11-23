/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corvus.app.view;
import br.com.corvus.app.model.AlunoModel;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author marip
 */
public class AlunoView {
    Scanner sc = new Scanner(System.in);
    
    AlunoModel am = new AlunoModel();
    
    public void menuAlunoView() throws SQLException{
        int opcao = -1;
        
        OUTER:
        while(true){
            System.out.println("===============================");
            System.out.println("=========|  Aluno  |=========");
            System.out.println("===============================");

            System.out.println("(1) Cadastrar Aluno");
            System.out.println("(2) Alterar Dados (Aluno)");
            System.out.println("(3) Listar Materias");

            System.out.println("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());
            
            switch (opcao) {
                case 0:
                    break OUTER;
                case 1:
                    cadastrarAlunoView();
                    break;
                case 2:
                    break;
                case 3:
                    listarAluno();
                    break;
                default:
                    System.out.println("Opção invalida.");
                    break;
            }
        }
    } 
    
    public void cadastrarAlunoView() throws SQLException{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==============================");
        System.out.println("==========ALUNO=============");
        System.out.println("==============================");
        System.out.print("Nome: ");
        am.setNome(sc.nextLine());
        System.out.print("Cpf: ");
        am.setCpf(sc.nextLine());
        System.out.println("Telefone: ");
        am.setTelefone(sc.nextLine());
        System.out.print("Email: ");
        am.setEmail(sc.nextLine());
        System.out.print("Matrícula: ");
        am.setMatricula(sc.nextInt());
        
        am.cadastrarAluno();
    }
    
    public void listarAluno(){
        System.out.println("Nome: " + am.getNome());
        System.out.println("Cpf: " + am.getCpf());
        System.out.println("Telefone: " + am.getTelefone());
        System.out.println("Email: " + am.getEmail());
        System.out.println("Matrícula: " + am.getMatricula());
    }
    
}
