/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author amal
 */
@Entity
public class Machine implements Serializable {

    @Id
    @GeneratedValue
    @OneToOne(mappedBy="idR")
    private int idM;
    @OneToMany(mappedBy = "idT")
    private Set<TimeClock>timeClock;

    public void setTimeClock(Set<TimeClock> timeClock) {
        this.timeClock = timeClock;
    }

    public Set<TimeClock> getTimeClock() {
        return timeClock;
    }
    private String tagId;
    private String name;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.idM;
        hash = 41 * hash + Objects.hashCode(this.tagId);
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.type);
        hash = 41 * hash + (this.status ? 1 : 0);
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
        final Machine other = (Machine) obj;
        if (this.idM != other.idM) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.tagId, other.tagId)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    private String type;

    public void setIdM(int id) {
        this.idM = id;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    private boolean status;

    public int getIdM() {
        return idM;
    }

    public String getTagId() {
        return tagId;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isStatus() {
        return status;
    }

}
