package db.dao;

import db.HibernateUtil;
import db.entity.Numara;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class NumaraImpl implements NumaraDao{


    @Override
    public void addNumara(Numara numara) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(numara);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Numara> findAllNumara() {

        List<Numara> numaraList = new ArrayList<>();

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();

            String hql = "Select numara FROM Numara numara";
            Query query = session.createQuery(hql);
            numaraList = query.list();
            session.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        return numaraList;
    }

    @Override
    public Boolean deleteNumara(Long numaraId) {

        Numara deletedNumara = new Numara();
        try {

            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            deletedNumara = session.get(Numara.class, numaraId);
            session.delete(deletedNumara);
            transaction.commit();
            session.close();
            return Boolean.TRUE;
        } catch (Exception e) {

            throw new RuntimeException(e);
        }

    }
}
