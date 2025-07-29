package com.eldritchkeys.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "organisation")
public class Organisation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String scope;
    private String code;
    private String description;
    private String notes;

    public Organisation() {
    }

    public Organisation(String scope, String code, String description, String notes) {
        this.scope = scope;
        this.code = code;
        this.description = description;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public String getScope() {
        return scope;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getNotes() {
        return notes;
    }
}
