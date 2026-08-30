package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {
    @Id
    @GeneratedValue
    private Long securityId;
    
    @Column(nullable = false)
    private Long portofolioId;

    @Column(nullable = false)
    private String securityName;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Double purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private Double securityQuantity;

    protected Security() {
    }

    public Security(Long portofolioId, String securityName, String category, Double purchasePrice, Date purchaseDate, Double securityQuantity) {
        this.portofolioId = portofolioId;
        this.securityName = securityName;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.securityQuantity = securityQuantity;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public Long getPortofolioId() {
        return portofolioId;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

}