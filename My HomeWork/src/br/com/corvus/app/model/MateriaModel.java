/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corvus.app.model;

import br.com.corvus.app.conn.ConnectionSQLite;
import java.sql.*;
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
            this.conn.stm.executeUpdate("INSERT INTO Materia ("
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
        ResultSet rs;
        try {
            this.conn.stm = this.conn.conn.createStatement();

            // Alterando
            this.conn.stm.executeUpdate("UPDATE Materia SET "
                    + "nome = '" + getNome() + "',"
                    + "cargaHoraria = '" + getCargaHoraria() + "',"
                    + "codigoProfessor = '" + getCodigoProfessor() + "',"
                    + "professorNome = '" + getProfessorNome() + "',"
                    + "status = '" + getStatus() + "'"
                    + "WHERE codigo = '" + getCodigo() + "'");

        } catch (Exception e) {
            System.out.println("erro ao alterar materia: " + e);
        }
    }

    public void pesquisarMateria() {
        ResultSet rs;
        try {
            this.conn.stm = this.conn.conn.createStatement();
            rs = this.conn.stm.executeQuery("SELECT * FROM Materia "
                    + "WHERE nome = '" + getNome() + "'");

            if (!rs.next()) {
                System.out.println("Materia n??o encontrada.");
            } else {
                System.out.print("|Codigo: " + rs.getString("codigo") + ", ");
                System.out.print("Nome: " + rs.getString("nome") + ", ");
                System.out.print("Carga Horaria: " + rs.getString("cargaHoraria") + ", ");
                System.out.print("Codigo Professor: " + rs.getString("codigoProfessor") + ", ");
                System.out.print("Professor: " + rs.getString("professorNome") + ", ");
                System.out.print("Status: " + rs.getString("status") + ", ");
                System.out.println("");
            }

        } catch (Exception e) {
            System.out.println("erro ao listar materias: " + e);
        }
    }

    public void apagarMateria() {
        try {
            this.conn.stm = this.conn.conn.createStatement();
            int x = this.conn.stm.executeUpdate("DELETE FROM Materia "
                    + "WHERE codigo = '" + getCodigo() + "'");

            if (x == 1) {
                System.out.println("materia apagada com sucesso");
            } else {
                System.out.println("materia nao apagada, verifique o codigo da materia");
            }
        } catch (Exception e) {
            System.out.println("erro ao listar materias: " + e);
        }
    }

    public void listarMaterias() throws SQLException {
        ResultSet rs;
        try {
            this.conn.stm = this.conn.conn.createStatement();
            rs = this.conn.stm.executeQuery("SELECT * FROM Materia ORDER BY nome");

            while (rs.next()) {
                System.out.print("|Codigo: " + rs.getString("codigo") + ", ");
                System.out.print("Nome: " + rs.getString("nome") + ", ");
                System.out.print("Carga Horaria: " + rs.getString("cargaHoraria") + ", ");
                System.out.print("Codigo Professor: " + rs.getString("codigoProfessor") + ", ");
                System.out.print("Professor: " + rs.getString("professorNome") + ", ");
                System.out.print("Status: " + rs.getString("status") + ", ");
                System.out.println("");
            }

        } catch (Exception e) {
            System.out.println("erro ao listar materias: " + e);
        }

    }
}
