package com.spisok.presentation.controllers;

import com.spisok.domain.Note;
import com.spisok.presentation.dto.CreateNoteRequest;
import com.spisok.repository.NotesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class NotesController {

    private final NotesRepository repository;

    public NotesController(NotesRepository repository){
        this.repository = repository;
    }

    @GetMapping("/notes")
    @ResponseStatus
    public ResponseEntity<String> GetAllNotes(){
        return ResponseEntity.ok("Test");
    }

    @PostMapping("/notes/create")
    @ResponseStatus(HttpStatus.OK)
    public Note create(@RequestBody CreateNoteRequest request){
        return new Note(request.title(), request.description());
    }
}
