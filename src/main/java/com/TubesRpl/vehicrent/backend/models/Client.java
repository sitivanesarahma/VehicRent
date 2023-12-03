package com.TubesRpl.vehicrent.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Client")
public class Client {

    @Id
    @ManyToOne
    @JoinColumn(name = "NIK_User", referencedColumnName = "NIK_User")
    private User NIK_User;

    @Column
    private String NoSIM;

    @ManyToOne
    @JoinColumn(name = "ID_Rekomendasi", referencedColumnName = "ID_Rekomendasi")
    private Rekomendasi rekomendasi;
    
}
