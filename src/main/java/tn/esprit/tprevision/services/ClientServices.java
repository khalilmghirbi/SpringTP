package tn.esprit.tprevision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tprevision.Entity.Client;
import tn.esprit.tprevision.repositories.ClientRepository;

import java.util.List;

@Service //isna3li instance mil classe hethi
public class ClientServices implements IClientServices {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> retrieveAllClients() {return clientRepository.findAll();}

    @Override
    public Client addClient(Client c) {return clientRepository.save(c);}

    @Override
    public void deleteClient(Long id) {clientRepository.deleteById(id);}

    @Override
    public Client updateClient(Client c) {return clientRepository.save(c);}

    @Override
    public Client retrieveClient(Long id) {return clientRepository.findById(id).orElse(null);}
}
