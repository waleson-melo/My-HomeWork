/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corvus.app.model;

import br.com.corvus.app.conn.ConnectionSQLite;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mcamb
 */
public class ProfessorModel extends PessoaModel{
    private String codigo;
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
    
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
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
    
    /**
     *
     * @throws SQLException
     */
    //==========================================================================
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
        ResultSet rs;
        try {
            this.conn.stm = this.conn.conn.createStatement();

            // Alterando
            this.conn.stm.executeUpdate("UPDATE Professor SET "
                    + "nome = '" + getNome() + "',"
                    + "cpf = '" + getCpf() + "',"
                    + "e-mail = '" + getEmail() + "',"
                    + "telefone = '" + getTelefone() + "'"
                    + "WHERE codigo = '" + getCodigo() + "'");

        } catch (Exception e) {
            System.out.println("erro ao alterar Professor: " + e);
        }
    }
  
    public void pesquisarProfessor(){
        ResultSet rs;
        try {
            this.conn.stm = this.conn.conn.createStatement();
            rs = this.conn.stm.executeQuery("SELECT * FROM Professor "
                    + "WHERE nome = '" + getNome() + "'");

            if (!rs.next()) {
                System.out.println("Professor não encontrada.");
            } else {
                System.out.print("|Codigo: " + rs.getString("codigo") + ", ");
                System.out.print("Nome: " + rs.getString("nome") + ", ");
                System.out.print("CPF: " + rs.getString("cpf") + ", ");
                System.out.print("E-mail: " + rs.getString("email") + ", ");
                System.out.print("Telefone: " + rs.getString("telefone") + ", ");
                System.out.println("");
            }

        } catch (Exception e) {
            System.out.println("erro ao listar professor: " + e);
        }
    }
    public void apagarProfessor(){
        try {
            this.conn.stm = this.conn.conn.createStatement();
            int x = this.conn.stm.executeUpdate("DELETE FROM Professor "
                    + "WHERE codigo = '" + getCodigo() + "'");

            if (x == 1) {
                System.out.println("Professor apagado com sucesso");
            } else {
                System.out.println("Professor nao apagado, verifique o codigo do professor");
            }
        } catch (Exception e) {
            System.out.println("erro ao listar professor: " + e);
        }
    }
    
    public void listarProfessor(){
        ResultSet rs;
        try {
            this.conn.stm = this.conn.conn.createStatement();
            rs = this.conn.stm.executeQuery("SELECT * FROM Professor ORDER BY nome");

            while (rs.next()) {
                System.out.print("Nome: " + rs.getString("nome") + ", ");
                System.out.print("CPF: " + rs.getString("cpf") + ", ");
                System.out.print("Codigo: " + rs.getString("codigo") + ", ");
                System.out.print("Professor: " + rs.getString("email") + ", ");
                System.out.print("Telefone: " + rs.getString("telefone") + ", ");
                System.out.println("");
            }

        } catch (Exception e) {
            System.out.println("erro ao listar professor: " + e);
        }
    }
}
