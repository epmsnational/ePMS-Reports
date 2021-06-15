/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Tblexposedinfantmedication;
import com.vmmc.entities.Tblexposedinfantproblems;
import com.vmmc.entities.Tblexposedinfants;
import com.vmmc.entities.Tblexposedinfanttests;
import com.vmmc.entities.Tblexposedinfantvisits;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author mbanol
 */
public class CompletedExposedInfantClientAll {

    public CompletedExposedInfantClientAll() {
    }

    private String ExposedInfantId;
    private SessionFactory sessionFactory = VmmcUtil.getSessionFactory();

    public CompletedExposedInfantClientAll(String ExposedInfantId) {
        this.ExposedInfantId = ExposedInfantId;
        Session session = sessionFactory.openSession();

        try {

            String hql = "from Tblexposedinfantvisits where exposedInfantId=:ExposedInfantId";
            Query query = session.createQuery(hql);
            query.setString("ExposedInfantId", ExposedInfantId);
            List<Tblexposedinfantvisits> pList = query.list();
            exposedinfantvisits = pList;
        } catch (Exception ex) {
            ex.toString();
        } finally {
            session.clear();
        }
        //Session sessService = sessionFactory.openSession();

        try {

            String hql = "from Tblexposedinfantmedication where exposedInfantId=:ExposedInfantId";
            Query query = session.createQuery(hql);
            query.setString("ExposedInfantId", ExposedInfantId);
            List<Tblexposedinfantmedication> pList = query.list();
            exposedinfantmedication = pList;
        } finally {
            session.clear();
        }
        //Session sessReferredfrom = sessionFactory.openSession();

        try {

            String hql = "from Tblexposedinfanttests where exposedInfantId=:ExposedInfantId";
            Query query = session.createQuery(hql);
            query.setString("ExposedInfantId", ExposedInfantId);
            List<Tblexposedinfanttests> pList = query.list();
            exposedinfanttests = pList;
        } finally {
            session.clear();
        }
        // Session sessGenCon = sessionFactory.openSession();

        try {
            String hql = "from Tblexposedinfantproblems where exposedInfantId=:ExposedInfantId";
            Query query = session.createQuery(hql);
            query.setString("ExposedInfantId", ExposedInfantId);
            List<Tblexposedinfantproblems> pList = query.list();
            exposedinfantproblems = pList;
        } finally {
            session.clear();
        }
        //Session sessComp = sessionFactory.openSession();

        try {
            String hql = "from Tblexposedinfants where exposedInfantId=:ExposedInfantId";
            Query query = session.createQuery(hql);
            query.setString("ExposedInfantId", ExposedInfantId);
            List<Tblexposedinfants> pList = query.list();
            exposedinfants = pList;
        } finally {
            session.clear();
        }
session.close();
    }

    private Tblexposedinfants p;
    private List<Tblexposedinfantvisits> exposedinfantvisits;
    private List<Tblexposedinfants> exposedinfants;
    private List<Tblexposedinfantproblems> exposedinfantproblems;
    private List<Tblexposedinfanttests> exposedinfanttests;
    private List<Tblexposedinfantmedication> exposedinfantmedication;

    public Tblexposedinfants getP() {
        return p;
    }

    public void setP(Tblexposedinfants p) {
        this.p = p;
    }

    public List<Tblexposedinfantvisits> getExposedinfantvisits() {
        return exposedinfantvisits;
    }

    public void setExposedinfantvisits(List<Tblexposedinfantvisits> exposedinfantvisits) {
        this.exposedinfantvisits = exposedinfantvisits;
    }

    public List<Tblexposedinfants> getExposedinfants() {
        return exposedinfants;
    }

    public void setExposedinfants(List<Tblexposedinfants> exposedinfants) {
        this.exposedinfants = exposedinfants;
    }

    public List<Tblexposedinfantproblems> getExposedinfantproblems() {
        return exposedinfantproblems;
    }

    public void setExposedinfantproblems(List<Tblexposedinfantproblems> exposedinfantproblems) {
        this.exposedinfantproblems = exposedinfantproblems;
    }

    public List<Tblexposedinfanttests> getExposedinfanttests() {
        return exposedinfanttests;
    }

    public void setExposedinfanttests(List<Tblexposedinfanttests> exposedinfanttests) {
        this.exposedinfanttests = exposedinfanttests;
    }

    public List<Tblexposedinfantmedication> getExposedinfantmedication() {
        return exposedinfantmedication;
    }

    public void setExposedinfantmedication(List<Tblexposedinfantmedication> exposedinfantmedication) {
        this.exposedinfantmedication = exposedinfantmedication;
    }

}
