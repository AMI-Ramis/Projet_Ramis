/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author amal
 */
@Entity
public class TimeClock implements Serializable {

    @Id
    @GeneratedValue
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idM")
    private int idT;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idT;
        hash = 79 * hash + Objects.hashCode(this.date);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TimeClock other = (TimeClock) obj;
        if (this.idT != other.idT) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    public void setIdT(int id) {
        this.idT = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdT() {
        return idT;
    }

    public Date getDate() {
        return date;
    }

}
