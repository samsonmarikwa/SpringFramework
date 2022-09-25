package com.samsonmarikwa.springframework.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("instr")
@Scope("prototype")
public class Instructor {

	@Value("10")
	private int id;

	@Value("Samson Marikwa")
	private String name;

	@Value("#{topics}")
	private List<String> topics;

	@Autowired
	private Profile profile;

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + "]";
	}

}
