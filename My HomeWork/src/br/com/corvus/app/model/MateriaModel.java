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
 * @author waleson_melo
 */
public class MateriaModel {

    private String codigo;
    private String nome;
    private String cargaHoraria;
    private String codigoProfessor;
    private String professorNome;
    private String status;

    ConnectionSQLite conn;

    public MateriaModel() {
        try {
            this.conn = new ConnectionSQLite();
        } catch (SQLException ex) {
            Logger.getLogger(MateriaModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MateriaModel.class.getName()).log(Level.SEVERE, null, ex);
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
     * @return the cargaHoraria
     */
    public String getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * @return the codigoProfessor
     */
    public String getCodigoProfessor() {
        return codigoProfessor;
    }

    /**
     * @param codigoProfessor the codigoProfessor to set
     */
    public void setCodigoProfessor(String codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    /**
     * @return the professorNome
     */
    public String getProfessorNome() {
        return professorNome;
    }

    /**
     * @param professorNome the professorNome to set
     */
    public void setProfessorNome(String professorNome) {
        this.professorNome = professorNome;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    //==========================================================================
    public void cadastrarMateria() throws SQLException {
        try {
            this.conn.stm = this.conn.conn.createStatement();
            this.conn.stm.executeUpdate("INSERT INTO materia ("
                    + "nome, cargaHoraria, codigoProfessor, professorNome,"
                    + "status)"
                    + " VALUES ("
                    + "'" + getNome() + "',"
                    + "'" + getCargaHoraria() + "',"
                    + "'" + getCodigoProfessor() + "',"
                    + "'" + getProfessorNome() + "',"
                    + "'" + getStatus() + "')");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void alterarMateria() {

    }

    public void pesquisarMateria() {

    }

    public void apagarMateria() {

    }

    public void listarMaterias() {

    }
}
