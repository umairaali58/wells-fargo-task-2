package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {
    
    @Id
    @GeneratedValue
    private Long clientId;

    @Column(nullable = false)
    private Long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;
    
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    protected Client() {
    }

    public Client(Long advisorId, String firstName, String lastName, String address, String email, String phone) {
        this.advisorId = advisorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public Long getClientId() {
        return clientId;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setAdvisorId(Long advisorId) {
        this.advisorId = advisorId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}


