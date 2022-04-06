package net.revature.services;


import net.revature.exceptions.IncorectCredentialsException;
import net.revature.exceptions.PlagiarismException;
import net.revature.exceptions.UnsernameAlreadyExistsException;
import net.revature.models.Person;
import net.revature.models.Status;
import net.revature.models.StoryPitch;
import net.revature.models.UserRole;

public interface PersonService {

	public Person login(String username, String password) throws IncorectCredentialsException;
	
	public Status submitStoryPitch(StoryPitch storyPitch) throws PlagiarismException;
	
	public UserRole authorProfileType(int roleId, String roleName);
	
	public UserRole editorProfileType(int roleId, String roleName);
	
	public Person register(Person newPerson) throws UnsernameAlreadyExistsException;
	
	public StoryPitch readStoryPitch(StoryPitch storyPitch);
	
	public Status acceptStoryPitch(int statusId, String statusName);

	public Status reviewStoryPitch(int statusId, String statusName);

	public Status rejectStoryPitch(int statusId, String statusName);
	
}
