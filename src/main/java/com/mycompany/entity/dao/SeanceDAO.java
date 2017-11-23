package com.mycompany.entity.dao;

import com.mycompany.HibernateUtil;
import com.mycompany.entity.Seance;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SeanceDAO {

    public Integer addSeance(Seance seance){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer seanceID = null;
        try{
            tx = session.beginTransaction();
            seanceID = (Integer) session.save(seance);
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }

        return seanceID;

    } 

    public java.util.List<Seance> getSeanceList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        List<Seance> seances = null;
        try{
            tx = session.beginTransaction();
            seances = session.createQuery("FROM Seance").list();
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }

        return seances;
    }



}

