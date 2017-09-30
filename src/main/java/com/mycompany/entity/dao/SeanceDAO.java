package com.mycompany.entity.dao;

import com.mycompany.HibernateUtil;
import com.mycompany.entity.Seance;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

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



}

