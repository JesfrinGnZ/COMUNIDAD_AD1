/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.bean;

import com.comunidad.enums.EstadoUsuario;
import com.comunidad.enums.GeneroUsuario;
import com.comunidad.enums.RolUsuario;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

/**
 *
 * @author jesfrin
 */
@Entity
@Table(name = "USUARIO")
public class Usuario {
    
    
        public Usuario(String registroAcademico, String nombreCompleto, String password, Timestamp fechaDeNacimiento, GeneroUsuario genero, String fotoDePerfil, String correoElectronico, RolUsuario rolUsuario, String ciudad, EstadoUsuario estado) {
        this.registroAcademico = registroAcademico;
        this.nombreCompleto = nombreCompleto;
        this.password = password;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.genero = genero;
        this.fotoDePerfil = fotoDePerfil;
        this.correoElectronico = correoElectronico;
        this.rolUsuario = rolUsuario;
        this.ciudad = ciudad;
        this.estado = estado;
    }


    @Id
    @Column(name = "registro_academico", length = 9)
    private String registroAcademico;

    @Column(name = "nombre_completo", length = 200, nullable = false)
    private String nombreCompleto;

    @Column(name = "password", length = 200, nullable = false)
    private String password;

    @Column(name = "fecha_de_nacimiento", nullable = false)
    private Timestamp fechaDeNacimiento;

    @Column(name = "genero", nullable = false)
    @Enumerated(EnumType.STRING)
    private GeneroUsuario genero;

    @Column(name = "foto_de_perfil", nullable = false)
    @Type(type = "text")
    private String fotoDePerfil;

    @Column(name = "correo_electronico", length = 45, nullable = false)
    private String correoElectronico;

    @Column(name = "rol", nullable = false)
    @Enumerated(EnumType.STRING)
    private RolUsuario rolUsuario;

    @Column(name = "ciudad", length = 45, nullable = false)
    private String ciudad;

    @Column(name = "estado", nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoUsuario estado;
        
    public String getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Timestamp fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public GeneroUsuario getGenero() {
        return genero;
    }

    public void setGenero(GeneroUsuario genero) {
        this.genero = genero;
    }

    public String getFotoDePerfil() {
        return fotoDePerfil;
    }

    public void setFotoDePerfil(String fotoDePerfil) {
        this.fotoDePerfil = fotoDePerfil;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public RolUsuario getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(RolUsuario rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public EstadoUsuario getEstado() {
        return estado;
    }

    public void setEstado(EstadoUsuario estado) {
        this.estado = estado;
    }

        @Override
    public String toString() {
        return "Usuario{" + "registroAcademico=" + registroAcademico + ", nombreCompleto=" + nombreCompleto + ", password=" + password + ", fechaDeNacimiento=" + fechaDeNacimiento + ", genero=" + genero + ", fotoDePerfil=" + fotoDePerfil + ", correoElectronico=" + correoElectronico + ", rolUsuario=" + rolUsuario + ", ciudad=" + ciudad + ", estado=" + estado + '}';
    }

    
}
