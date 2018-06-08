package br.com.devdojo.endpoint;

import org.assertj.core.internal.ErrorMessages;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.devdojo.error.CustomErrorType;
import br.com.devdojo.model.Student;


@RestController //adiciona o responseBody
@RequestMapping("student") //mapeamento para chegar no endpoint.
//@ResponseBody //Manda a requisição no corpo, sem usar view
//@controller - faz com que retorne em uma view.
public class StudentEndpoint {
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> listAll() {
		return new ResponseEntity<>(Student.studentList, HttpStatus.OK);
	}
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable("id") int id){
		
		Student student = new Student();
		student.setId(id);
		int index = Student.studentList.indexOf(student);
		if(index == -1)
			return new ResponseEntity<>(new CustomErrorType("Student not found"), HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<>(Student.studentList.get(index), HttpStatus.OK) ;
	}
	
 
}
