/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Patient;
import com.vmmc.entities.Nationality;
import com.vmmc.entities.Tblpatients;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;
import org.hibernate.jdbc.ReturningWork;

/**
 *
 * @author mamhinga
 */
public class CircumcisablePatientImpl implements CircumcisablePatient {

    @Override
    public int add(Patient p) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
//        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();  
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            //transaction.begin();
            session.save(p);
            session.flush();
            session.clear();
            transaction.commit();
            //return "Patient Details have been saved";
            return 1;
        } catch (HibernateException hb) {
            transaction.rollback();
            System.err.println("error" + hb);
            // return "Sorry some problem has occured. Try Again";
            return 0;
        } finally {
            session.close();
        }
    }

    @Override
    public int edit(Patient p) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            final Transaction transaction = session.beginTransaction();
            //create the update query
            String query = "update Patient as p set p.vmmcId = :vmmcId where p.opdnumber = :keyId";

            session.createQuery(query)
                    .setString("vmmcId", p.getVmmcId())//this will set the string 'newName' to name variable
                    .setString("keyId", p.getOpdnumber())
                    .executeUpdate();

            transaction.commit();//end of transaction         session.close();//end of  session                         
        } finally {
            session.close();
        }
        return 1;
    }

    @Override
    public int editHTS(Patient p) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            final Transaction transaction = session.beginTransaction();
            //create the update query
            String query = "update Patient as p set p.htsId = :htsId where p.id = :keyId";

            session.createQuery(query)
                    .setString("htsId", p.getHtsId())//this will set the string 'newName' to name variable
                    .setString("keyId", p.getOpdnumber())
                    .executeUpdate();

            transaction.commit();//end of transaction         session.close();//end of  session                         
        } finally {
            session.close();
        }
        return 1;
    }

    @Override
    public int editSTI(Patient p) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            final Transaction transaction = session.beginTransaction();
            //create the update query
            String query = "update Patient as p set p.stiId = :stiId where p.id = :keyId";

            session.createQuery(query)
                    .setString("stiId", p.getStiId())//this will set the string 'newName' to name variable
                    .setString("keyId", p.getOpdnumber())
                    .executeUpdate();

            transaction.commit();//end of transaction         session.close();//end of  session                         
        } finally {
            session.close();
        }
        return 1;
    }

    @Override
    public Patient getOIArtPatient(String patientId) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from Patient where patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            Patient p = (Patient) query.list().get(0);
            return p;
        } finally {
            session.close();
        }

    }

    @Override
    public Patient getPatient(String opdNum) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from Patient where opdnumber=:opdNum ";
            Query query = session.createQuery(hql);
            query.setString("opdNum", opdNum);
            Patient p = (Patient) query.list().get(0);
            return p;
        } finally {
            session.close();
        }

    }

    @Override
    public List<Patient> getAllPatients() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            //transaction.begin();
            List<Patient> pList = session.createQuery("from Patient").list();
            return pList;
        } finally {
            session.close();
        }

    }

    public List<Patient> checkPatient(String opdNum) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from Patient where opdnumber=:opdNum ";
            Query query = session.createQuery(hql);
            query.setString("opdNum", opdNum);
            List<Patient> p = query.list();
            return p;
        } finally {
            session.close();
        }

    }

    public List<Nationality> getAllNations() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            //transaction.begin();
            List<Nationality> nationList = session.createQuery("from Nationality").list();
            return nationList;
        } finally {
            session.close();
        }

    }

    public List<Tblpatients> getRefPatient(String patientId) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from Tblpatients where patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Tblpatients> p = query.list();
            return p;
        } finally {
            session.close();
        }

    }

    public List<Patient> getAllDatedPatients(Date startDate, Date endDate) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            //from Patient where startDate >= :startDate AND <= :endDate
            Query query = session.createQuery("FROM Patient WHERE RegistrationDate BETWEEN :startDate AND :endDate");
            query.setTimestamp("startDate", startDate);
            query.setTimestamp("endDate", endDate);

            List<Patient> result = query.list();
            return result;
        } finally {
            session.close();
        }
    }

    @Override
    public Patient getVmmcPatient(String vmmcId) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from Patient where vmmcId=:vmmcId";
            Query query = session.createQuery(hql);
            query.setString("vmmcId", vmmcId);
            Patient p = (Patient) query.list().get(0);
            return p;
        } finally {
            session.close();
        }

    }

    @Override
    public int remove(int id) {
        int result = 0;
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete Patient where id =:myid");
        query.setParameter("myid", id);
        result = query.executeUpdate();
        transaction.commit();
        session.close();
        return result;
    }

    @Override
    public int editFullPatient(Patient p) {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            session.update(p);
            session.flush();
            session.clear();
            transaction.commit();
            return 1;
        } catch (HibernateException hb) {
            transaction.rollback();
            System.err.println("error" + hb);
            // return "Sorry some problem has occured. Try Again";
            return 0;
        } finally {
            session.close();
        }
    }

    @Override
    public Patient getStiPatient(String stiId) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from Patient where stiId=:stiId";
            Query query = session.createQuery(hql);
            query.setString("stiId", stiId);
            Patient p = (Patient) query.list().get(0);
            return p;
        } finally {
            session.close();
        }

    }

    public int[] getTotalMalesAndFemalesInRange(List<Patient> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        for (Patient c : getAllPatients()) {
            // 2013-10-07,Male
            //prep object

            String[] dateComps = c.getDob().toString().split("-");
            int years = Period.between(LocalDate.of(
                    Integer.parseInt(dateComps[0]), Integer.parseInt(dateComps[1]), Integer.parseInt(dateComps[2])
            ), LocalDate.now()).getYears();
            String sex = c.getSex();
            System.out.println(years + "," + c.getSex());
            //filter first by age
            if (years >= lowAge && years <= upperAge) {
                System.out.println("found");
                ///this person is within the range of given age
                //determine if male or female
                if (!Objects.isNull(sex)) {

                    if (sex.startsWith("M") || sex.startsWith("m")) {
                        temp[0]++;
                    } else if (sex.startsWith("F") || sex.startsWith("f")) {
                        temp[1]++;
                    }
                }
            }

        }
        return temp;
    }

    // the list that you bare going to pas must be the list that has people within the rage of dates
    //not the list of all patients
    public int[] getTotalDMalesAndFemalesInRange(List<Patient> list, int lowAge, int upperAge) {
        int[] temp = new int[2];
        for (Patient c : list) {
            //getAllDatedPatients()
            // 2013-10-07,Male
            //prep object

            String[] dateComps = c.getDob().toString().split("-");
            int years = Period.between(LocalDate.of(
                    Integer.parseInt(dateComps[0]), Integer.parseInt(dateComps[1]), Integer.parseInt(dateComps[2])
            ), LocalDate.now()).getYears();
            String sex = c.getSex();
            System.out.println(years + "," + c.getSex());
            //filter first by age
            if (years >= lowAge && years <= upperAge) {
                System.out.println("found");
                ///this person is within the range of given age
                //determine if male or female
                if (!Objects.isNull(sex)) {

                    if (sex.startsWith("M") || sex.startsWith("m")) {
                        temp[0]++;
                    } else if (sex.startsWith("F") || sex.startsWith("f")) {
                        temp[1]++;
                    }
                }
            }

        }
        return temp;
    }

    @Override
    public int editOIArt(Patient p) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            final Transaction transaction = session.beginTransaction();
            //create the update query
            String query = "update Patient as p set p.patientId = :patientId where p.opdnumber = :keyId";

            session.createQuery(query)
                    .setString("patientId", p.getPatientId())//this will set the string 'newName' to name variable
                    .setString("keyId", p.getOpdnumber())
                    .executeUpdate();

            transaction.commit();//end of transaction         session.close();//end of  session                         
        } finally {
            session.close();
        }
        return 1;
    }

    public int editOIArtRef(Patient p) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            final Transaction transaction = session.beginTransaction();
            //create the update query
            String query = "update Patient as p set p.fileRef = :fileRef where p.opdnumber = :keyId";

            session.createQuery(query)
                    .setString("fileRef", p.getFileRef())//this will set the string 'newName' to name variable
                    .setString("keyId", p.getOpdnumber())
                    .executeUpdate();

            transaction.commit();//end of transaction         session.close();//end of  session                         
        } finally {
            session.close();
        }
        return 1;
    }

    public List<Patient> allArtPatients() {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        List<Patient> patient = null;
        try {
            transaction = session.beginTransaction();
            Criteria pList = session.createCriteria(Patient.class);

            patient = pList.list();
            transaction.commit();
            return patient;
        } finally {
            session.close();
        }

    }

    public List<Patient> getAllStatelessPatients() {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        StatelessSession session = sessionFactory.openStatelessSession();
        List<Patient> patient = null;
        int count = 0;
        session.beginTransaction();

        ScrollableResults results = session.createQuery("From Patient").scroll(ScrollMode.FORWARD_ONLY);
        while (results.next()) {
            Patient patient1 = (Patient) results.get(0);
            patient = Arrays.asList(patient1);

        }
        session.getTransaction().commit();
        return patient;
    }

    public List<Patient> getPatientFromJdbc() {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        List<Patient> patient = null;
        try {
            patient = session.doReturningWork(new ReturningWork<List<Patient>>() {

                @Override
                public List<Patient> execute(Connection cnctn) throws SQLException {
                    CallableStatement stmt = null;
                    List<Patient> pat = new ArrayList<>();
                    String sql = "Select * from patient where patientId is not null";
                    stmt = cnctn.prepareCall(sql);
                    ResultSet resultSet = stmt.executeQuery();
                    while (resultSet.next()) {
                        String patientId = resultSet.getString("patientId");
                        String OPDNumber = resultSet.getString("OPDNumber");
                        String FirstName = resultSet.getString("FirstName");
                        String LastName = resultSet.getString("LastName");
                        Date RegistrationDate = resultSet.getDate("RegistrationDate");
                        String Sex = resultSet.getString("Sex");
                        String fileRef = resultSet.getString("fileRef");
                        String NationalID = resultSet.getString("NationalID");

                        Patient innerP = new Patient();
                        innerP.setPatientId(patientId);
                        innerP.setOpdnumber(OPDNumber);
                        innerP.setFirstName(FirstName);
                        innerP.setLastName(LastName);
                        innerP.setRegistrationDate(RegistrationDate);
                        innerP.setSex(Sex);
                        innerP.setFileRef(fileRef);
                        innerP.setNationalId(NationalID);

                        pat.add(innerP);
                    }
                    return pat;
                }

            });
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return patient;
    }

    public List<Patient> getOIPatient(String patientId) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String hql = "from Patient where patientId=:patientId";
            Query query = session.createQuery(hql);
            query.setString("patientId", patientId);
            List<Patient> p = query.list();
            return p;
        } finally {
            session.close();
        }

    }

    public List<Patient> getPatientByName(String patientName) {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        String[] splited = patientName.trim().split("\\s+");
        String fName = splited[0];
        String lName = splited[0];
        try {
            String hql = "from Patient where firstName LIKE :firstname OR lastName LIKE :lastname OR firstName LIKE :lastname OR lastName LIKE :firstname";
            Query query = session.createQuery(hql);
            query.setString("firstname", fName);
            query.setString("lastname", lName);

            List<Patient> p = query.list();
            return p;
        } finally {
            session.close();
        }
    }

    public List<String[]> getVisitsTestsStatusByJdbc() {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        List<String[]> obj = null;
        try {
            obj = session.doReturningWork((Connection cnctn) -> {
                CallableStatement stmt = null;
                List<String[]> objs = new ArrayList<>();
                String sql = "Select * from patient a JOIN tblpatients x on a.patientId = x.PatientID JOIN tblvisits b on a.patientId = b.PatientID JOIN tbltests c on a.patientId = c.PatientID JOIN"
                        + " tblstatus d on a.patientId = d.PatientID JOIN tblsetuparvfixeddosecombinations e on b.ARVcode = e.ARVcode group by x.PatientID";
                stmt = cnctn.prepareCall(sql);
                ResultSet result = stmt.executeQuery();

                int columnCount = result.getMetaData().getColumnCount();

                while (result.next()) {
                    String[] row = new String[columnCount];
                    for (int i = 0; i < columnCount; i++) {
                        row[i] = result.getString(i + 1);

                    }
                    objs.add(row);
                }
                return objs;
            });
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return obj;
    }

    public List<Object> getVisitsTestsStatusByJdbcObject() {
        final SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        List<Object> obj = new ArrayList<>();
        try {
            obj = session.doReturningWork((Connection cnctn) -> {
                CallableStatement stmt = null;
                List<Object> objs = new ArrayList<>();
//                String sql = "Select * from tblpatients x JOIN tblvisits b on x.PatientID = b.PatientID JOIN tblsetuparvfixeddosecombinations e on "
//                        + "b.ARVcode = e.ARVcode JOIN tbltests c on x.PatientID = c.PatientID JOIN tblstatus d on x.PatientID = d.PatientID group by x.PatientID";

                String sql = "Select x.PatientID,x.DateOfBirth,x.Sex,x.MaritalStatus,x.TransferInId,x.ReferredFromID,x.ReferredFromNotes,x.OrphanStatusID,"
                        + "x.DateOfDeath,x.DateConfirmedHIVPositive,x.LocationHIVTestCode,x.HIVTestReasonID,x.FileRef,x.OPDNumber,x.DateOfEnrolment,x.IndexCaseName,"
                        + "x.IndexCaseDate,x.DisclosureYesDate,x.IsDisclosureHIV,x.IsRetestForHIVInitiation,"
                        + "b.VisitDate,b.VisitType,b.VisitTypeCode,b.VisitStatusCode,b.NowPregnant,b.FunctionalStatusCode,b.WHOStage,b.TBStatusCode,"
                        + "b.IPTReasonCode,b.TypeOfTPT,b.ARVStatusCode,b.ARVReasonCode,b.AdverseEventsStatusCode,b.TBInvestigationResults,b.IsIPTEligibility,b.IPTStatusCode,"
                        + "c.TestTypeID,c.TestDate,c.ResultDate,c.RecievedDate,c.ResultNumeric,d.StatusDate,d.Status,e.ARVDescription,e.V2Code,e.RegimenType "
                        + "from tblvisits b INNER JOIN tblsetuparvfixeddosecombinations e on b.ARVcode = e.ARVcode INNER JOIN tbltests c on b.PatientID = c.PatientID INNER JOIN "
                        + "tblstatus d on b.PatientID = d.PatientID INNER JOIN tblpatients x on b.PatientID = x.PatientID group by x.PatientID";
//                String sql = "Select x.PatientID,x.DateOfBirth,x.Sex,x.TransferInId,x.DateOfDeath,x.DateOfEnrolment,b.VisitDate,b.VisitType,b.VisitTypeCode,"
//                        + "b.VisitStatusCode,b.FunctionalStatusCode,b.WHOStage,b.ARVStatusCode,b.ARVReasonCode,b.AdverseEventsStatusCode,c.TestTypeID,c.TestDate,"
//                        + "c.ResultDate,c.RecievedDate,c.ResultNumeric,d.StatusDate,d.Status,d.TransferOutToWhere,e.RegimenType "
//                        + "from tblvisits b JOIN tblsetuparvfixeddosecombinations e on b.ARVcode = e.ARVcode JOIN tbltests c on b.PatientID = c.PatientID JOIN "
//                        + "tblstatus d on b.PatientID = d.PatientID JOIN tblpatients x on b.PatientID = x.PatientID group by x.PatientID";
                stmt = cnctn.prepareCall(sql);
                ResultSet result = stmt.executeQuery();

                ResultSetMetaData md = result.getMetaData();
                int columns = md.getColumnCount();
                while (result.next()) {
                    Map<String, Object> row = new HashMap<>(columns);
                    for (int i = 1; i <= columns; ++i) {
                        row.put(md.getColumnName(i), result.getObject(i));
                        i++;

                    }

                    objs.add(row);

                }
                return objs;

            });
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
            //obj.clear();
        }
        return obj;
    }

    public List getAllObjectPatients() {
        SessionFactory sessionFactory = VmmcUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            String sql = "Select a.patientId,a.sex,a.dateOfBirth,b.visitDate,b.arvstatusCode,b.tbinvestigationResults,b.isIpteligibility,b.iptstatusCode,"
                    + "b.tbstatusCode,b.iptreasonCode,b.typeOfTPT,c.status FROM Tblpatients a JOIN Tblvisits b ON a.patientId = b.patientId JOIN "
                    + "Tblstatus c ON a.patientId = c.patientId WHERE a.dateOfDeath is null AND b.id.visitDate = "
                    + "(Select max(b.visitDate) FROM Tblvisits b WHERE a.patientId = b.patientId) group by a.patientId";
//            List<Object> pList = session.createSQLQuery("Select a.opdnumber,a.patientId,a.firstName,a.lastName,a.dateOfDeath,a.dob,a.sex,"
//                    + " b.visitDate from patient a JOIN tblvisits b on a.patientId = b.patientId").list();
            //List<Object> pList = session.createSQLQuery(sql).list();
            
            Query query = session.createQuery(sql);
            
            List pList = query.list();
            
            return pList;
        } finally {
            session.close();
        }

    }

}
