/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.jsm.eformation.app.entity;

/**
 *
 * @author stéphane
 */
public class Client {
    private Integer clientId;
    private String lastName;
    private String fistName;
    private String address;
    private String phone;
    private String email;
    private Integer courseSessionId;

    public Client() {
        
    }
 

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCourseSessionId() {
        return courseSessionId;
    }

    public void setCourseSessionId(Integer courseSessionId) {
        this.courseSessionId = courseSessionId;
    }
    
    
}
