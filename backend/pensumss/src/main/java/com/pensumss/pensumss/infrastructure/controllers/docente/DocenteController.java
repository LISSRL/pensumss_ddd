package com.pensumss.pensumss.infrastructure.controllers.docente;

import com.pensumss.pensumss.domain.docente.Docente;
import com.pensumss.pensumss.infrastructure.userCase.fetch.docente.DocenteFetchUseCase;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pensumss/docentes")
public class DocenteController
{
    private final DocenteFetchUseCase deckFetchUseCase;

    @Autowired
    public DocenteController(final DocenteFetchUseCase deckFetchUseCase)
    {
        this.deckFetchUseCase = deckFetchUseCase;
    }

    @GetMapping
    public ResponseEntity<List<Docente>> FetchAllUsers()
    {
        return new ResponseEntity<>(deckFetchUseCase.fetchAll(), HttpStatus.OK);
    }
}
