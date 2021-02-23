package br.com.hioktec.service;

import br.com.hioktec.model.Cliente;
import br.com.hioktec.repository.ClientesRepository;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Classe service deve conter todas as regras de negócios referentes a ... ("clientes", neste caso)
// regras de negócio: validações, relatórios, etc
@Service
public class ClientesService {

    // @Autowired // outra forma de injetar a dependência diretamente no campo, além da via construtor
    private ClientesRepository clientesRepository;

    /* injetando dependencia via construtor com anotação
    @Autowired // injetando ClientesRepository as dependências,
               // instância controlada pelo spring IOC pois a classe está a anotação Repository.
               // injetando via construtor com esta classe está com a anotação Service, não é necessario AutoWired.
    */
    // injetando dependencia via construtor sem anotação
    public ClientesService(ClientesRepository clientesRepository){
        this.clientesRepository = clientesRepository;
    }

    /* outra forma de injetar dependencias com o método set
    @Autowired
    public void setClientesRepository(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }
    */

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        clientesRepository.persistir(cliente);
    }

    private void validarCliente(Cliente cliente){
        // aplica validacoes
    }
}
