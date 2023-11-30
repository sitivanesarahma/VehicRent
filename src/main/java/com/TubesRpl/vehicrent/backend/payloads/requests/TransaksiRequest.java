package com.TubesRpl.vehicrent.backend.payloads.requests;

import com.TubesRpl.vehicrent.backend.models.Kendaraan;
import com.TubesRpl.vehicrent.backend.models.Regent;
import com.TubesRpl.vehicrent.backend.models.Client;

public class TransaksiRequest {
    private int ID_Transaksi;
    private Regent regent;
    private Client client;
    private Kendaraan kendaraan;
    private int Waktu_Pemesanan;
    private double Hargatotal_Pemesanan;
    private String Status_Pemesanan;
    private String virtualAccountNumber;

    public TransaksiRequest(int iD_Transaksi, Regent regent, Client client, Kendaraan kendaraan, int waktu_Pemesanan,
            double hargatotal_Pemesanan, String status_Pemesanan, String virtualAccountNumber) {
        ID_Transaksi = iD_Transaksi;
        this.regent = regent;
        this.client = client;
        this.kendaraan = kendaraan;
        Waktu_Pemesanan = waktu_Pemesanan;
        Hargatotal_Pemesanan = hargatotal_Pemesanan;
        Status_Pemesanan = status_Pemesanan;
        this.virtualAccountNumber = virtualAccountNumber;
    }

    public int getID_Transaksi() {
        return ID_Transaksi;
    }

    public void setID_Transaksi(int iD_Transaksi) {
        ID_Transaksi = iD_Transaksi;
    }

    public Regent getRegent() {
        return regent;
    }

    public void setRegent(Regent regent) {
        this.regent = regent;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public int getWaktu_Pemesanan() {
        return Waktu_Pemesanan;
    }

    public void setWaktu_Pemesanan(int waktu_Pemesanan) {
        Waktu_Pemesanan = waktu_Pemesanan;
    }

    public double getHargatotal_Pemesanan() {
        return Hargatotal_Pemesanan;
    }

    public void setHargatotal_Pemesanan(double hargatotal_Pemesanan) {
        Hargatotal_Pemesanan = hargatotal_Pemesanan;
    }

    public String getStatus_Pemesanan() {
        return Status_Pemesanan;
    }

    public void setStatus_Pemesanan(String status_Pemesanan) {
        Status_Pemesanan = status_Pemesanan;
    }

    public String getVirtualAccountNumber() {
        return virtualAccountNumber;
    }

    public void setVirtualAccountNumber(String virtualAccountNumber) {
        this.virtualAccountNumber = virtualAccountNumber;
    }
}
