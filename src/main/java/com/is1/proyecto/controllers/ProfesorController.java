package com.is1.proyecto.controllers;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import java.util.HashMap;

import com.is1.proyecto.models.Profesor;


public class ProfesorController 
{

    public static ModelAndView formulario(Request req, Response res) 
    {
        return new ModelAndView(null, "profesor_form.mustache");
    }

    public static ModelAndView crear(Request req, Response res) 
    {
        String nombre = req.queryParams("nombre");
        String apellido = req.queryParams("apellido");
        String correo = req.queryParams("correo");
        String dni = req.queryParams("dni");

        Profesor p = new Profesor();
        p.set("nombre", nombre, "apellido", apellido, "correo", correo, "dni", dni);

        if (p.isValid()) 
        {
            p.saveIt();
            res.redirect("/profesores");
            return null;
        } 
        else 
        {
            HashMap<String, Object> model = new HashMap<>();
            model.put("errores", p.errors());
            return new ModelAndView(model, "profesor_form.mustache");
        }
    }
}
