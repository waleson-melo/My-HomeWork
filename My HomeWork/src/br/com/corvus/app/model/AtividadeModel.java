/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corvus.app.model;

import br.com.corvus.app.conn.ConnectionSQLite;

/**
 *
 * @author caroi
 */
public class AtividadeModel {
    
    private String codigo;
    private String nome;
    private String codigoMateria;
    private String nomeMateria;
    private String data;
    private float nota;
    private String status;
    private String tipo;
    
    ConnectionSQLite conn;
    
    public AtividadeModel(){
        try {
            this.conn = new ConnectionSQLite();
        } catch (Exception e) {
        }
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo( String codigo ){
        this.codigo = codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome( String nome ){
        this.nome = nome;
    }
    
    public String getCodigoMateria (){
        return codigoMateria;
    }
    
    public void setCodigoMateria ( String codigoMateria ){
        this.codigoMateria = codigoMateria;
    }
    
    public String getNomeMateria (){
        return nomeMateria;
    } 
    
    public void setNomeMateria ( String nomeMateria ){
        this.nomeMateria = nomeMateria;
    }
    
    public String getData (){
        return data;
    }
    
    public void setData ( String data ){
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
    
    //==========================================================================
    public void cadastrarAtividade() {
        try {
            this.conn.stm = this.conn.conn.createStatement();
            this.conn.stm.executeUpdate("INSERT INTO atividade ("
                    + "nome, codigoMateria, nomeMateria, data,"
                    + "nota, status, tipo)"
                    + " VALUES ("
                    + "'" + getNome() + "',"
                    + "'" + getCodigoMateria()+ "',"
                    + "'" + getNomeMateria()+ "',"
                    + "'" + getData()+ "',"
                    + "'" + getNota()+ "',"
                    + "'" + getStatus()+ "',"
                    + "'" + getTipo()+ "')");
        } catch (Exception e) {
            System.out.println("erro ao inserir atividade: " + e);
        }
    }
   
}
