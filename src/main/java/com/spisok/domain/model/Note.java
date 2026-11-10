package com.spisok.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name="note")
public class Note {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
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
