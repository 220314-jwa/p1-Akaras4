package net.revature.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import net.revature.exceptions.IncorectCredentialsException;
import net.revature.exceptions.PlagiarismException;
import net.revature.exceptions.UnsernameAlreadyExistsException;
import net.revature.models.Person;
import net.revature.models.Status;
import net.revature.models.StoryPitch;
import net.revature.models.UserRole;

public class PersonServiceTest {

	private PersonService personServ;
	
	@Test
	public void exampleTest() {
		assertTrue(true);
	}
	
	@Test
	public void logInSuccessfully() throws IncorectCredentialsException {
		
		String username = "Alexandwhat";
		String password = "WhatPassword?";
		
		Person result = personServ.login(username, password);
		
		assertEquals(username, result.getUsername());
	}
	
	@Test
	public void logInWrongUsername() {
		String username = "allenpoe";
		String password = "nevermore";
		
		assertThrows(IncorectCredentialsException.class, () -> {
			personServ.login(username, password);
		});
	}
	
		@Test
		public void logInWrongPassword() {
			String username = "Alexandwhat";
			String password = "nevermore";
			
			assertThrows(IncorectCredentialsException.class, () -> {
				personServ.login(username, password);
			});

	}
		
		@Test
		public void successfulStorySubmission() throws PlagiarismException{
			StoryPitch firstOne = new StoryPitch();
			firstOne.setTentativeTitle("The Last Nomad");
			firstOne.setLengthType("Five Pages");
			firstOne.setBlurb("It's about the Last Nomad");
			firstOne.setDescription("It's so crazy suspenseful you won't believe it.");
			
			Status result = personServ.submitStoryPitch(firstOne);
			
		}
		
		@Test
		public void authorProfileType() {
			int roleId = 01;
			String roleName = "Author";
			
			UserRole userRole = personServ.authorProfileType(roleId, roleName);
			assertNotNull(userRole);
		}
		
		@Test
		public void editorProfileType() {
			int roleId = 02;
			String roleName = "Editor";
			
			UserRole userRole = personServ.editorProfileType(roleId, roleName);
			assertNotNull(userRole);
		}
		
		@Test
		public void registerSuccessfully() throws UnsernameAlreadyExistsException {
			Person newPerson = new Person();
			
			Person result = personServ.register(newPerson);
			assertNotEquals(0, result.getId());
		}
		
		@Test
		public void registerUsernameTaken() {
			Person newPerson = new Person();
			newPerson.setUsername("Alexandwhat");
			
			assertThrows(UnsernameAlreadyExistsException.class, () -> {
				personServ.register(newPerson);
			});
		}
		
		@Test
		public void readStoryPitch() {
			
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
















