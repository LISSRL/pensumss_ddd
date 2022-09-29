package com.pensumss.pensumss.domain.facultad.repository;

import com.pensumss.pensumss.domain.facultad.Facultad;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultadRepository extends JpaRepository<Facultad, UUID>
{
}