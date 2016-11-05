package org.educservice_facebook.persistence;

public interface CRUDIF {
	public boolean create(Object o);
	public Object retrieve(String login);
	public boolean update(Object o);
	public boolean delete(Object o);
}
