package com.pensumss.pensumss.infrastructure.userCase.fetch.docente;

import com.pensumss.pensumss.domain.docente.Docente;
import com.pensumss.pensumss.domain.docente.repository.DocenteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocenteFetchUseCase {
    private final DocenteRepository docenteRepository;

    @Autowired
    public DocenteFetchUseCase(final DocenteRepository docenteRepository)
    {
        this.docenteRepository = docenteRepository;
    }

    public List<Docente> fetchAll()
    {
        return docenteRepository.findAll();
    }

}
