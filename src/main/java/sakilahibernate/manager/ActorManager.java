package sakilahibernate.manager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import sakilahibernate.domain.Actor;
import sakilahibernate.util.HibernateUtil;

import java.util.List;

public class ActorManager {

    public static void main(String[] args){
        ActorManager am = new ActorManager();
        System.out.println(am.getActorList().toString());
        HibernateUtil.getSessionFactory().close();
    }

    private void createAndStoreActor(String firstName, String lastName) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Actor a = new Actor();
        a.setFirstName(firstName);
        a.setLastName(lastName);
        session.save(a);
        session.getTransaction().commit();
    }

    private List<Actor> getActorList(){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query q = session.createQuery("from Actor");
        List<Actor> l = q.list();
        session.getTransaction().commit();
        return l;
    }

}
