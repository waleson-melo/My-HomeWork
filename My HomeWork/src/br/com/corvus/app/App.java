/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corvus.app;

import br.com.corvus.app.view.MenusView;
import java.util.Scanner;

/**
 *
 * @author waleson_melo
 */
public class App {
    public static void main(String[] args) {
        int opcao = -1;
        
        Scanner sc = new Scanner(System.in);
        MenusView mv = new MenusView();
        
        while(true){
            
            opcao = Integer.parseInt(sc.nextLine());
            
            if(opcao == 0){
                break;
            }
            
            if(opcao == 1){
                
            }
        }
    }
}
