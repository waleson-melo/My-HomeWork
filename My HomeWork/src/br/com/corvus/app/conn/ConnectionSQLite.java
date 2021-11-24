package br.com.corvus.app.conn;

import java.sql.*;

/**
 *
 * @author waleson_melo
 */
public class ConnectionSQLite {

    public Connection conn;
    public Statement stm;

    public ConnectionSQLite() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");

        this.conn = DriverManager.getConnection("jdbc:sqlite:dbsistema.db");
        this.stm = this.conn.createStatement();
    }

    public void initDB() {
        try {

            this.stm.executeUpdate("CREATE TABLE IF NOT EXISTS \"Materia\" ("
                    + " \"codigo\"	INTEGER NOT NULL UNIQUE,\n"
                    + "	\"nome\"	TEXT NOT NULL UNIQUE,\n"
                    + "	\"cargaHoraria\"	TEXT NOT NULL,\n"
                    + "	\"codigoProfessor\"	TEXT NOT NULL,\n"
                    + "	\"professorNome\"	TEXT,\n"
                    + "	\"status\"	TEXT,\n"
                    + "	PRIMARY KEY(\"codigo\" AUTOINCREMENT)\n"
                    + ");"
            );

            this.stm.executeUpdate("CREATE TABLE IF NOT EXISTS \"Atividade\" (\n"
                    + "	\"codigo\"	INTEGER NOT NULL UNIQUE,\n"
                    + "	\"nome\"	TEXT NOT NULL UNIQUE,\n"
                    + "	\"codigoMateria\"	TEXT NOT NULL,\n"
                    + "	\"nomeMateria\"	TEXT NOT NULL,\n"
                    + "	\"data\"	TEXT NOT NULL,\n"
                    + "	\"nota\"	REAL NOT NULL,\n"
                    + "	\"status\"	TEXT NOT NULL,\n"
                    + "	\"tipo\"	TEXT NOT NULL,\n"
                    + "	PRIMARY KEY(\"codigo\" AUTOINCREMENT)\n"
                    + ");"
            );

            this.stm.executeUpdate("CREATE TABLE IF NOT EXISTS \"Instituicao\" (\n"
                    + "	\"codigo\"	INTEGER NOT NULL UNIQUE,\n"
                    + "	\"nome\"	TEXT NOT NULL UNIQUE,\n"
                    + "	\"observacoes\"	TEXT,\n"
                    + "	PRIMARY KEY(\"codigo\" AUTOINCREMENT)\n"
                    + ");"
            );

            this.stm.executeUpdate("CREATE TABLE IF NOT EXISTS \"Aluno\" (\n"
                    + "	\"matricula\"	TEXT NOT NULL UNIQUE,\n"
                    + "	\"cpf\"         TEXT NOT NULL UNIQUE,\n"
                    + "	\"email\"	TEXT NOT NULL,\n"
                    + "	\"telefone\"	TEXT NOT NULL\n"
                    + ");"
            );

            this.stm.executeUpdate("CREATE TABLE IF NOT EXISTS \"Professor\" (\n"
                    + "	\"codigo\"	TEXT NOT NULL UNIQUE,\n"
                    + "	\"cpf\"	TEXT NOT NULL UNIQUE,\n"
                    + "	\"nome\"	TEXT NOT NULL,\n"
                    + "	\"telefone\"	TEXT NOT NULL,\n"
                    + "	\"email\"	TEXT NOT NULL\n"
                    + ");"
            );

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
