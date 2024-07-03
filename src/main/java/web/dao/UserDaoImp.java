package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

@Repository
public class UserDaoImp implements UserDao{
    @Autowired
    private SessionFactory sessionFactory;

//    @PersistenceContext/*(name = "TDPersistenceUnit")*/
//    private EntityManager entityManager;

    @Override
    public void add(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

//    @Override
//    public void add(User user) {
//        entityManager.getTransaction().begin();
//        entityManager.persist(user);
//        entityManager.getTransaction().commit();
//    }

}
