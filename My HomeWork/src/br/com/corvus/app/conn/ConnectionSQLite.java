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
            // Remove e cria a tabela a cada execução. Mero exemplo

            this.stm.executeUpdate("DROP TABLE IF EXISTS pessoas");

            this.stm.executeUpdate("CREATE TABLE pessoas ("
                    + "nome varchar(70) PRIMARY KEY NOT NULL,"
                    + "idade integer);");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
