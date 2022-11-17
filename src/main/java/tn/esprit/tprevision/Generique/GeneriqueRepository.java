package tn.esprit.tprevision.Generique;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GeneriqueRepository<T,ID> extends JpaRepository<T, ID> {
}
