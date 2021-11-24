/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corvus.app.model;

import br.com.corvus.app.conn.ConnectionSQLite;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author caroi
 */
public class AlunoModel extends PessoaModel{
    
    private String matrícula;
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
   
    public String getMatricula(){
        return matrícula;
    }
    
    public void setMatricula( String matrícula ){
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
                    + "nome, matricula, cpf,  telefone," + "email)"
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
    public void alterarAluno() {
        ResultSet rs;
        try {
            this.conn.stm = this.conn.conn.createStatement();

            // Alterando
            this.conn.stm.executeUpdate("UPDATE aluno SET "
                    + "nome = '" + getNome() + "',"
                    + "matricula = '" + getMatricula () + "',"
                    + "cpf = '" + getCpf() + "',"
                    + "telefone = '" + getTelefone() + "',"
                    + "WHERE email = '" + getEmail() + "'");

        } catch (Exception e) {
            System.out.println("Erro ao alterar seus dados: " + e);
        }
    }
    public void listarAluno(){

    }
    
}
