package project.mediatheque.mediatheque.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.mediatheque.mediatheque.DTO.AbonnementDTO;
import project.mediatheque.mediatheque.Entity.Abonnement;
import project.mediatheque.mediatheque.Repository.AbonnementRepo;

@Service
public class AbonnementIMPL implements AbonnementService{

    @Autowired
    private AbonnementRepo abonnementRepo;

    @Override
    public String addAbonnement(AbonnementDTO abonnementDTO) {
        Abonnement abonnement = new Abonnement(
                abonnementDTO.getId(),
                abonnementDTO.getName()
        );
        abonnementRepo.save(abonnement);

        return abonnement.getName();


    }
}
