package com.pensumss.pensumss.domain.carrera;


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
public class Carrera
{
    @Id
    private UUID id;

   private String codigo;
   private String nombre;
   private int total_materias;
     

}
