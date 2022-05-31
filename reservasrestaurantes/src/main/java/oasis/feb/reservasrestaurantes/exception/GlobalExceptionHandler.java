package oasis.feb.reservasrestaurantes.exception;

import java.util.Date;

import javax.validation.ConstraintViolationException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler{
	
	//handle specific exception
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<?> handleConstraintViolationException(ConstraintViolationException exception,
																WebRequest request){
		ExceptionMessage exceptionMessage = new ExceptionMessage(new Date(), 
																 "Erro no pedido! Por favor verifique o seu pedido e volta a tentar.",
																 request.getDescription(false));
		return new ResponseEntity(exceptionMessage, HttpStatus.BAD_REQUEST);		
	}
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException exception,
																WebRequest request){
		ExceptionMessage exceptionMessage = new ExceptionMessage(new Date(), 
																 "Recurso não encontrado",
																 request.getDescription(false));
		return new ResponseEntity(exceptionMessage, HttpStatus.NOT_FOUND);		
	}
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<?> handleDataIntegrityViolationException(DataIntegrityViolationException exception,
																WebRequest request){
		ExceptionMessage exceptionMessage = new ExceptionMessage(new Date(), 
																 "Violacao de Integridade da Base de Dados! Reve o seu Pedido! ",
																 request.getDescription(false));
		return new ResponseEntity(exceptionMessage, HttpStatus.NOT_FOUND);		
	}
	
	
	//handle Global Exceptions
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleGlobalException(Exception exception,
																WebRequest request){
		ExceptionMessage exceptionMessage = new ExceptionMessage(new Date(), 
																 exception.getMessage(),
																 request.getDescription(false));
		return new ResponseEntity(exceptionMessage, HttpStatus.INTERNAL_SERVER_ERROR);		
	}
}
