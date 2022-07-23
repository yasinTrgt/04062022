package com.company.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    // Veritabanı bağlantısı için gerekli olan JDBS url adresi
    private final static String url = "jdbc:postgresql://abul.db.elephantsql.com:5432/dbutpygj";

    // Veritabanı kulanıcı adı
    private final static String username = "dbutpygj";

    //Veritabanı kullanıcı şifresi
    private final static String password = "T5WYg7HPVby1uGmM-zwsxYbvSwClfRXI";


    public Connection getConnection() {

        // Boş bağlantı nesnesi
        Connection connection = null;

        /**
         * Kullanmış olduğumuz Postgresql driver i varmı yok mu kontrol et
         */
        try {
            Class.forName("org.postgresql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        }


        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("DB bağlantısı başarılı");
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());

        }
        return connection;

    }
}
