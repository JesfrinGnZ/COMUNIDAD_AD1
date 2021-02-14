/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.service;

import com.comunidad.bean.Usuario;
import com.comunidad.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jesfrin
 */
@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    private UsuarioRepository userRepository;
    
    @Override
    public Iterable<Usuario> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return userRepository.save(usuario);
    }
    
}
