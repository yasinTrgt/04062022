package com.company.dao;

import com.company.db.ConnectionFactory;
import com.company.entity.UserEntity;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    //Bağlantı oluşturmak için gerekli nesne
    private Connection connection;

    public UserDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    // Vertabanına UserEntity yapısına göre veri ekler
    public UserEntity insertUser(UserEntity userEntity) {

        String sqlString = "INSERT INTO users(username,password) " +
                " VALUES(?,?)";

        // Parametrik olarak veri girilmesine olanak sağlar
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sqlString);
            stmt.setString(1, userEntity.getUsername());
            stmt.setString(2, userEntity.getPassword());

            //SQL i sunucuya gönder
            stmt.execute();

            //Sunucu bağlantısını sonlandır
            stmt.close();

        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }

        return userEntity;
    }


    // Kullanıcı silme
    public Boolean deleteUser(Long userId) {
        String sqlQuery = "DELETE FROM users Where id = ?";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sqlQuery);
            stmt.setLong(1, userId);
            stmt.execute();
            stmt.close();
            return Boolean.TRUE;
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            return Boolean.FALSE;
        }
    }

    public List<UserEntity> getAllUsers() {

        List<UserEntity> userEntityList = new ArrayList<>();
        String sqlQuery = "SELECT  * FROM users";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sqlQuery);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                UserEntity user = new UserEntity();
                user.setId(rs.getLong("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));

                userEntityList.add(user);
            }

        } catch (SQLException exception) {
            System.out.println(exception.getMessage());

        }

        return userEntityList;
    }


    public UserEntity updateUser(UserEntity user, Long userId) {
        String sqlQuery = "UPDATE users SET username=?, password=? Where id=?";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sqlQuery);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setLong(3, userId);

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return user;
    }


    public UserEntity findById(Long userId) {

        UserEntity user = new UserEntity();

        String sqlQuery = "SELECT  * FROM users where id =?";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sqlQuery);
            stmt.setLong(1, userId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                user.setId(rs.getLong("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }

        } catch (SQLException exception) {
            System.out.println(exception.getMessage());

        }
        return user;

    }

}
