package com.flexcrew.flexcrewdemo;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Embeddable
public class Address {

    @Id
    @GeneratedValue
    private Long id;
    private String street_number;
    private String street_name;
    private String state;
    private String zip;

    public Address() {
    }

    public Address(Long id, String street_number, String street_name, String state, String zip) {
        this.id = id;
        this.street_number = street_number;
        this.street_name = street_name;
        this.state = state;
        this.zip = zip;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet_number() {
        return street_number;
    }

    public void setStreet_number(String street_number) {
        this.street_number = street_number;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}

