/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.presentation;


import com.mycompany.service.RamisServices;
import java.util.Date;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author amal
 */
@ManagedBean
@SessionScoped
public class MachineTimeClockController {

    private Model _model = new Model();
    @EJB
    private RamisServices Service;;

    public Model getModel() {
        return _model;
    }

    public static class Model {

        private int idT;
        private Date date;

    }
}
