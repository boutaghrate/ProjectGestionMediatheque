package project.mediatheque.mediatheque.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import project.mediatheque.mediatheque.Entity.Abonnement;

@EnableJpaRepositories
@Repository
public interface AbonnementRepo extends JpaRepository<Abonnement,Integer > {
}
