package com.pensumss.pensumss.domain.carrera.repository;

import com.pensumss.pensumss.domain.carrera.Carrera;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, UUID>
{
}