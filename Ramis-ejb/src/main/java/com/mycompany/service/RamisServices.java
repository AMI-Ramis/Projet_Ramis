/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.model.Machine;
import com.mycompany.model.MachineRunningMode;
import com.mycompany.model.TimeClock;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author amal
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class RamisServices {
    @PersistenceContext
    private EntityManager em;
    Machine m = new Machine();
    final void RamisServices (){
  final List<Machine> mc = em.createQuery("Select * from Machine  "
        )
                .getResultList();
    final   List<TimeClock> tc= em.createQuery("Select * from TimeClock  "
               + " where m.getIdM()=:idT"
        ).setParameter("idT",m.getIdM())
                .getResultList();
        final  MachineRunningMode mr= (MachineRunningMode) em.createQuery("Select * from MachineRunningMode  "
               + " where m.getIdM()=:idR"
       ).setParameter("idR", m.getIdM());
        
  
}
}