package net.revature.data;

import java.sql.SQLException;

import net.revature.models.Person;

public interface PersonDAO extends GenericDAO<Person> {

	public Person getByUsername(String username);

	public Object getByStatus(String status);
	
}
