package br.com.devdojo.endpoint;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.devdojo.model.Student;


@RestController //adiciona o responseBody
@RequestMapping("student") //mapeamento para chegar no endpoint.
//@ResponseBody //Manda a requisição no corpo, sem usar view
//@controller - faz com que retorne em uma view.
public class StudentEndpoint {
	@RequestMapping(method = RequestMethod.GET, path = "/list")
	public ResponseEntity<?> listAll() {
		
		return new ResponseEntity<>(Student.studentList, HttpStatus.OK);
		
	}
 
}
