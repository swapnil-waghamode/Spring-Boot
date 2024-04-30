package in.ashokit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig implements WebMvcConfigurer {

	@Bean
	public OpenAPI openApi() {
		return new OpenAPI()
				.info(new Info().title("Ticket Booking API").description("IRCTC ticket booking APi").version("1.0")
						.contact(new Contact().name("Swapnil").email("swapnilw8451@gmail.com")
								.url("https://github.com/swapnil-waghamode"))
						.license(new License().name("Apche")))
				.externalDocs(
						new ExternalDocumentation().url("https://spring.io/projects/spring-boot").description("External API"));

	}

}