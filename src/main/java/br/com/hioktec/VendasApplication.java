package br.com.hioktec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // anotação de classe main do spring boot, a que rodamos o no nosso projeto (run)
@RestController // anotação de classe controller do MVC (model view controller)
public class VendasApplication {

    /* explicação comentário abaixo
    @Autowired
    @Qualifier("applicationName") // Autowired e Qualifier para injetar o bean de nome applicationName no campo
    private String applicationName;
    */

    @Value("${application.name}") // usando as configurações do application.properties ao invés do Bean acima
    private String applicationName;

    /* ao invés de fazer assim criamos as anotações Gato e Cachorro
    @Autowired
    @Qualifier("gato")
    */
    @Cachorro
    private Animal animal;

    @Bean(name = "executarAnimal")
    public CommandLineRunner executar(){
        return args -> {
          this.animal.fazerBarulho();
        };
    }

    @GetMapping("/hello")
    public String helloWorld() {
        // return "Hello World";
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
