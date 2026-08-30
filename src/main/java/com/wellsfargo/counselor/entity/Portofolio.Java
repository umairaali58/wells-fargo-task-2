package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portofolio {
    @Id
    @GeneratedValue
    private Long portofolioId;

    @Column(nullable = false)
    private Long clientId;

    @Column(nullable = false)
    private String CreationDate;

    protected Portofolio() {
    }

    public Portofolio(Long clientId, String CreationDate) {
        this.clientId = clientId;
        this.CreationDate = CreationDate;
    }

    public Long getPortofolioId() {
        return portofolioId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(String CreationDate) {
        this.CreationDate = CreationDate;
    }
}
