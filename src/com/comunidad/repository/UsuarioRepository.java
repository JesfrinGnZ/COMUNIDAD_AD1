/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.repository;

import com.comunidad.bean.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jesfrin
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,String>{
    
}
