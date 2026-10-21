package com.spisok.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String title;

    private String description;

    public Note(String title, String description){
        this.title  = title;
        this.description = description;
    }

    public Note() {

    }

    public String getTitle() {
        return title;
    }


    public String getDescription() {
        return description;
    }

}
