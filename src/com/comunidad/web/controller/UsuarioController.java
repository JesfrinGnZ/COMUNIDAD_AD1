/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.web.controller;

import com.comunidad.bean.Usuario;
import com.comunidad.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jesfrin
 */
@RestController
public class UsuarioController {

    @Autowired
    private IUsuarioService userService;

    @GetMapping("/")
    public String home() {
        return "Spring REST Dinesh on Java!!!";
    }

    //Creando un nuevo usuario
    @PostMapping("/newuser")
    public ResponseEntity<?> create(@RequestBody Usuario usuario) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(usuario));
    }

    @GetMapping("/newusers")
    public Iterable<?> all() {
        return userService.findAll();
    }

}
