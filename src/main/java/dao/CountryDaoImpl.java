package dao;

import models.Country;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateSessionFactoryUtil;

import java.util.List;

public class CountryDaoImpl implements CountryDao{

    @Override
    public Country findId(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Country.class, id);
    }

    @Override
    public void save(Country country) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(country);
        tx.commit();
        session.close();

    }

    @Override
    public void update(Country country) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(country);
        tx.commit();
        session.close();
    }

    @Override
    public void delete(Country country) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(country);
        session.close();
    }

    @Override
    public List<Country> findAllCountry() {
        List<Country> country = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Country").getResultList();
        return country;
    }
}
