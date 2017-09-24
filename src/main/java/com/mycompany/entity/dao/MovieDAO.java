package com.mycompany.entity.dao;

import com.mycompany.HibernateUtil;
import com.mycompany.entity.Movie;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MovieDAO {

    public Integer addMovie(Movie movie){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();

            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }



    }



}
