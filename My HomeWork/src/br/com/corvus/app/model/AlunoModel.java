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
 * @author caroi
 */
public class AlunoModel extends PessoaModel{
    
    private int matrícula;
    private String email;
    
    ConnectionSQLite conn;

    public AlunoModel() {
        try {
            this.conn = new ConnectionSQLite();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AlunoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
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
    
    public void cadastrarAluno() throws SQLException {
        try {
            this.conn.stm = this.conn.conn.createStatement();
            this.conn.stm.executeUpdate("INSERT INTO aluno ("
                    + "nome, matricula, cpf, telefone, email,"
                    + "status)"
                    + " VALUES ("
                    + "'" + getNome() + "',"
                    + "'" + getMatricula() + "',"
                    + "'" + getCpf() + "',"
                    + "'" + getTelefone() + "',"
                    + "'" + getEmail() + "')");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
