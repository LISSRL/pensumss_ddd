package com.pensumss.pensumss.domain.facultad;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Facultad
{
    @Id
    private UUID id;

    private String nombre;
    private String codigo;

}
