package br.com.devdojo.model;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

public class Student {
	private int id;
	private String name;
	public static List<Student> studentList;
	
	static {
		studentRepository();
	}
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	private static void studentRepository() {
		//studentList = new ArrayList<>(Arrays.asList(new Student("Alexandre"), new Student("teste")));
		//Cria lista de Estudantes onde gera nomes aleatórios.
		studentList = new ArrayList<Student>();
	  	int numberOfStudents = 5;
		
	  	for(int i = 0; i < numberOfStudents; i++) {
			Faker faker = new Faker();
			String fakeName = faker.name().fullName();
			studentList.add(new Student(i, fakeName));
	  	}
		
		
		
	}
	

}
