/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corvus.app;

import br.com.corvus.app.view.MateriaView;
import br.com.corvus.app.view.AlunoView;
import br.com.corvus.app.view.AtividadeView;
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
        AtividadeView atv = new AtividadeView();
        MenusView mv = new MenusView();
        MateriaView matv = new MateriaView();
        AlunoView alv = new AlunoView();
        
        OUTER:
        while (true) {
            mv.menuPrincipal();
            
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 0:
                    break OUTER;
                case 1:
                    atv.menuAtividadeView();
                    break;
                case 2:
                    matv.menuMateriaView();
                    break;
                case 3:
                    alv.menuAlunoView();
                default:
                    break;
            }
        }
    }
}
