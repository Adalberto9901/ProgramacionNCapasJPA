/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disgis01.ASalinasNCapas.DAO;

import com.disgis01.ASalinasNCapas.JPA.Result;
import com.disgis01.ASalinasNCapas.JPA.UsuarioDireccion;
import java.util.List;

/**
 *
 * @author Alien 1
 */
public interface IUsuarioJPADAO {

    Result GetAll();

    Result Add(UsuarioDireccion usuarioDireccion);

    Result Add(List<UsuarioDireccion> usuariosDireccion);

    Result Update(UsuarioDireccion usuarioDireccion);

    Result Delete(int idUsuario);

    Result GetById(int idUsuario);

    Result UsuarioGetSolo(int idUsuario);

    Result UsuarioBusqueda(UsuarioDireccion usuarioBusqueda);
    
    Result UpdateActivo(int IdUsuario, int ActivoUsuario);

}
