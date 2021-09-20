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
    public void cadastrarMateriaView(){
        Scanner sc = new Scanner(System.in);
        MateriaModel mm = new MateriaModel();
        
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
}
