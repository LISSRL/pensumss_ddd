package com.pensumss.pensumss.domain.usuario;


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
public class Usuario
{
    @Id
    private UUID id;

    private String name;
    private String user;
    private String password;
    private String rol;

}
