package br.com.hioktec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration; refatorando usando anotação que criamos
// import org.springframework.context.annotation.Profile; refatorando usando anotação que criamos

// anotação Configuration: informa ao spring boot que esta classe deve ser escaneada como uma classe de configuração
// @Configuration // refatorando usando anotação que criamos a debaixo também.
// @Profile("development") // anotação informando que só é valida para o perfil (profile) de desenvolvimento V2
@Development
public class MinhaConfiguration {

    /* refatorado mais na classe VendasApplication V1
    // anotação Bean: crie este objeto, no caso String, no contexto da aplicação para ser utilizado onde precisar
    @Bean(name = "applicationName")
    public String applicationName() {
        return "Sistema de Vendas";
    }
    */

    @Bean // V2
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }
}
