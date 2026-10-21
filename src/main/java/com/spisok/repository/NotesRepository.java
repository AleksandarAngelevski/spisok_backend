package com.spisok.repository;

import com.spisok.domain.Note;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface NotesRepository extends JpaRepository<Note, Long> {
}
