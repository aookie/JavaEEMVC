/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvcozarkhelloworld;

import com.oracle.ozark.engine.JspViewEngine;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.Viewable;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author aoquin
 */
@Path("hello")
@Controller
@RequestScoped
public class mvcOzarkController {

    @Inject
    private Models models;
    
    @GET
    @Path("{name}")
    public String hello(@PathParam("name") String name) {
        models.put("name", name);
        return "hello.jsp";
    }
    
}
