/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zainb.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import zainb.connection.ConnectDB;
import zainb.entity.restaurant;

/**
 *
 * @author Rimeh
 */
public class restaurantservice {
    private Connection c;
    private PreparedStatement ps1;
    private Statement st;
    private ResultSet rs;

    public restaurantservice() {
        c = ConnectDB.getInstance().getConnection();
    }
    public List<restaurant> readAll() {
        List<restaurant> evs = new ArrayList<>();
        try {
            Statement stm = c.createStatement();
            ResultSet rest
                    = stm.executeQuery("select * from restaurant  ");
            while (rest.next()) {
                restaurant ev = new restaurant();
              //  ev.setIdR(rest.getInt("idR"));
                ev.setNomR(rest.getString("nom"));

               
                ev.setLieuR(rest.getString("lieu"));
                ev.setSpecialite(rest.getString("specialite"));

                evs.add(ev);

            }

        } catch (SQLException ex) {
            Logger.getLogger(restaurantservice.class.getName()).log(Level.SEVERE, null, ex);
        }

        return evs;
    }

}
