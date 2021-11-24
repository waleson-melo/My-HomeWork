/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corvus.app.model;

import java.sql.SQLException;
import br.com.corvus.app.conn.ConnectionSQLite;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author waleson_melo
 */
public class InstituicaoModel {

    private String codigo;
    private String nome;
    private String observacoes;
    
    ConnectionSQLite conn;
    
    public InstituicaoModel() {
        try {
            this.conn = new ConnectionSQLite();
        } catch (SQLException ex) {
            Logger.getLogger(InstituicaoModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InstituicaoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @return the codigo
     */
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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    //==========================================================================
  public void cadastrarInstituicao() throws SQLException {
        try {
            this.conn.stm = this.conn.conn.createStatement();
            this.conn.stm.executeUpdate("INSERT INTO instituição ("
                    + "codigo, nome, observacoes)"
                    + " VALUES ("
                    + "'" + getCodigo() + "',"
                    + "'" + getNome() + "',"
                    + "'" + getObservacoes() + "')");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
  
    public void alterarInstituicao() {
        ResultSet rs;
        try {
            this.conn.stm = this.conn.conn.createStatement();

            // Alterando
            this.conn.stm.executeUpdate("UPDATE instituicao SET "
                    + "codigo = '" + getCodigo() + "',"
                    + "nome = '" + getNome() + "',"
                    + "observacoes = '" + getObservacoes() + "'");

        } catch (Exception e) {
            System.out.println("Erro ao alterar instituição: " + e);
        }
    }

    public void pesquisarInstituicao() {
        ResultSet rs;
        try {
            this.conn.stm = this.conn.conn.createStatement();
            rs = this.conn.stm.executeQuery("SELECT * FROM instituicao "
                    + "WHERE nome = '" + getNome() + "'");

            if (!rs.next()) {
                System.out.println("Instituição não encontrada");
            } else {
                while (rs.next()) {
                    System.out.print("|Codigo: " + rs.getString("codigo") + ", ");
                    System.out.print("Nome: " + rs.getString("nome") + ", ");
                    System.out.print("Observações: " + rs.getString("observacoes") + ", ");
                    System.out.println("");
                }
            }

        } catch (Exception e) {
            System.out.println("erro ao listar instituições: " + e);
        }
    }

    public void apagarInstituicao() {
        try {
            this.conn.stm = this.conn.conn.createStatement();
            int x = this.conn.stm.executeUpdate("DELETE FROM instituicao "
                    + "WHERE codigo = '" + getCodigo() + "'");

            if (x == 1) {
                System.out.println("instituição apagada com sucesso");
            } else {
                System.out.println("instituição nao apagada, verifique o codigo da materia");
            }
        } catch (Exception e) {
            System.out.println("erro ao listar instituições: " + e);
        }
    }

    public void listarInstituicao() throws SQLException {
        ResultSet rs;
        try {
            this.conn.stm = this.conn.conn.createStatement();
            rs = this.conn.stm.executeQuery("SELECT * FROM instituicao ORDER BY nome");

            while (rs.next()) {
                System.out.print("|Codigo: " + rs.getString("codigo") + ", ");
                System.out.print("Nome: " + rs.getString("nome") + ", ");
                System.out.print("Observações: " + rs.getString("observacoes") + ", ");
                System.out.println("");
            }

        } catch (Exception e) {
            System.out.println("erro ao listar instituicoes: " + e);
        }

    }

}
