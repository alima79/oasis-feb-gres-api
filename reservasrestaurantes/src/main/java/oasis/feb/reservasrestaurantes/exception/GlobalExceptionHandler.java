package oasis.feb.reservasrestaurantes.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.validation.ConstraintViolationException;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@RestController
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	//handle specific exception
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<?> handleConstraintViolationException(ConstraintViolationException ex,
																WebRequest request){
		List<ExceptionResponse> erros = new ArrayList<>();
		
		ExceptionResponse errorDetails = new ExceptionResponse(LocalDateTime.now(),
															   "O Seu pedido contem erros. Verifique e volta a tentar. Caso persistir contacto o Administrador!!",
															   ex.getMessage(),
															   ExceptionUtils.getRootCauseMessage(ex),
															     HttpStatus.NOT_FOUND.value()
															  );
		erros.add(errorDetails);		
		return new ResponseEntity<>(erros, HttpStatus.NOT_FOUND);
	}
	
	/*@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException exception,
																WebRequest request){
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), 
																 "Recurso não encontrado",
																 request.getDescription(false));
		return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);		
	}
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<?> handleDataIntegrityViolationException(DataIntegrityViolationException exception,
																WebRequest request){
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), 
																 "Violacao de Integridade da Base de Dados! Reve o seu Pedido! ",
																 request.getDescription(false));
		return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);		
	}
	
	
	//handle Global Exceptions
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleGlobalException(Exception exception,
																WebRequest request){
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), 
																 exception.getMessage(),
																 request.getDescription(false));
		return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);		
	}*/
}
