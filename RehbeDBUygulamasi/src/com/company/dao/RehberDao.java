package com.company.dao;

import com.company.db.ConnectionFactory;
import com.company.entity.RehberEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RehberDao {

    private Connection connection; // null

    public RehberDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public RehberEntity findByRehberId(Long rehberId) {

        RehberEntity rehber = new RehberEntity();
        String sqlQuery = "SELECT * FROM rehber WHERE id = ?";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sqlQuery);
            ps.setLong(1, rehberId);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                rehber.setId(rs.getLong("id"));
                rehber.setNumara(rs.getLong("numara"));
                rehber.setTelefonId(rs.getLong("telefon_id"));
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return rehber;
    }

    public RehberEntity createRehber(RehberEntity entity) {

        String sqlQuery = "INSERT INTO rehber(numara,telefon_id) " +
                " VALUES(?,?)";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sqlQuery);
            ps.setLong(1, entity.getNumara());
            ps.setLong(2, entity.getTelefonId());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return entity;
    }

    public Boolean deleteRehber(Long rehberId) {
        String sqlQuery = "DELETE FROM rehber WHERE id = ?";
        try {
            PreparedStatement ps = this.connection.prepareStatement(sqlQuery);
            ps.setLong(1, rehberId);
            ps.execute();
            ps.close();
            return Boolean.TRUE;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return Boolean.FALSE;
        }
    }

}
