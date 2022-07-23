package com.company.dao;

import com.company.db.ConnectionFactory;
import com.company.entity.TelefonEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TelefonDao {

    private Connection connection;

    public TelefonDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public TelefonEntity createTelefon(TelefonEntity telefonEntity) {

        String sqlQuery = "INSERT INTO telefon(seri_no, model,marka) " +
                "VALUES(?,?,?)";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sqlQuery);
            ps.setString(1, telefonEntity.getSeriNo());
            ps.setString(2, telefonEntity.getModel());
            ps.setString(3, telefonEntity.getMarka());

            ps.execute();
            ps.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());

        }
        return telefonEntity;
    }

    public Boolean deleteTelefon(Long telefonId) {
        String sqlQuery = "DELETE FROM telefon WHERE id = ?";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sqlQuery);
            ps.setLong(1, telefonId);
            ps.execute();
            ps.close();
            return Boolean.TRUE;
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            return Boolean.FALSE;
        }
    }

    public TelefonEntity updateTelefon(TelefonEntity telefonEntity, Long telefonId) {
        String sqlQuery = "UPDATE telefon SET seri_no=?,model=?, marka=? Where id=?";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sqlQuery);
            ps.setString(1, telefonEntity.getSeriNo());
            ps.setString(2, telefonEntity.getModel());
            ps.setString(3, telefonEntity.getMarka());
            ps.setLong(4, telefonId);

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            
        }

        return telefonEntity;
        
    }

    public TelefonEntity findTelefonById(Long telefonId) {

        TelefonEntity telefon = new TelefonEntity();
        String sqlQuery = "SELECT * FROM telefon WHERE id=?";

        try {

            PreparedStatement ps = this.connection.prepareStatement(sqlQuery);
            ps.setLong(1, telefonId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                telefon.setId(rs.getLong("id"));
                telefon.setSeriNo(rs.getString("seri_no"));
                telefon.setModel(rs.getString("model"));
                telefon.setMarka(rs.getString("marka"));
            }
            ps.close();

        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return telefon;
    }

    public List<TelefonEntity> findAll() {

        List<TelefonEntity> telefonEntityList = new ArrayList<>();

        String sqlQuery = "SELECT * FROM telefon";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sqlQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TelefonEntity telefon = new TelefonEntity();
                telefon.setId(rs.getLong("id"));
                telefon.setSeriNo(rs.getString("seri_no"));
                telefon.setModel(rs.getString("model"));
                telefon.setMarka(rs.getString("marka"));
                telefonEntityList.add(telefon);
            }
            ps.close();


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }



        return telefonEntityList;
    }

}
