package com.spisok.repository;

import com.spisok.domain.Note;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface NotesRepository extends JpaRepository<Note, Long> {
    List<Note> getAllBy();
}
