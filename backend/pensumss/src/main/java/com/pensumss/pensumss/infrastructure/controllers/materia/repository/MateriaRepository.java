package com.pensumss.pensumss.domain.materia.repository;

import com.pensumss.pensumss.domain.materia.Materia;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, UUID>
{
}