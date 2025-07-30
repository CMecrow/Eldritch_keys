package com.eldritchkeys.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "vendors")
public class Vendors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String location;
    private String notes;


    public Vendors() {
    }

    public Vendors(String code, String name, String location, String notes) {
        this.code = code;
        this.name = name;
        this.location = location;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getNotes() {
        return notes;
    }
}
