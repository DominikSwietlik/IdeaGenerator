package ideagenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "ideagenerator")
@EnableJpaRepositories(basePackages = "ideagenerator")
public class IdeaGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdeaGeneratorApplication.class, args);
    }
}