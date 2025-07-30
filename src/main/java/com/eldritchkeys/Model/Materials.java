package com.eldritchkeys.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "materials")
public class Materials {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String description;
    private String type;
    private String notes;


    public Materials() {
    }

    public Materials(String code, String name, String description, String type, String notes) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.type = type;
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

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getNotes() {
        return notes;
    }
}


