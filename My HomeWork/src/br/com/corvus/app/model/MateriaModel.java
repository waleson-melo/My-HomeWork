/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corvus.app.model;

/**
 *
 * @author waleson_melo
 */
public class MateriaModel {

    private int codigo;
    private String nome;
    private String cargaHoraria;
    private int codigoProfessor;
    private String professorNome;
    private String status;

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
    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    /**
     * @param codigoProfessor the codigoProfessor to set
     */
    public void setCodigoProfessor(int codigoProfessor) {
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
    public void cadastrarMateria() {

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
