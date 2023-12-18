package project.mediatheque.mediatheque.Service;

import org.springframework.stereotype.Service;
import project.mediatheque.mediatheque.DTO.AbonnementDTO;

@Service
public interface AbonnementService {

    String addAbonnement(AbonnementDTO abonnementDTO);

}
