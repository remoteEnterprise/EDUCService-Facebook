package org.educservice_facebook.persistence;

import java.util.List;

import org.educservice_facebook.model.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Connection implements CRUDIF{
	private static Connection uniqueInstance = new Connection();
	private SessionFactory factory;
	private Session session;
	
	private Connection() {
		this.factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
	}
	
	public static Connection getInstance() {
		return Connection.uniqueInstance;
	}

	@Override
	public boolean create(Object o) {
		this.session = this.factory.openSession();
		Transaction tx = null;
		try {
			tx = this.session.beginTransaction();
			this.session.save(o);
			tx.commit();
			return true;
		} catch (HibernateException e) { 
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			return false;
		} finally {
			this.session.close();
		}
	}

	@Override
	public Object retrieve(String login) {
		Object o = null;
		this.session = this.factory.openSession();
		Transaction tx = null;
		try {
			tx = this.session.beginTransaction();
			List<User> users =  this.session.createQuery("from User").getResultList();
			for(int i = 0; i < users.size(); i++) {
				User user = users.get(i);
				if(user.getLogin().equals(login)) {
					return user;
				}
			}
			tx.commit();
		} catch(HibernateException e) {
			if(tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
		}  finally {
			this.session.close();
		}
		
		o = new User(login, "", "");
		return o;
	}

	@Override
	public boolean update(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
}
