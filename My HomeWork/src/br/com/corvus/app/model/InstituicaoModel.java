/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corvus.app.model;

import java.sql.SQLException;
import br.com.corvus.app.conn.ConnectionSQLite;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author waleson_melo
 */
public class InstituicaoModel {

    private int codigo;
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
                    + "codigo, nome, observações)"
                    + " VALUES ("
                    + "'" + getCodigo() + "',"
                    + "'" + getNome() + "',"
                    + "'" + getObservacoes() + "')");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void listarInstituicao(){

    }

    public void alterarInstituicao() {

    }

    public void pesquisarInstituicao() {

    }

    public void apagarInstituicao() {

    }
}
