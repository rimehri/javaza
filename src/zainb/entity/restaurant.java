/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zainb.entity;

/**
 *
 * @author Rimeh
 */
public class restaurant {
    int idR ; 
    String nomR;
    String lieuR ; 
    String specialite;

    public restaurant() {
    }

    public restaurant(String nomR, String lieuR, String specialite) {
        this.nomR = nomR;
        this.lieuR = lieuR;
        this.specialite = specialite;
    }

    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }

    public String getNomR() {
        return nomR;
    }

    public void setNomR(String nomR) {
        this.nomR = nomR;
    }

    public String getLieuR() {
        return lieuR;
    }

    public void setLieuR(String lieuR) {
        this.lieuR = lieuR;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public restaurant(String lieuR) {
        this.lieuR = lieuR;
    }
    
}
