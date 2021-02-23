package br.com.hioktec.repository;

import br.com.hioktec.model.Cliente;
import org.springframework.stereotype.Repository;

// Classe repository responsável pelos acessos a base de dados referentes a ... ("clientes", neste caso)
// acessos: salvar, deletar, buscar, etc
@Repository
public class ClientesRepository {

    public void persistir(Cliente cliente) {
        // acessa a base e salva o cliente
    }
}
