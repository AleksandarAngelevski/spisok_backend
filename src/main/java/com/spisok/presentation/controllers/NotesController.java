package com.spisok.presentation.controllers;

import com.spisok.application.service.NotesService;
import com.spisok.domain.model.Note;
import com.spisok.presentation.dto.CreateNoteRequest;
import com.spisok.domain.repository.NotesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NotesController {

    private final NotesService service;

    public NotesController(NotesService service){
        this.service = service;
    }

    @GetMapping("/notes")
    @ResponseStatus(HttpStatus.OK)
    public List<Note> GetAllNotes(){
        return service.list(null);
    }

    @PostMapping("/notes/create")
    @ResponseStatus(HttpStatus.OK)
    public Note create(@RequestBody CreateNoteRequest request){
        return service.create(request);
    }
}
