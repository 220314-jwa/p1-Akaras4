package net.revature.services;

import net.revature.data.DAOFactory;
import net.revature.data.PersonDAO;
import net.revature.exceptions.IncorrectCredentialsException;
import net.revature.exceptions.PlagiarismException;
import net.revature.exceptions.UsernameAlreadyExistsException;
import net.revature.models.Person;
import net.revature.models.Status;
import net.revature.models.StoryPitch;
import net.revature.models.UserRole;

public class PersonServiceImp implements PersonService {
	private PersonDAO personDAO = DAOFactory.getPersonDAO();

	@Override
	public Person login(String username, String password) throws IncorrectCredentialsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status submitStoryPitch(StoryPitch storyPitch) throws PlagiarismException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRole authorProfileType(int roleId, String roleName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRole editorProfileType(int roleId, String roleName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person register(Person newPerson) throws UsernameAlreadyExistsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StoryPitch readStoryPitch(StoryPitch storyPitch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status acceptStoryPitch(int statusId, String statusName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status reviewStoryPitch(int statusId, String statusName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status rejectStoryPitch(int statusId, String statusName) {
		// TODO Auto-generated method stub
		return null;
	}

	public PersonDAO getPersonDAO() {
		return personDAO;
	}

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
	
}
