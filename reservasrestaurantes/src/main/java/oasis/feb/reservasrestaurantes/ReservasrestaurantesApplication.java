package oasis.feb.reservasrestaurantes;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@SpringBootApplication
public class ReservasrestaurantesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservasrestaurantesApplication.class, args);
	}
	
	@Bean
    public RepositoryRestConfigurer repositoryRestConfigurer(EntityManager entityManager) {
        return RepositoryRestConfigurer.withConfig(config -> {
            config.exposeIdsFor(entityManager.getMetamodel().getEntities()
                    .stream().map(Type::getJavaType).toArray(Class[]::new));
        });
    }

}
