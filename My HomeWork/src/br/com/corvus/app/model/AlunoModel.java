/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corvus.app.model;

/**
 *
 * @author caroi
 */
public class AlunoModel {
    
    private int matrícula;
    private String email;
   
    public int getMatricula(){
        return matrícula;
    }
    
    public void setMatricula( int matrícula ){
        this.matrícula = matrícula;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail( String email ){
        this.email = email;
    }
    
}
