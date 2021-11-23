/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corvus.app;

import br.com.corvus.app.view.MateriaView;
import br.com.corvus.app.view.AlunoView;
import br.com.corvus.app.view.InstituicaoView;
import br.com.corvus.app.view.ProfessorView;
import br.com.corvus.app.view.MenusView;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author waleson_melo
 */
public class App {
    public static void main(String[] args) throws SQLException {
        int opcao = -1;
        
        Scanner sc = new Scanner(System.in);
        MenusView mv = new MenusView();
        MateriaView matv = new MateriaView();
        InstituicaoView intv = new InstituicaoView();
        AlunoView alv = new AlunoView();
        ProfessorView pm = new ProfessorView();
        
        OUTER:
        while (true) {
            mv.menuPrincipal();
            
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 0:
                    break OUTER;
                case 1:
                    break;
                case 2:
                    matv.menuMateriaView();
                    break;
                case 3:
                    intv.menuInstituicaoView();
                    break; 
                case 4:
                    pm.menuProfessorView();
                case 5:
                    alv.menuAlunoView();
                default:
                    break;
            }
        }
    }
}
