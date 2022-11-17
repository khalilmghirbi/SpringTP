package tn.esprit.tprevision.RestController;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tprevision.Entity.Client;
import tn.esprit.tprevision.services.IClientServices;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired //INJECT UN BEAN QUI IMPLEMENT L INTERFACE IEtudiantServices
    IClientServices iClientServices;

    @GetMapping("/getallclient")
    public List<Client> retrieveAllClients() {return iClientServices.retrieveAllClients();}

    @PostMapping("/ajoutclient")
    public Client addClient(@RequestBody Client c) {return iClientServices.addClient(c);}

    @DeleteMapping("/removeclient/{id}")
    public void deleteClient(@PathVariable Long id) {iClientServices.deleteClient(id);}

    @PutMapping("/moddifierclient")
    public Client updateClient(@RequestBody Client c) {return iClientServices.updateClient(c);}

    @GetMapping("/getclientbyid/{id}")
    public Client retrieveClient(@PathVariable Long id) {return iClientServices.retrieveClient(id);}
}
