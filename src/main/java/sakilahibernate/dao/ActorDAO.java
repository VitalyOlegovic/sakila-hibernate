package sakilahibernate.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import sakilahibernate.domain.Actor;
import sakilahibernate.util.HibernateUtil;

import java.io.Serializable;
import java.util.List;

public class ActorDAO {

    public static void main(String[] args){
        ActorDAO am = new ActorDAO();
        System.out.println(am.getActorList().toString());
        HibernateUtil.getSessionFactory().close();
    }

    public void createAndStoreActor(String firstName, String lastName) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Actor a = new Actor();
        a.setFirstName(firstName);
        a.setLastName(lastName);
        session.save(a);
        session.getTransaction().commit();
    }

    public List<Actor> getActorList(){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query<Actor> q = session.createQuery("from Actor", Actor.class);
        List<Actor> l = q.list();
        session.getTransaction().commit();
        return l;
    }

    public void save(Actor actor){
    	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(actor);
        session.getTransaction().commit();
    }
    
    public void update(Actor actor){
    	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.merge(actor);
        session.getTransaction().commit();
    }
    
}
