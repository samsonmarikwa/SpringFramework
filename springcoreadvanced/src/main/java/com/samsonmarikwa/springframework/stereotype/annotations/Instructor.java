package com.samsonmarikwa.springframework.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("instr")
@Scope("prototype")
public class Instructor {

	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id;

	@Value("#{T(java.lang.Integer).MAX_VALUE}")
	private int max;

	@Value("#{new java.lang.String('Samson Marikwa').toUpperCase()}")
	private String name;

	@Value("#{2+4>5}")
	private boolean active;

	@Value("#{topics}")
	private List<String> topics;

	@Value("#{profile.getTitle()}")
	private String title;

	@Autowired
	private Profile profile;

	@Override
	public String toString() {
		return "Instructor [title=" + title + "]";
	}

}
