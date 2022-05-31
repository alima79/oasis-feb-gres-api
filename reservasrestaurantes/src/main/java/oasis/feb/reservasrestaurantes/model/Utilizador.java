package oasis.feb.reservasrestaurantes.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Utilizador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "O Atributo USERNAME não pode ser Vazio!")
	@Size(min=2, 
	  max=64,
	  message = "O Numero de caracteres do atributo 'USERNAME' tem de estar entre 2 and 64!")
	@Column(name="username", length=64, nullable = false, unique=false, updatable=true)
	private String userName;
	
	@NotEmpty(message = "O Atributo PASSWORD não pode ser Vazio!")
	@Size(min=8, 
	  max=8,
	  message = "O Numero de caracteres do atributo 'PASSWORD' tem de ser 8!")
	@Column(name="password", length=8, nullable = false, unique=true, updatable=true)
	private String password;
	
	@NotEmpty(message="O Atributo EMAIL não pode ser vazio ou nulo")
	@Email(message="O EMAIL introduzido não Corresponde a um Formato Valido!!!")
	@Column(name= "email", length=320, nullable=false, unique=true, updatable=true)
	private String email;
	
	@Column(name="ativo", nullable=false, unique= false, updatable= true, columnDefinition="boolean default false")
	private Boolean ativo;
	
	@Column(name="create_time", nullable=false, updatable=false, unique=false)
	private LocalDateTime dataCriacao;
	
	@Column(name="last_update", nullable=false, updatable=true, unique=false)
	private LocalDateTime dataUltimaActualizacao;
	
	/* Entidades dos Relacionamentos*/
	@OneToMany(mappedBy="utilizador")
	private List<Reserva> reservas;
	
	
	public Utilizador() {}

	public Utilizador(String userName, 
					  String password, 
					  String email, 
					  Boolean ativo, 
					  LocalDateTime dataCriacao,
					  LocalDateTime dataUltimaActualizacao) {
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.ativo = ativo;
		this.dataCriacao = dataCriacao;
		this.dataUltimaActualizacao = dataUltimaActualizacao;
	}

	public Utilizador(Long id, 
				      String userName, 
				      String password, 
				      String email, 
				      Boolean ativo, 
				      LocalDateTime dataCriacao,
				      LocalDateTime dataUltimaActualizacao) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.ativo = ativo;
		this.dataCriacao = dataCriacao;
		this.dataUltimaActualizacao = dataUltimaActualizacao;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public LocalDateTime getDataCriacao() {
		return this.dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDateTime getDataUltimaActualizacao() {
		return this.dataUltimaActualizacao;
	}

	public void setDataUltimaActualizacao(LocalDateTime dataUltimaActualizacao) {
		this.dataUltimaActualizacao = dataUltimaActualizacao;
	}
	
	

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	@Override
	public String toString() {
		return "Utilizador [id=" + id + 
			   ", userName=" + userName + 
			   ", password=" + password + 
			   ", email=" + email + 
			   ", ativo=" + ativo + 
			   ", dataCriacao=" + dataCriacao + 
			   ", dataUltimaActualizacao=" + dataUltimaActualizacao + "]";
	}	
	

}
