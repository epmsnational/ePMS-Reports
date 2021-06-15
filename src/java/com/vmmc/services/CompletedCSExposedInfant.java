/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;
  
import com.vmmc.entities.Patient;
import com.vmmc.entities.Sti;
import com.vmmc.entities.StiCsexposeinfant;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Mohcc-ATP
 */
public class CompletedCSExposedInfant {

    private List<StiCsexposeinfant> sticsexposeinfant;
    private Patient p;
    private String infantId;
    private SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
    
    public CompletedCSExposedInfant() {
    }
 public CompletedCSExposedInfant(String infantid) {
        this.infantId = infantid;

        Session pd = sessionFactory.openSession();

        try {

            String hql = "from StiCsexposeinfant where infantId=:infantId";
            Query query = pd.createQuery(hql);
            query.setString("infantid", infantid);
            List<StiCsexposeinfant> pList = query.list();
            sticsexposeinfant = pList;
        } catch (Exception ex) {
            ex.toString();
        } finally {
            pd.close();
        }

    }
    public List<StiCsexposeinfant> getSticsexposeinfant() {
        return sticsexposeinfant;
    }

    public void setSticsexposeinfant(List<StiCsexposeinfant> sticsexposeinfant) {
        this.sticsexposeinfant = sticsexposeinfant;
    }

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
    }

    public String getInfantId() {
        return infantId;
    }

    public void setInfantId(String infantId) {
        this.infantId = infantId;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
}
