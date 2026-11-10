package com.spisok.application.service;


import com.spisok.domain.model.Note;
import com.spisok.domain.repository.NotesRepository;
import com.spisok.presentation.dto.CreateNoteRequest;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesService {

    private final NotesRepository repository;

    public NotesService( NotesRepository repository){
        this.repository = repository;
    }

    public Note create(CreateNoteRequest request){
        Note temp = new Note(request.title(), request.description());
        return repository.save(temp);
    }

    @Transactional
    public List<Note> list(String query){
        List<Note> notes = (query == null || query.isBlank())
                ? repository.findAll()
                : repository.findAll();
        return notes;
    }


}
