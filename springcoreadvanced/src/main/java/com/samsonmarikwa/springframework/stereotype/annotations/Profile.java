package com.samsonmarikwa.springframework.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	
	@Value("Java Architect and Instructor")
	private String title;
	
	@Value("My Own Company")
	private String company;

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Profile [title=" + title + ", company=" + company + "]";
	}

}
