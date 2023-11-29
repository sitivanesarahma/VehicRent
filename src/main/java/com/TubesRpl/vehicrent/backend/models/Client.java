package com.TubesRpl.vehicrent.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Client {

    @Id
    @ManyToOne
    @JoinColumn(name = "NIK_User", referencedColumnName = "NIK_User")
    private User NIK_User;

    @Column
    private String NoSIM;

    @Column
    private Rekomendasi rekomendasi;
    
}
