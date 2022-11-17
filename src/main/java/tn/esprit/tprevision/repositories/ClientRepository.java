package tn.esprit.tprevision.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tprevision.Entity.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
