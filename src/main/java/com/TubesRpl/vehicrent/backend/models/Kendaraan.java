package com.TubesRpl.vehicrent.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Kendaraan")
public class Kendaraan {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Kendaraan;

    @ManyToOne
    @JoinColumn(name = "NIK_User")
    private Regent regent;

    @Column
    private String jenis_Kendaraan;

    @Column
    private String Nopol_Kendaraan;

    @Column
    private String Merk_Kendaraan;

    @Column
    private int Tahun_Kendaraan;

    @Column
    private String Warna_Kendaraan;

    @Column
    private String NoSTNK_Kendaraan;

    @Column
    private String Kapasitas_Kendaraan;

    @Column
    private String NoMesin_Kendaraan;

    @Column
    private int HargaSewa_Kendaraan;

    @Column
    private int MaksimalWaktu_Peminjaman;

    @Column
    private String Status_Kendaraan;

    @Column
    private String Status_ValidasiKendaraan;

    public Kendaraan(int iD_Kendaraan, Regent regent, String jenis_Kendaraan, String nopol_Kendaraan,
            String merk_Kendaraan, int tahun_Kendaraan, String warna_Kendaraan, String noSTNK_Kendaraan,
            String kapasitas_Kendaraan, String noMesin_Kendaraan, int hargaSewa_Kendaraan, int maksimalWaktu_Peminjaman,
            String status_Kendaraan, String status_ValidasiKendaraan) {
        ID_Kendaraan = iD_Kendaraan;
        this.regent = regent;
        this.jenis_Kendaraan = jenis_Kendaraan;
        Nopol_Kendaraan = nopol_Kendaraan;
        Merk_Kendaraan = merk_Kendaraan;
        Tahun_Kendaraan = tahun_Kendaraan;
        Warna_Kendaraan = warna_Kendaraan;
        NoSTNK_Kendaraan = noSTNK_Kendaraan;
        Kapasitas_Kendaraan = kapasitas_Kendaraan;
        NoMesin_Kendaraan = noMesin_Kendaraan;
        HargaSewa_Kendaraan = hargaSewa_Kendaraan;
        MaksimalWaktu_Peminjaman = maksimalWaktu_Peminjaman;
        Status_Kendaraan = status_Kendaraan;
        Status_ValidasiKendaraan = status_ValidasiKendaraan;
    }

    
    

    

    
}
