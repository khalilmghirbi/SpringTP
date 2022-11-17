package tn.esprit.tprevision.services;

import tn.esprit.tprevision.Entity.Client;

import java.util.List;

public interface IClientServices {

    public List<Client> retrieveAllClients();
    public Client addClient(Client c);
    public void deleteClient(Long id);
    public Client updateClient(Client c);
    public Client retrieveClient(Long id);
}
