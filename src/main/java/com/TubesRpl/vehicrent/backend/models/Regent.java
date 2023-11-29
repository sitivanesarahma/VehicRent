package com.TubesRpl.vehicrent.backend.models;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Regent")
public class Regent {

    @Id
    @ManyToOne
    @JoinColumn(name = "NIK_User", referencedColumnName = "NIK_User")
    private User NIK_User;

    @Column
    private String Norek_Regent;

    @Column(name = "listKendaraan")
    @OneToMany(mappedBy = "regent", cascade = CascadeType.ALL)
    private List<Kendaraan> listKendaraan;

    public Regent(User nIK_User, String norek_Regent, List<Kendaraan> listKendaraan) {
        NIK_User = nIK_User;
        Norek_Regent = norek_Regent;
        this.listKendaraan = listKendaraan;
    }

    public User getNIK_User() {
        return NIK_User;
    }

    public void setNIK_User(User nIK_User) {
        NIK_User = nIK_User;
    }

    public String getNorek_Regent() {
        return Norek_Regent;
    }

    public void setNorek_Regent(String norek_Regent) {
        Norek_Regent = norek_Regent;
    }

    public List<Kendaraan> getListKendaraan() {
        return listKendaraan;
    }

    public void setListKendaraan(List<Kendaraan> listKendaraan) {
        this.listKendaraan = listKendaraan;
    }

    
    
}
