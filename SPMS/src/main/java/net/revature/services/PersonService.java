package net.revature.services;


import java.util.List;

import net.revature.exceptions.IncorrectCredentialsException;
import net.revature.exceptions.PlagiarismException;
import net.revature.exceptions.UsernameAlreadyExistsException;
import net.revature.models.Person;
import net.revature.models.Status;
import net.revature.models.StoryPitch;
import net.revature.models.UserRole;

public interface PersonService {

	public Person login(String username, String password) throws IncorrectCredentialsException;
	
	public Status submitStoryPitch(StoryPitch storyPitch) throws PlagiarismException;
	
	public UserRole authorProfileType(int roleId, String roleName);
	
	public UserRole editorProfileType(int roleId, String roleName);
	
	public Person register(Person newPerson) throws UsernameAlreadyExistsException;
	
	public List<StoryPitch> readStoryPitch(StoryPitch storyPitch);
	
	public Status acceptStoryPitch(int statusId, String statusName);

	public Status reviewStoryPitch(int statusId, String statusName);

	public Status rejectStoryPitch(int statusId, String statusName);
	
}
