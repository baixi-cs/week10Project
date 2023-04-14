package com.cogent.Batch65_SpringBootOne.exception;
//
import java.net.http.HttpHeaders;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class EmpExceptionController{
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public @ResponseBody Map<String, String>  handleValidationExceptions(
	  MethodArgumentNotValidException ex) {
	    Map<String, String> errors = new HashMap<>();
	    ex.getBindingResult().getAllErrors().forEach((error) -> {
	        String fieldName = ((FieldError) error).getField();
	        String errorMessage = error.getDefaultMessage();
	        errors.put(fieldName, errorMessage);
	    });
	    return errors;
	}
	
	//Customized Exceptionssss
//	@ExceptionHandler(value = ResourceNotFoundException.class )
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	public @ResponseBody ErrorResponse handleException(ResourceNotFoundException ex) {
//	System.out.println("Exception Caught.....");
//	return new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
//	}
	
	@ExceptionHandler(value = ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	   public ResponseEntity<Object> exception3(ResourceNotFoundException exception) {
	      return new ResponseEntity<>("Resource not found2", HttpStatus.NOT_FOUND);
	   }

	
	
	
	//----------------------------------------------------------------------2nd way
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public ResponseEntity<Object> handleValidationExceptions(
//	 MethodArgumentNotValidException ex) {
//	 Map<String, String> errors = new HashMap<>();
//	 ex.getBindingResult().getAllErrors().forEach((error) -> {
//	 String fieldName = ((FieldError) error).getField();
//	 String errorMessage = error.getDefaultMessage();
//	 errors.put(fieldName, errorMessage);
//	 System.out.println("here......................." +errors);
//	 });
//		return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
//	}
	
	
	
	
	
}


