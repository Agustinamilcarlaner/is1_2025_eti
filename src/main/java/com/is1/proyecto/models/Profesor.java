package com.is1.proyecto.models;

import org.javalite.activejdbc.Model;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;


@Table("profesores") // Asocia el modelo con la tabla 'profesores' (ya creada en schema.sql)
public class Profesor extends Model {

    // Igual que en User.java, usamos getters/setters simples
    // ActiveJDBC ya mapea columnas -> atributos del modelo

    public String getNombre() {
        return getString("nombre");
    }

    public void setNombre(String nombre) {
        set("nombre", nombre);
    }

    public String getApellido() {
        return getString("apellido");
    }

    public void setApellido(String apellido) {
        set("apellido", apellido);
    }

    public String getCorreo() {
        return getString("correo");
    }

    public void setCorreo(String correo) {
        set("correo", correo);
    }

    public String getDni() {
        return getString("dni");
    }

    public void setDni(String dni) {
        set("dni", dni);
    }
}