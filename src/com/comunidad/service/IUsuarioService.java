/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.service;

import com.comunidad.bean.Usuario;

/**
 *
 * @author jesfrin
 */
public interface IUsuarioService {
    
        public Iterable<Usuario> findAll();//Encontrar todos los usuarios
        
        public Usuario save(Usuario usuario);//Guardar un usuario
        
    
}
