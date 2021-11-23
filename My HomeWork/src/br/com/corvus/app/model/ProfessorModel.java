/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corvus.app.model;

import br.com.corvus.app.conn.ConnectionSQLite;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mcamb
 */
public class ProfessorModel extends PessoaModel{
    private int codigo;
    private String email;

    ConnectionSQLite conn;

    public ProfessorModel() {
        try {
            this.conn = new ConnectionSQLite();
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfessorModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
  
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void cadastrarProfessor() throws SQLException{
        try {
            this.conn.stm = this.conn.conn.createStatement();
            this.conn.stm.executeUpdate("INSERT INTO Professor ("
                    + "nome, codigo, cpf,  telefone," + "email)"
                    + " VALUES ("
                    + "'" + getNome() + "',"
                    + "'" + getCodigo() + "',"
                    + "'" + getCpf() + "',"
                    + "'" + getTelefone() + "',"
                    + "'" + getEmail() + "')");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void alterarProfessor(){
        
    }
  
    public void pesquisarProfessor(){
        
    }
    public void apagarProfessor(){
        
    }
    
    public void listarProfessor(){
        
    }
}
