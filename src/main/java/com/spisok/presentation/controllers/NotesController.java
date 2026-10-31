package com.spisok.presentation.controllers;

import com.spisok.domain.Note;
import com.spisok.presentation.dto.CreateNoteRequest;
import com.spisok.repository.NotesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NotesController {

    private final NotesRepository repository;

    public NotesController(NotesRepository repository){
        this.repository = repository;
    }

    @GetMapping("/notes")
    @ResponseStatus(HttpStatus.OK)
    public List<Note> GetAllNotes(){
        return repository.getAllBy();
    }

    @PostMapping("/notes/create")
    @ResponseStatus(HttpStatus.OK)
    public Note create(@RequestBody CreateNoteRequest request){
        Note temp = new Note(request.title(), request.description());
        return repository.save(temp);
    }
}
