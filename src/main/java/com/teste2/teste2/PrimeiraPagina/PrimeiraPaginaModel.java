package com.teste2.teste2.PrimeiraPagina;
import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class PrimeiraPaginaModel {
    @Id
    @GeneratedValue(generator="UUID")
    private UUID idUser;

    private String nome;
    private String email;
    private String usuario;


}
