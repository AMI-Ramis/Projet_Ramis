/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author amal
 */
@Entity
public class MachineRunningMode implements Serializable {

    @Id
    @GeneratedValue
    private int idR;
    @ManyToOne
    private Machine machine;
    private String label;
    private String signature;
    private String mode;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.idR;
        hash = 31 * hash + Objects.hashCode(this.label);
        hash = 31 * hash + Objects.hashCode(this.signature);
        hash = 31 * hash + Objects.hashCode(this.mode);
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
        final MachineRunningMode other = (MachineRunningMode) obj;
        if (this.idR != other.idR) {
            return false;
        }
        if (!Objects.equals(this.label, other.label)) {
            return false;
        }
        if (!Objects.equals(this.signature, other.signature)) {
            return false;
        }
        if (!Objects.equals(this.mode, other.mode)) {
            return false;
        }
        return true;
    }

    public int getIdR() {
        return idR;
    }

    public String getLabel() {
        return label;
    }

    public String getSignature() {
        return signature;
    }

    public String getMode() {
        return mode;
    }

    public void setIdR(int id) {
        this.idR = id;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
    
}
