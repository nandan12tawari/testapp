package com.db.example.testapp;

import java.util.ArrayList;

public class Email {

	String emailid;
	String emailsubject;
	String emailbody;
	ArrayList<Character> emailatt=new ArrayList<Character>();
	
	public String getemailId() {
		return emailid;
	}
	
	public String getemailSubject() {
		return emailsubject;
	}
	public ArrayList getemailBody() {
		return emailatt;
	}
}
