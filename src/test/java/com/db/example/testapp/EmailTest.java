package com.db.example.testapp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;

import ch.qos.logback.core.boolex.Matcher;


public class EmailTest {

	
	@Before
	public void beforeTest() {
		Email email = new Email();
		email = null;
		System.gc();
	}
	
	@Test
	public void  testCreateEmail() {
		//fail();
		Email email = new Email();
		String emailidnew = email.getemailId();
		assertTrue((emailidnew).endsWith("@gmail.com"));
	}
	
	@Test
	public void  testEmailSubjectLength() {
		//fail();
		Email email = new Email();
		String emailidsubject = email.getemailSubject();
		int originallength = emailidsubject.length();
		assertTrue(originallength <25 && originallength> 0);
	}
	
	@Test
	public void  testEmailBodyLength() {
		//fail();
		Email email = new Email();
		ArrayList<Character> emailatt= email.getemailBody();

		String emailidsubject = email.getemailSubject();
		int originallength = emailatt.size();
		assertTrue(originallength <100);
	}
	
	@Test()
	public void  testEmailSubjectSpecialChar() {
		//fail();
		Email email = new Email();
		String emailidsubject = email.getemailSubject();
		Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
	      java.util.regex.Matcher match = pattern.matcher(emailidsubject);
	      boolean val = match.find();
	      assertTrue(val);
	}
	@Test(timeout = 3000)
	public void sendemail() {
		
	}

	
}
