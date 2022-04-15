package net.revature.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import net.revature.exceptions.IncorrectCredentialsException;
import net.revature.exceptions.PlagiarismException;
import net.revature.exceptions.UsernameAlreadyExistsException;
import net.revature.models.Person;
import net.revature.models.Status;
import net.revature.models.StoryPitch;
import net.revature.models.UserRole;
import net.revature.data.PersonDAO;
import net.revature.data.StoryPitchDAO;
import net.revature.services.PersonServiceImp;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
	@Mock
	private PersonDAO personDAO;
	@Mock
	private StoryPitchDAO storyPitchDAO;
	
	@InjectMocks
	private PersonService personService = new PersonServiceImp();
	
	@Test
	public void exampleTest() {
		assertTrue(true);
	}
	
	@Test
	public void logInSuccessfully() throws IncorrectCredentialsException {
		
		String username = "Alexandwhat";
		String password = "WhatPassword?";
		
		Person mockPerson = new Person();
		mockPerson.setUsername(username);
		mockPerson.setPassword(password);
		when(personDAO.getByUsername(username)).thenReturn(mockPerson);
		Person result = personService.login(username, password);
		
		assertEquals(username, result.getUsername());
	}
	
	@Test
	public void logInWrongUsername() {
		String username = "allenpoe";
		String password = "nevermore";
		
		when(personDAO.getByUsername(username)).thenReturn(null);
		
		assertThrows(IncorrectCredentialsException.class, () -> {
			personService.login(username, password);
		});
	}
	
		@Test
		public void logInWrongPassword() {
			String username = "Alexandwhat";
			String password = "nevermore";
			
			Person mockPerson = new Person();
			mockPerson.setUsername(username);
			mockPerson.setPassword("wrongpassword");
			when(personDAO.getByUsername(username)).thenReturn(mockPerson);
			
			assertThrows(IncorrectCredentialsException.class, () -> {
				personService.login(username, password);
			});

	}
		
		@Test
		public void successfulStorySubmission() throws PlagiarismException{
			Person testPerson = new Person();
			StoryPitch testStoryPitch = new StoryPitch();
			
			StoryPitch firstOne = new StoryPitch();
			firstOne.setTentativeTitle("The Last Nomad");
			firstOne.setLengthType("Five Pages");
			firstOne.setBlurb("It's about the Last Nomad");
			firstOne.setDescription("It's so crazy suspenseful you won't believe it.");
			
			Status result = personService.submitStoryPitch(firstOne);
			
		}
		
		@Test
		public void authorProfileType() {
			int roleId = 01;
			String roleName = "Author";
			
			UserRole userRole = personService.authorProfileType(roleId, roleName);
			assertNotNull(userRole);
		}
		
		@Test
		public void editorProfileType() {
			int roleId = 02;
			String roleName = "Editor";
			
			UserRole userRole = personService.editorProfileType(roleId, roleName);
			assertNotNull(userRole);
		}
		
		@Test
		public void registerSuccessfully() throws UsernameAlreadyExistsException {
			Person newPerson = new Person();
			
			Person result = personService.register(newPerson);
			assertNotEquals(0, result.getId());
		}
		
		@Test
		public void registerUsernameTaken() {
			Person newPerson = new Person();
			newPerson.setUsername("Alexandwhat");
			
			assertThrows(UsernameAlreadyExistsException.class, () -> {
				personService.register(newPerson);
			});
		}
		
		@Test
		public void readStoryPitch() {
			when(personDAO.getByStatus("Accepted")).thenRetun(Collections.emptyList());
			List<StoryPitch> storyPitches = personService.readStoryPitch(null);
			
		assertNotNull(storyPitches);
		}

		@Test
		public void acceptStoryPitch() {
			int statusId = 01;
			String statusName = "Pitch Accepted";
			
			Status status = personServ.acceptStoryPitch(statusId, statusName);
			assertNotNull(status);
		}
		
		@Test
		public void reviewStoryPitch() {
			int statusId = 02;
			String statusName = "Under Review";
			
			Status status = personServ.reviewStoryPitch(statusId, statusName);
			assertNotNull(status);
		}
		
		@Test
		public void rejectStoryPitch() {
			int statusId = 03;
			String statusName = "Pitch Rejected";
			
			Status status = personServ.rejectStoryPitch(statusId, statusName);
			assertNotNull(status);
		}

}
















