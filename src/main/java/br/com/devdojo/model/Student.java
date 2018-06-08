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
	
	public Student() {
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}

	private static void studentRepository() {
		//studentList = new ArrayList<>(Arrays.asList(new Student("Alexandre"), new Student("teste")));
		//Cria lista de Estudantes onde gera nomes aleatórios.
		studentList = new ArrayList<Student>();
	  	int numberOfStudents = 2;
		
	  	for(int i = 1; i < numberOfStudents; i++) {
			Faker faker = new Faker();
			String fakeName = faker.name().fullName();
			studentList.add(new Student(i, fakeName));
	  	}
		
		
		
	}
	

}
