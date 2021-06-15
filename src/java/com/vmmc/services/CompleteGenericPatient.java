/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Basicvitals;
import com.vmmc.entities.Cbs;
import com.vmmc.entities.Nextofkin;
import com.vmmc.entities.Patient;
import com.vmmc.entities.PatientAddress;
import com.vmmc.entities.PatientDiagnosis;
import com.vmmc.entities.PatientMedicalInsurance;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Developer
 */
public class CompleteGenericPatient {

    public CompleteGenericPatient(String opdNum) {
        this.opdNum = opdNum;

        Session session = sessionFactory.openSession();

         try {
            String hql = "from Patient where opdnumber=:opdNum ";
            Query query = session.createQuery(hql);
            query.setString("opdNum", opdNum);
            p = (Patient)query.list().get(0);
            
        } finally {
            session.clear();
        }
        try {
            pmiList = session.createQuery("from PatientMedicalInsurance where OPDNumber =:opdNum ").setString("opdNum", opdNum).list();

        } finally {
            session.clear();
        }

        try {
            pAddressList = session.createQuery("from PatientAddress where OPDNumber = :opdNum ").setString("opdNum", opdNum).list();

        } finally {
            session.clear();
        }
        
        try {
            nokList = session.createQuery("from Nextofkin where OPDNumber = :opdNum ").setString("opdNum", opdNum).list();

        } finally {
            session.clear();
        }
        
        try {
            bvList = session.createQuery("from Basicvitals where OPDNumber = :opdNum ").setString("opdNum", opdNum).list();

        } finally {
            session.clear();
        }
        session.close();

    }

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
    }
    public Cbs getCblist(){
        return cblist;
    }
    
    public void setCblist(Cbs cblist){
        this.cblist = cblist;
    }

    public List<PatientMedicalInsurance> getPmiList() {
        return pmiList;
    }

    public void setPmiList(List<PatientMedicalInsurance> pmiList) {
        this.pmiList = pmiList;
    }

    public List<PatientAddress> getpAddressList() {

        return pAddressList;
    }

    public void setpAddressList(List<PatientAddress> pAddressList) {
        this.pAddressList = pAddressList;
    }

    public List<Nextofkin> getNokList() {
        return nokList;
    }

    public void setNokList(List<Nextofkin> nokList) {
        this.nokList = nokList;
    }

    public List<Basicvitals> getBvList() {
        return bvList;
    }

    public void setBvList(List<Basicvitals> bvList) {
        this.bvList = bvList;
    }

    private String opdNum;
    private Patient p;
    private Cbs cblist;
    private List<PatientMedicalInsurance> pmiList;
    private List<PatientAddress> pAddressList;
    private List<Nextofkin> nokList;
    private List<Basicvitals> bvList;
    private SessionFactory sessionFactory = VmmcUtil.getSessionFactory();

}
