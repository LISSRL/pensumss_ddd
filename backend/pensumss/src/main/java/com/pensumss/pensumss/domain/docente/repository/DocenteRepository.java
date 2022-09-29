package com.pensumss.pensumss.domain.docente.repository;

import com.pensumss.pensumss.domain.docente.Docente;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, UUID>
{
}