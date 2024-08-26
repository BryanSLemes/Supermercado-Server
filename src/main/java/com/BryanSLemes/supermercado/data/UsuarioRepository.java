package com.BryanSLemes.supermercado.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    Usuario findByUsuarioAndSenha(String usuario, String senha);
    
}
