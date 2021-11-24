/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corvus.app.model;

import br.com.corvus.app.conn.ConnectionSQLite;
import java.sql.ResultSet;

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
            this.conn.stm.executeUpdate("INSERT INTO Atividade ("
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
    
    public void alterarAtividade() {
        try {
            this.conn.stm = this.conn.conn.createStatement();

            // Alterando
            this.conn.stm.executeUpdate("UPDATE Atividade SET "
                    + "nome = '" + getNome() + "',"
                    + "codigoMateria = '" + getCodigoMateria()+ "',"
                    + "nomeMateria = '" + getNomeMateria()+ "',"
                    + "data = '" + getData()+ "',"
                    + "nota= '" + getNota()+ "',"
                    + "status = '" + getStatus()+ "',"
                    + "tipo = '" + getTipo()+ "'"
                    + "WHERE codigo = '" + getCodigo() + "'");

        } catch (Exception e) {
            System.out.println("erro ao alterar atividade: " + e);
        }
    }
    
    public void apagarAtividade() {
        try {
            this.conn.stm = this.conn.conn.createStatement();
            int x = this.conn.stm.executeUpdate("DELETE FROM Atividade "
                    + "WHERE codigo = '" + getCodigo() + "'");

            if (x == 1) {
                System.out.println("atividade apagada com sucesso");
            } else {
                System.out.println("atividade nao apagada, verifique o codigo da atividade");
            }
        } catch (Exception e) {
            System.out.println("erro ao apagar atividade: " + e);
        }
    }
    
    public void pesquisarAtividade() {
        ResultSet rs;
        try {
            this.conn.stm = this.conn.conn.createStatement();
            rs = this.conn.stm.executeQuery("SELECT * FROM Atividade "
                    + "WHERE nome = '" + getNome() + "'");

            if (!rs.next()) {
                System.out.println("Atividade não encontrada.");
            } else {
                System.out.print("|Codigo: " + rs.getString("codigo") + ", ");
                System.out.print("Nome: " + rs.getString("nome") + ", ");
                System.out.print("Codigo Materia: " + rs.getString("codigoMateria") + ", ");
                System.out.print("Materia: " + rs.getString("nomeMateria") + ", ");
                System.out.print("Data: " + rs.getString("data") + ", ");
                System.out.print("Nota: " + rs.getFloat("nota") + ", ");
                System.out.print("Status: " + rs.getString("status") + ", ");
                System.out.print("Tipo: " + rs.getString("tipo") + "");
                System.out.println("");
            }

        } catch (Exception e) {
            System.out.println("erro ao pesquisar atividade: " + e);
        }
    }
    
    public void listarAtividades() {
        ResultSet rs;
        try {
            this.conn.stm = this.conn.conn.createStatement();
            rs = this.conn.stm.executeQuery("SELECT * FROM Atividade ORDER BY data");

            while (rs.next()) {
                System.out.print("|Codigo: " + rs.getString("codigo") + ", ");
                System.out.print("Nome: " + rs.getString("nome") + ", ");
                System.out.print("Codigo Materia: " + rs.getString("codigoMateria") + ", ");
                System.out.print("Materia: " + rs.getString("nomeMateria") + ", ");
                System.out.print("Data: " + rs.getString("data") + ", ");
                System.out.print("Nota: " + rs.getFloat("nota") + ", ");
                System.out.print("Status: " + rs.getString("status") + ", ");
                System.out.print("Tipo: " + rs.getString("tipo") + ", ");
                System.out.println("");
            }

        } catch (Exception e) {
            System.out.println("erro ao listar materias: " + e);
        }
    }
   
}
