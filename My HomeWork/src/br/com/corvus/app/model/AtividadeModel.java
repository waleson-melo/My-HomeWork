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
public class AtividadeModel {
    
    private int código;
    private String nome;
    private int códigoNome;
    private String matériaNome;
    private date data;
    private float nota;
    private String status;
    private String tipo;
    
    public int getCódigo(){
        return código;
    }
    
    public void setCódigo( int código ){
        this.código = código;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome( String nome ){
        this.nome = nome;
    }
    
    public int getCódigoNome (){
        return códigoNome;
    }
    
    public void setCódigoNome ( int códigoNome ){
        this.códigoNome = códigoNome;
    }
    
    public String getMatériaNome (){
        return matériaNome;
    } 
    
    public void setMatériaNome ( String matériaNome ){
        this.matériaNome = matériaNome;
    }
    
    public date getData (){
        return data;
    }
    
    public void setData ( date data ){
        this.data = data;
    }
    
    public String getStatus (){
        return status;
    }
    
    public void setStatus ( String status ){
        this.status = status;
    }
    
    public String getTipo (){
        return tipo;
    }
    
    public void setTipo ( String tipo ){
        this.tipo = tipo;
    }
   
}
